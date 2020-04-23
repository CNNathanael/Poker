package clases;

import java.time.LocalDate;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narcis
 */
public abstract class Jugador implements Serializable{
    //clase en la que se almacena los datos del jugador
    private String NIF;

    private String nombre_apellidos;

    private double saldo_acumulado;
    
    private LocalDate fecha_nac;   

    public Jugador(String NIF, String nombre_apellidos,LocalDate fecha_nac) {
        //Constructor de jugador
        this.NIF = NIF;
        this.nombre_apellidos = nombre_apellidos;
        this.fecha_nac=fecha_nac;
        this.saldo_acumulado =0;
    }
    public void aumentarSaldo(double saldo){
        setSaldo_acumulado(getSaldo_acumulado()+saldo);
    }
    
    public abstract double retirarBeneficios();        
    
    
    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }
    public double getSaldo_acumulado() {
        return saldo_acumulado;
    }

    public void setSaldo_acumulado(double saldo_acumulado) {
        this.saldo_acumulado = saldo_acumulado;
    }

    public String getNombre_apellidos() {
        return nombre_apellidos;
    }

    public void setNombre_apellidos(String nombre_apellidos) {
        this.nombre_apellidos = nombre_apellidos;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return  "  Con NIF: " + NIF + "  Nombre: " + nombre_apellidos ;
    }

    
}
