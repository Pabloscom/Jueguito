/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Pablo
 */
public class Jugador {
    public String NombreJugador;
    public String PaisJugador;

    public Jugador(String NombreJugador, String PaisJugador) {
        this.NombreJugador = NombreJugador;
        this.PaisJugador = PaisJugador;
    }

    public Jugador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public String getNombreJugador() {
        return NombreJugador;
    }

    public void setNombreJugador(String NombreJugador) {
        this.NombreJugador = NombreJugador;
    }

    public String getPaisJugador() {
        return PaisJugador;
    }

    public void setPaisJugador(String PaisJugador) {
        this.PaisJugador = PaisJugador;
    }

    
    
}
