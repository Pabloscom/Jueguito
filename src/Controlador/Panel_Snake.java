package Controlador;

import Vistas.Inicio;

import Vistas.Vista;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pablo
 */

public class Panel_Snake extends JPanel{
    Color colorSnake;
    Color colorComida;
    int level = 1;
    int tammax,tam,can,resto,sco;
    Vista Vista;
    List<int[]> Snake = new ArrayList<>();
    int [] Comida= new int[2];
    String direccion="de";

    public Panel_Snake(int tammax, int can) { 
        this.colorSnake = Color.green;
        this.colorComida = Color.red;
        this.tammax=tammax;
        this.can=can;
        this.tam=tammax/can;
        this.resto=tammax%can;
        int[] a={can/2-1 , can/2-1};
        int[] b={can/2 , can/2-1};
        Snake.add(a);
        Snake.add(b);
        GenerarComida();
    }
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(colorSnake);
        for(int i=0 ; i < Snake.size() ; i++){  
            
                pintor.fillRect (resto/2+Snake.get(i)[0]*tam ,resto/2+Snake.get(i)[1]*tam , tam-1 , tam-1);
            
        } 
        pintor.setColor(colorComida);
        pintor.fillRect (resto/2+Comida[0]*tam ,resto/2+Comida[1]*tam , tam-1 , tam-1);
        
    }
    
    public void avanzar (){
       int[] ultimo = Snake.get(Snake.size()-1);
       int agregarX=0;
       int agregarY=0;
       switch(direccion){
           case "de": agregarX=level;break;
           case "iz": agregarX=-level;break;
           case "ar": agregarY=-level;break;
           case "ab": agregarY=level;break;
       }
       int[] nuevo = {Math.floorMod(ultimo[0]+agregarX, can),Math.floorMod(ultimo[1]+agregarY, can)};
       
       boolean existe=false;
        for(int i=0; i< Snake.size(); i++){
            if(nuevo[0]==Snake.get(i)[0] && nuevo[1]==Snake.get(i)[1]){
                existe=true;
                break;
            }
        }
        //choca
            if(existe){
                JOptionPane.showMessageDialog(this,"has perdido yu tu puntaje fue: "+sco);
                 sco=0;
                 this.setVisible(false);
                 Inicio Inicio= new Inicio();
                 Inicio.setVisible(true);
                
            }
          
        //no choca
            else{
               if(nuevo[0]==Comida[0] && nuevo[1]==Comida[1]){
                   Snake.add(nuevo);
                   GenerarComida();
                   sco++;
                   if(sco== 10 || sco== 20){
                   JOptionPane.showMessageDialog(this,"Pasaste de nivel! la dificultad aumentara");
                       level=level+1;
                    }    
               }
               else{
                 Snake.add(nuevo);
                 Snake.remove(0);
               }
               
            }   
    }
    

    
    public void GenerarComida(){
        boolean existe=false;
        int a= (int) (Math.random()*can);
        int b= (int) (Math.random()*can);
        
        for (int[] par:Snake){
               if(par[0]==a && par[1]==b){
                   existe=true;
                   GenerarComida();
                   break;
               }
        }
        if (!existe){
            this.Comida[0]=a;
            this.Comida[1]=b;
        }
    }

    public void cambiardireccion(String dir) {
        this.direccion=dir;
    }
  
}   
