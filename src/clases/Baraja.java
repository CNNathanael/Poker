package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Narcis
 */
public class Baraja implements Serializable {
  
    private final ArrayList<Carta> cartas;// Un array de Cartas que forman la baraja

    public Baraja() {
        //Constructor de la baraja
        cartas=  new ArrayList<>();   
        crearBaraja();      
    }
    
    
    private void crearBaraja(){
        //Método con el que se crea la baraja y se añade cada carta al arraylist
        String[] palos= Carta.PALOS;
        String[] caras= Carta.CARAS;
                
        for (String palo : palos) {
            for (String cara : caras) {
                Carta c1= new Carta(cara,palo);
                cartas.add(c1);
            }
        }
    }
        
    public ArrayList<Carta> crearMano(){
        //Método en el que se mezcla la baraja y se obtiene la mano con 5 cartas aleatorias no repetidas
        Collections.shuffle(cartas);
        ArrayList<Carta> mano;
        mano= new ArrayList<>();
        Random rnd = new Random();
        Carta nuevo = null;
        while (mano.size()<5){
            nuevo=cartas.get(rnd.nextInt(48));
            if (!mano.contains(nuevo))
                mano.add(nuevo);
        }
        return mano;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }
    





    
}





