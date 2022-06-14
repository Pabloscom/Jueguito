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
public class Parametros {
    public String ColorSnake;
    public String ColorComida;

    public String getColorSnake() {
        return ColorSnake;
    }

    public void setColorSnake(String ColorSnake) {
        this.ColorSnake = ColorSnake;
    }

    public String getColorComida() {
        return ColorComida;
    }

    public void setColorComida(String ColorComida) {
        this.ColorComida = ColorComida;
    }

    public Parametros(String ColorSnake, String ColorComida) {
        this.ColorSnake = ColorSnake;
        this.ColorComida = ColorComida;
    }
    
}
