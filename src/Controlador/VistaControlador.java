/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Puntaje;
import Clases.Jugador;
import Vistas.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pablo
 */
public class VistaControlador implements ActionListener {
    private Puntaje Puntaje;
    private Jugador Jugador;
    private Vista frm;

    public VistaControlador(Puntaje Puntaje, Jugador Jugador, Vista frm) {
        this.Puntaje = Puntaje;
        this.Jugador = Jugador;
        this.frm = frm;
//        this.frm.btnArriba.addActionListener(this);
//        this.frm.BtnAbajo.addActionListener(this);
//        this.frm.BtnIzquierda.addActionListener(this);
//        this.frm.BtnDerecha.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
