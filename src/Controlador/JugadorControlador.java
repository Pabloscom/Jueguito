/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Jugador;
import Clases.Puntaje;
import SQL.Conexion;
import SQL.SQL;
import Vistas.FrmJugador;
import Vistas.Inicio;
import Vistas.FrmParametros;
import Vistas.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class JugadorControlador implements ActionListener {
    Conexion c= new Conexion();
    Connection con = c.getConexion();
    
    private SQL SQL;
    private Puntaje Puntaje;
    private Jugador Jugador;
    private FrmJugador FMKJugador;

    public JugadorControlador(Puntaje Puntaje, Jugador Jugador, FrmJugador FMKJugador) {
        this.Puntaje = Puntaje;
        this.Jugador = Jugador;
        this.FMKJugador = FMKJugador;
        this.FMKJugador.BtnAgregar.addActionListener(this);
        this.FMKJugador.BtnSiguiente.addActionListener(this);
        

    }

    public JugadorControlador(Jugador tPais, SQL Cpais, FrmJugador frm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == FMKJugador.BtnAgregar) {
            Jugador.setNombreJugador(FMKJugador.TxtNombre.getText());
            Jugador.setPaisJugador(FMKJugador.TxtPais.getText());
           
            if (SQL.RegistrarJugador(Jugador)) {
                JOptionPane.showMessageDialog(null, "Registrado");
                SQL.Score(Puntaje);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");

                }
           }
            
          
            
           
     }
    
}
