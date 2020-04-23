package clases;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Narcis
 */
public class CasaApuestas implements Serializable {

    private static Jugador_registrado jug_reg;

    public static HashMap<String, Jugador_registrado> jugadores = new HashMap();
    

    

    public static HashMap<String, Jugador_registrado> getJug() {
                
        return jugadores;
    }
    public static Jugador_registrado getSpecifJug(String NIF){
        jug_reg=jugadores.get(NIF);
        return jug_reg;
        
    }
    
    
    public static ArrayList<Carta> ordenCartas(ArrayList<Carta> mano) {

        Comparator PaloComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Carta c1 = (Carta) o1;
                Carta c2 = (Carta) o2;
                return c1.getPalo().compareTo(c2.getPalo());
            }
        };
        Comparator CaraComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Carta c1 = (Carta) o1;
                Carta c2 = (Carta) o2;
                return c1.getCara().compareTo(c2.getCara());
            }
        };

        Collections.sort(mano, PaloComp);
        Collections.sort(mano, CaraComp);
        return mano;
    }

    public static ArrayList<Jugador_registrado> getJugadores() {

        Comparator NIFPerComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Jugador_registrado jr1 = (Jugador_registrado) o1;
                Jugador_registrado jr2 = (Jugador_registrado) o2;
                return jr1.getNIF().compareTo(jr2.getNIF());
            }
        };
        Collection<Jugador_registrado> colec = jugadores.values();
        ArrayList<Jugador_registrado> jugadorList = new ArrayList<>(colec);
        Collections.sort(jugadorList, NIFPerComp);
        return jugadorList;
    }

    public static void altaJugador(String NIF, Jugador_registrado jug_reg) {
        jugadores.put(jug_reg.getNIF(), jug_reg);

    }

    public static void bajaJugador(String NIF) {
        if (jugadores.containsKey(NIF)) {
            Jugador_registrado jugador_baja;
            jugador_baja = jugadores.get(NIF);
            jugador_baja.retirarBeneficios();
            jugadores.remove(NIF);
        }

    }

    /**
     * Carga los datos de personas del fichero
     */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream istreamJug = new FileInputStream("copiasegJug.dat");
            ObjectInputStream oisJug = new ObjectInputStream(istreamJug);
            jugadores = (HashMap) oisJug.readObject();
            istreamJug.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos

    /**
     * Guarda los datos de personas en el fichero
     */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!jugadores.isEmpty()) {
                /**
                 * **** Serialización de los objetos *****
                 */
                //Serialización de las personas
                FileOutputStream ostreamJug = new FileOutputStream("copiasegJug.dat");
                ObjectOutputStream oosJug = new ObjectOutputStream(ostreamJug);
                oosJug.writeObject(jugadores);
                ostreamJug.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos

    public static void generaFactura(Jugador_registrado jug) throws IOException {
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(jug.getNIF() + ".txt")));

        salida.println("-------------------------------- Ficha Jugador Registrado --------------------------------");
        salida.println("\n");
        salida.println("NIF: " + jug.getNIF());
        salida.println("\n");
        salida.println("Nombre y apellidos: " + jug.getNombre_apellidos());
        salida.println("\n");
        salida.println("*** Jugador Registrado ***");
        salida.println("Cuenta Bancaria: " + jug.getNr_cuenta_bancaria());
        salida.println("\n");
        salida.println("Fecha de registro: " + jug.getFecha_reg());
        salida.println("\n");
        salida.println("Dinero retirado e ingresado en la cuenta: " + jug.verSaldoRetirado());
        salida.println("\n");
        salida.println("-------------------------------------------------------------------------------");
        salida.close();
    }

    public Jugador_registrado getJug_reg() {
        return jug_reg;
    }

    public void setJug_reg(Jugador_registrado jug_reg) {
        this.jug_reg = jug_reg;
    }

}
