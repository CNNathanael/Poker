/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Narcis
 */
public class Premio implements Serializable {
    
    private String tipoPremio;
    
    private double importe;
    
    private String tipoJuego;
    
    private Jugador_registrado jug;
    
    public static ArrayList<String> tipoPremioAL=new ArrayList();
    public static ArrayList<Jugador_registrado> ganadorPareja=new ArrayList();
    public static ArrayList<Jugador_registrado> ganadorDoblePareja=new ArrayList();
    public static ArrayList<Jugador_registrado> ganadorTrio=new ArrayList();
    public static ArrayList<Jugador_registrado> ganadorColor=new ArrayList();
    public static ArrayList<Jugador_registrado> ganadorFull=new ArrayList();
    public static ArrayList<Jugador_registrado> ganadorPoker=new ArrayList();
    public static ArrayList<String> premioMesa=new ArrayList();
    public static ArrayList<String> premioIndividual=new ArrayList();
    
    public static ArrayList<String> getTipoPremioAL(){
        return tipoPremioAL;
    }
    
    
    public Premio(String tipoPremio, double importe, String tipoJuego, Jugador_registrado jug) {
        this.tipoPremio = tipoPremio;
        this.importe = importe;
        this.tipoJuego = tipoJuego;
        this.jug = jug;
        tipoPremioAL.add(tipoPremio);
        if (tipoPremio.equals("Pareja")){
            if(!ganadorPareja.contains(jug)){
                ganadorPareja.add(jug);
            }
        }
        else if (tipoPremio.equals("Doble Pareja")){
            if(!ganadorDoblePareja.contains(jug)){
                ganadorDoblePareja.add(jug);
            }
        }
        else if (tipoPremio.equals("Trío")){
            if(!ganadorTrio.contains(jug)){
                ganadorTrio.add(jug);
            }
        }
        else if (tipoPremio.equals("Color")){
            if(!ganadorColor.contains(jug)){
                ganadorColor.add(jug);
            }
        }
        else if (tipoPremio.equals("Full")){
            if(!ganadorFull.contains(jug)){
                ganadorFull.add(jug);
            }
        }
        else if (tipoPremio.equals("Póker")){
            if(!ganadorPoker.contains(jug)){
                ganadorPoker.add(jug);
            }
        }
        if (tipoJuego.equals("Mesa")){
            premioMesa.add(tipoPremio);
        }
        else if (tipoJuego.equals("Individual")){
            premioIndividual.add(tipoPremio);
            
        }
        
    }
    

    public Jugador_registrado getJug() {
        return jug;
    }

    public void setJug(Jugador_registrado jug) {
        this.jug = jug;
    }     

    public String getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }


    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }


    public String getTipoPremio() {
        return tipoPremio;
    }

    public void setTipoPremio(String tipoPremio) {
        this.tipoPremio = tipoPremio;
    }

    
}
