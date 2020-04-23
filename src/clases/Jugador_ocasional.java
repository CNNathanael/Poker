package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
public class Jugador_ocasional extends Jugador implements Serializable{ //clase hija que hereda de Jugador
    
    private int nr_tarjeta_credito;

    public Jugador_ocasional(String NIF, String nombre_apellidos,LocalDate fecha_nac,int nr_tarjeta_credito) {
        //Constructor de jugador ocasional que hereda de jugador      
        super(NIF,nombre_apellidos,fecha_nac); // se usan los atributos de la clase padre Jugador
        this.nr_tarjeta_credito = nr_tarjeta_credito;
    }
    @Override
    public double retirarBeneficios(){
        System.out.println("Has retirado:"+getSaldo_acumulado()+"€");
        setSaldo_acumulado(0);
        return getSaldo_acumulado();
    }
        
    public int getNr_tarjeta_credito() {
        return nr_tarjeta_credito;
    }

    public void setNr_tarjeta_credito(int nr_tarjeta_credito) {
        this.nr_tarjeta_credito = nr_tarjeta_credito;
    }

    @Override
    public String toString() {
        return "El jugador ocasional:" + super.toString()+ "  N� Tarjeta de Cr�dito: " + nr_tarjeta_credito ;
    }

    
}
