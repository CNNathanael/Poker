package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.*;
import ventanas.*;

/**
 *
 * @author Narcis
 */
public class Apuesta implements Serializable {

    //Un arraylist que contendrá las 5 Cartas de la mano actual.
    private ArrayList<Carta> mano;

    private Baraja baraja;//Se necesita una asociación con la baraja para conseguir la mano.

    private Carta carta;// Se necesita una asociación con la clase Carta

    private double cantidad;

    private Jugador jugador;
    private Jugador_registrado jug_reg,jug_regM;
    private Jugador_ocasional jug_oc;
    private ArrayList<Jugador_registrado> jugadorList = new ArrayList();

    public Apuesta(double cantidad, ArrayList<Carta> mano) {
        //El constructor de la clase apuesta que contiene la mano del jugador y la cantidad apostada
        this.mano = mano;
        this.cantidad = cantidad;
        jugadorList = CasaApuestas.getJugadores();
        jug_reg = VentanaJugarIndividual.getJugPlaying();
        jug_oc = VentanaJugarOcasional.getJugOcPlaying();
        jug_regM=VentanaJugarMesa.getJugPlayingM();
    }

    public static int verPremioMesa(ArrayList<Carta> mano) {
        int nr;
        nr = colorM(mano);
        nr = pokerM(mano);
        nr = fullM(mano);
        nr = trioM(mano);
        nr = dobleParejaM(mano);
        nr = parejaM(mano);
        
        return nr;
        
            
        
    }
    public String verPremioEstad(ArrayList<Carta> mano){
        if (verPremioMesa(mano)==1){
            return "Pareja";
        }
        else if(verPremioMesa(mano)==2){
            return "Doble Pareja";
        }
        else if(verPremioMesa(mano)==3){
            return "Trío";
        }
        else if(verPremioMesa(mano)==4){
            return "Color";
        }
        else if(verPremioMesa(mano)==5){
            return "Full";
        }
        else if(verPremioMesa(mano)==6){
            return "Póker";
        }
        else return "Nada";
    }

    public void verPremio(ArrayList<Carta> mano) {
        //Método para ver el premio de la mano
        int nr_premio;

        nr_premio = color(mano);
        nr_premio = poker(mano);
        nr_premio = full(mano);
        nr_premio = trio(mano);
        nr_premio = doblePareja(mano);
        nr_premio = pareja(mano);
        if (nr_premio == 0) {
            System.out.println("No hay premio");
        }

    }

