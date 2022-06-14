
package Controlador;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Pablo
 */
public class Panel_fondo extends JPanel{
    Color colorfondo;
    int tammax,tam,can,resto;
    
    public Panel_fondo(int tammax, int can) { 
        this.colorfondo = Color.gray;
        this.tammax=tammax;
        this.can=can;
        this.tam=tammax/can;
        this.resto=tammax%can;
    }
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(colorfondo);
        for(int i=0 ; i < can ; i++){
            for(int j=0 ; j < can ; j++){
                pintor.fillRect (resto/2+i*tam,resto/2+j*tam,tam-1,tam-1);
            }
        } 
        
    }
}   
