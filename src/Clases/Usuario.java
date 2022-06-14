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
public class Usuario {
    public String NombreUS;
    public String ContraseñaUS;

    public String getNombreUS() {
        return NombreUS;
    }

    public void setNombreUS(String NombreUS) {
        this.NombreUS = NombreUS;
    }

    public String getContraseñaUS() {
        return ContraseñaUS;
    }

    public void setContraseñaUS(String ContraseñaUS) {
        this.ContraseñaUS = ContraseñaUS;
    }

    public Usuario(String NombreUS, String ContraseñaUS) {
        this.NombreUS = NombreUS;
        this.ContraseñaUS = ContraseñaUS;
    }
    
    
}
