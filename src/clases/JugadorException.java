package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narcis
 */
public class JugadorException extends Exception {
    
    public static final String SALDO_INSUFICIENTE = "No se dispone de saldo para realizar la apuesta.";  
    public static final String NIF_INCORRECTO = "El NIF proporcionado no corresponde a ningún jugador registrado.";  
    public static final String CONTRASENA_INCORRECTA = "La contraseña no es correcta.";  
    public static final String EDAD_INCORRECTA = "El jugador debe ser mayor de edad para poder jugar";
    public JugadorException() {
        super("Se ha producido una excepción en la aplicación.");
    }
    public JugadorException (String txt){
        super(txt);
    }
} 
    

