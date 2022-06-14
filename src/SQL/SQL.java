/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import SQL.Conexion;
import Clases.Jugador;
import Clases.Level;
import Clases.Parametros;
import Clases.Puntaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Pablo
 */
public class SQL extends Conexion {
    public boolean RegistrarJugador(Jugador bJugador) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO Jugador (NombreJugador, PaisJugador) VALUES(?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, bJugador.getNombreJugador());
            ps.setString(2, bJugador.getPaisJugador());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    public boolean RegistrarParametros(Parametros bParametros) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO Parametros (ColorSnake, ColorComida) VALUES(?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, bParametros.getColorSnake());
            ps.setString(2, bParametros.getColorComida());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
     public boolean Score(Puntaje bPuntaje) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO puntajes (PuntajesJugador) VALUES(1)";
        return false;
    
    }
    
    public boolean Level(Level bLevel) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO level (Level) VALUES(1)";
        return false;
    
    }
    
    public boolean EliminarJugador(Jugador tJugador) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM Jugador WHERE NombreJugador = ? and PaisJugador = ? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tJugador.getNombreJugador());
            ps.setString(2, tJugador.getPaisJugador());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
     
}