    public int color(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido color
        int contador = 0;
        //Recorreremos el array dos veces para ir comparando cada carta con todas las demás
        //El contador indica las veces que coinciden los palos de las cartas. Para que sea color necesitan coincidir 20veces
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getPalo().equals(mano1.getPalo())) {
                        contador++;
                    }
                }
            }
        }
        if (contador == 20) {
            System.out.println("Color");
            if (jugadorList.contains(jug_reg)) {

                jug_reg.aumentarSaldo(cantidad * 6);
            } 
            else if(jugadorList.contains(jug_regM)){
                jug_regM.aumentarSaldo(cantidad*6);
            }
            else {
                jug_oc.aumentarSaldo(cantidad * 4);
            }

            return 4;
        } else {
            return 0;
        }
    }
    public static int colorM(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido color
        int contador = 0;
        //Recorreremos el array dos veces para ir comparando cada carta con todas las demás
        //El contador indica las veces que coinciden los palos de las cartas. Para que sea color necesitan coincidir 20veces
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getPalo().equals(mano1.getPalo())) {
                        contador++;
                    }
                }
            }
        }
        if (contador == 20) {
            
            
            return 4;
        } else {
            return 0;
        }
    }

    public int poker(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido un póker
        int contador = 0;
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getCara().equals(mano1.getCara())) {
                        contador++;
                    }
                }
            }
        }
        if (contador == 12) {
            System.out.println("Póker");
            if (jugadorList.contains(jug_reg)) {

                jug_reg.aumentarSaldo(cantidad * 10);
            } else {
                jug_oc.aumentarSaldo(cantidad * 6);
            }
            return 6;
        } else {
            return 0;
        }
    }
    public static int pokerM(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido un póker
        int contador = 0;
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getCara().equals(mano1.getCara())) {
                        contador++;
                    }
                }
            }
        }
        if (contador == 12) {
           
            
            return 6;
        } else {
            return 0;
        }
    }
    public int full(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido un full
        int contador = 0;
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getCara().equals(mano1.getCara())) {
                        contador++;
                    }
                }

            }
        }
        if (contador == 8) {
            System.out.println("Full");
            if (jugadorList.contains(jug_reg)) {

                jug_reg.aumentarSaldo(cantidad * 8);
            } else {
                jug_oc.aumentarSaldo(cantidad * 5);
            }

            return 5;
        } else {
            return 0;
        }
    }
    public static int fullM(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido un full
        int contador = 0;
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getCara().equals(mano1.getCara())) {
                        contador++;
                    }
                }

            }
        }
        if (contador == 8) {
            
            
            return 5;
        } else {
            return 0;
        }
    }
    public int trio(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido un full
        int contador = 0;
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getCara().equals(mano1.getCara())) {
                        contador++;
                    }
                }

            }
        }
        if (contador == 6) {
            System.out.println("Trío");
            if (jugadorList.contains(jug_reg)) {

                jug_reg.aumentarSaldo(cantidad * 4);
            } else {
                jug_oc.aumentarSaldo(cantidad * 3);
            }

            return 3;
        } else {
            return 0;
        }
    }
    public static int trioM(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido un full
        int contador = 0;
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getCara().equals(mano1.getCara())) {
                        contador++;
                    }
                }

            }
        }
        if (contador == 6) {
            
            
            return 3;
        } else {
            return 0;
        }
    }

    public int doblePareja(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido un full
        int contador = 0;
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getCara().equals(mano1.getCara())) {
                        contador++;
                    }
                }

            }
        }
        if (contador == 4) {
            System.out.println("Doble Pareja");
            if (jugadorList.contains(jug_reg)) {
                jug_reg.aumentarSaldo(cantidad * 2);

            } else {
                jug_oc.aumentarSaldo(cantidad * 2);
            }
            return 2;
        } else {
            return 0;
        }
    }
    public static int dobleParejaM(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido un full
        int contador = 0;
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getCara().equals(mano1.getCara())) {
                        contador++;
                    }
                }

            }
        }
        if (contador == 4) {
            
            
            return 2;
        } else {
            return 0;
        }
    }
    public int pareja(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido un full
        int contador = 0;
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getCara().equals(mano1.getCara())) {
                        contador++;
                    }
                }

            }
        }
        if (contador == 2) {
            System.out.println("Pareja");
            if (jugadorList.contains(jug_reg)) {
                jug_reg.aumentarSaldo(cantidad);

            } 
            else if (jugadorList.contains(jug_regM)){
                jug_regM.aumentarSaldo(cantidad);
            }
            else {
                jug_oc.aumentarSaldo(cantidad);
            }
            return 1;
        } else {
            return 0;
        }
    }
     public static int parejaM(ArrayList<Carta> mano) {
        //Método que comprueba si se ha conseguido un full
        int contador = 0;
        for (Carta mano1 : mano) {
            for (Carta mano2 : mano) {
                if (mano2 != mano1) {
                    if (mano2.getCara().equals(mano1.getCara())) {
                        contador++;
                    }
                }

            }
        }
        if (contador == 2) {
            
            
            return 1;
        } else {
            return 0;
        }
    }
    public void verMano(ArrayList<Carta> mano) {
        //Método con el que se puede ver la mano de la apuesta actual
        System.out.println(mano);
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    public Baraja getBaraja() {
        return baraja;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(ArrayList<Carta> mano) {
        this.mano = mano;
    }

}
