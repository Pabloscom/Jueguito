
package Vistas;

import Controlador.Panel_Snake;
import Controlador.Panel_fondo;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Pablo
 */
public class Vista extends javax.swing.JFrame {
   
   Panel_Snake Snake;
    String score;
    public Vista() {
        initComponents();
        
        
        
        Snake= new Panel_Snake(500,20);
        this.add(Snake);
        Snake.setBounds(10,10,800,800);
        Snake.setOpaque(false);
        setResizable(false);
        
        this.setLocationRelativeTo(null);
        Panel_fondo fondo= new Panel_fondo(500,20);
        this.add(fondo);
        fondo.setBounds(10,10,800,800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnArriba = new javax.swing.JButton();
        BtnIzquierda = new javax.swing.JButton();
        BtnDerecha = new javax.swing.JButton();
        BtnAbajo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake");

        btnArriba.setText("Arriba");
        btnArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaActionPerformed(evt);
            }
        });

        BtnIzquierda.setText("Izquierda");
        BtnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIzquierdaActionPerformed(evt);
            }
        });

        BtnDerecha.setText("Derecha");
        BtnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDerechaActionPerformed(evt);
            }
        });

        BtnAbajo.setText("Abajo");
        BtnAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbajoActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnAbajo)
                            .addComponent(btnArriba)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(BtnIzquierda)
                        .addGap(80, 80, 80)
                        .addComponent(BtnDerecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDerecha)
                    .addComponent(BtnIzquierda)
                    .addComponent(jButton1))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addComponent(btnArriba)
                .addGap(57, 57, 57)
                .addComponent(BtnAbajo)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDerechaActionPerformed
        Snake.cambiardireccion("de");
        Snake.avanzar();
        Snake.repaint();
        
    }//GEN-LAST:event_BtnDerechaActionPerformed

    private void BtnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIzquierdaActionPerformed
        Snake.cambiardireccion("iz");
        Snake.avanzar();
        Snake.repaint();    }//GEN-LAST:event_BtnIzquierdaActionPerformed

    private void btnArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaActionPerformed
        Snake.cambiardireccion("ar");
        Snake.avanzar();
        Snake.repaint();
    }//GEN-LAST:event_btnArribaActionPerformed

    private void BtnAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbajoActionPerformed
        Snake.cambiardireccion("ab");
        Snake.avanzar();
        Snake.repaint();
        
    }//GEN-LAST:event_BtnAbajoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
//    public void score (int sco){
//        this.score=Integer.toString(sco);
//        TextoPuntaje.setText(score);
//    }
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnAbajo;
    public javax.swing.JButton BtnDerecha;
    public javax.swing.JButton BtnIzquierda;
    public javax.swing.JButton btnArriba;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
   class fondo extends JPanel {
        private Image imagen;
        
        public void paint (Graphics g){
            imagen = new ImageIcon (getClass().getResource("fondo.jpg")).getImage();
            g.drawImage(imagen,0,0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }
}