/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Jugador;
import Clases.Level;
import Clases.Puntaje;
import Clases.Parametros;
import SQL.SQL;
import Vistas.FrmJugador;
import Vistas.Inicio;
import Vistas.FrmParametros;
import Vistas.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class ParametrosControlador implements ActionListener {
    private SQL SQL;
    private Level level;
    private Puntaje Puntaje;
    private Parametros Parametros;
    private FrmParametros FrmParametros;

    public ParametrosControlador (Puntaje Puntaje, Parametros Parametros, FrmParametros FrmParametros) {
        this.Puntaje = Puntaje;
        this.Parametros = Parametros;
        this.FrmParametros = FrmParametros;
        this.FrmParametros.BtnAgregar.addActionListener(this);
        this.FrmParametros.BtnSiguiente.addActionListener(this);
        

    }
  

    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == FrmParametros.BtnAgregar) {
            Parametros.setColorSnake(FrmParametros.TxtSerpiente.getText());
            Parametros.setColorComida(FrmParametros.TxtComida.getText());
            
            
            if (SQL.RegistrarParametros(Parametros)) {
                JOptionPane.showMessageDialog(null, "Registrado");
                SQL.Score(Puntaje);
                SQL.Level(level);
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");

                }
           }
            
            if (e.getSource() == FrmParametros.BtnSiguiente) {
                Vista vista = new Vista ();
                vista.setVisible(true);
                FrmParametros.setVisible(false);
                
                
            }
            
           
     }
}
