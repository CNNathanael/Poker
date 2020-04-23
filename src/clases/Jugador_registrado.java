package clases;


import java.io.IOException;
import java.time.LocalDate;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narcis
 */
public class Jugador_registrado extends Jugador implements Serializable{ //clase hija que hereda de Jugador
    
    private String nr_cuenta_bancaria;
    
    private String contrasena;
    
    private LocalDate fecha_reg;    

    public Jugador_registrado(String NIF, String nombre_apellidos,LocalDate fecha_nac,String nr_cuenta_bancaria,String contrasena, LocalDate fecha_reg) {
        //Constructor de jugador registrado que hereda de jugador       
        super(NIF,nombre_apellidos,fecha_nac); // se usan los atributos de la clase padre Jugador
        this.nr_cuenta_bancaria = nr_cuenta_bancaria;
        this.contrasena=contrasena;   
        this.fecha_reg=fecha_reg;
       
    }
    
    @Override
    public double retirarBeneficios() {
        double saldo_extra;
        double saldo_actual;
        double tiempo;        
        LocalDate fecha_ahora= LocalDate.now();             
        tiempo=fecha_ahora.getYear()-fecha_reg.getYear();
        saldo_actual=getSaldo_acumulado();
        saldo_extra=saldo_actual*0.02*tiempo;        
        setSaldo_acumulado(saldo_actual+saldo_extra);
        System.out.println("Se ha retirado:"+getSaldo_acumulado()+"€");        
        verSaldoRetirado();
        setSaldo_acumulado(0);
        return saldo_extra+saldo_actual;
        
    }
    
    
    public double verSaldoRetirado(){
        return getSaldo_acumulado();
    }
    public LocalDate getFecha_reg() {
        return fecha_reg;
    }

    public void setFecha_reg(LocalDate fecha_reg) {
        this.fecha_reg = fecha_reg;
    }


    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getNr_cuenta_bancaria() {
        return nr_cuenta_bancaria;
    }

    public void setNr_cuenta_bancaria(String nr_cuenta_bancaria) {
        this.nr_cuenta_bancaria = nr_cuenta_bancaria;
    }

    @Override
    public String toString() {
        return "El jugador registrado:" + super.toString()+ "  Cuenta Bancaria:" + nr_cuenta_bancaria + "Fecha de registro:"+fecha_reg;
    }
    
    
}
