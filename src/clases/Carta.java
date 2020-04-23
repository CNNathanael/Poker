package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Narcis
 */
public class Carta implements Serializable {

    private String cara;

    private String palo;

    public static final String[] PALOS = {"Oros", "Copas", "Espadas", "Bastos"};
    public static final String[] CARAS = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Sota", "Caballo", "Rey"};
    
    public Carta(String cara, String palo) {
        this.cara = cara;
        this.palo = palo;
    }
    
    public enum ordenCaras {
        As, Dos, Tres, Cuatro, Cinco, Seis, Siete, Ocho, Nueve, Sota, Caballo, Rey
    }
    public ordenCaras caras;

    public static ArrayList<Carta> ordenarCartas(ArrayList<Carta> mano) {
        Comparator CaraComp = new Comparator() {

            public int compareTo(Carta c1, Carta c2) {
                if (c1.caras.ordinal() < c2.caras.ordinal()) {
                    return 1;
                } else if (c1.caras.ordinal() > c2.caras.ordinal()) {
                    return -1;
                } else {
                    return 1;
                }
            }

            @Override
            public int compare(Object o1, Object o2) {
                Carta c1 = (Carta) o1;
                Carta c2 = (Carta) o2;
                return c1.getCara().compareTo(c2.getCara());
            }
                
            
        };
        Collections.sort(mano, CaraComp);
        return mano;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getCara() {
        return cara;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    @Override
    public String toString() {
        return cara + " de " + palo;
    }

}
