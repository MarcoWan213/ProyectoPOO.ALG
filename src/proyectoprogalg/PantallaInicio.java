/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogalg;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marco
 */
public class PantallaInicio extends javax.swing.JFrame {

    /**
     * Creates new form LupitaLaCascabel y AlondraLaMambaMorenaza y
     * YoSoyELCulebron
     */
    public PantallaInicio() {
        initComponents();
        //this.getContentPane().setBackground(Color.gray);
        //this.setExtendedState(MAXIMIZED_BOTH);
        despintarTabla();
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/fondo.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        m11 = new javax.swing.JTextField();
        m12 = new javax.swing.JTextField();
        m14 = new javax.swing.JTextField();
        m13 = new javax.swing.JTextField();
        m21 = new javax.swing.JTextField();
        m22 = new javax.swing.JTextField();
        m23 = new javax.swing.JTextField();
        m24 = new javax.swing.JTextField();
        m31 = new javax.swing.JTextField();
        m32 = new javax.swing.JTextField();
        m33 = new javax.swing.JTextField();
        m34 = new javax.swing.JTextField();
        m41 = new javax.swing.JTextField();
        m42 = new javax.swing.JTextField();
        m44 = new javax.swing.JTextField();
        m43 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        numMatriz = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        Procedimiento = new javax.swing.JButton();

        jRadioButton2.setText("jRadioButton2");

        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Javanese Text", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("        Metodo de la Inversa");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setText("Inserte el orden de la Matriz:");

        jTextField1.setBackground(new java.awt.Color(153, 204, 255));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ingresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        m11.setEditable(false);
        m11.setBackground(java.awt.Color.gray);
        m11.setBorder(null);
        m11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m11ActionPerformed(evt);
            }
        });

        m12.setEditable(false);
        m12.setBackground(java.awt.Color.gray);
        m12.setBorder(null);

        m14.setEditable(false);
        m14.setBackground(java.awt.Color.gray);
        m14.setBorder(null);

        m13.setEditable(false);
        m13.setBackground(java.awt.Color.gray);
        m13.setBorder(null);

        m21.setEditable(false);
        m21.setBackground(java.awt.Color.gray);
        m21.setBorder(null);

        m22.setEditable(false);
        m22.setBackground(java.awt.Color.gray);
        m22.setBorder(null);

        m23.setEditable(false);
        m23.setBackground(java.awt.Color.gray);
        m23.setBorder(null);

        m24.setEditable(false);
        m24.setBackground(java.awt.Color.gray);
        m24.setBorder(null);

        m31.setEditable(false);
        m31.setBackground(java.awt.Color.gray);
        m31.setBorder(null);

        m32.setEditable(false);
        m32.setBackground(java.awt.Color.gray);
        m32.setBorder(null);

        m33.setEditable(false);
        m33.setBackground(java.awt.Color.gray);
        m33.setBorder(null);

        m34.setEditable(false);
        m34.setBackground(java.awt.Color.gray);
        m34.setBorder(null);

        m41.setEditable(false);
        m41.setBackground(java.awt.Color.gray);
        m41.setBorder(null);

        m42.setEditable(false);
        m42.setBackground(java.awt.Color.gray);
        m42.setBorder(null);

        m44.setEditable(false);
        m44.setBackground(java.awt.Color.gray);
        m44.setBorder(null);

        m43.setEditable(false);
        m43.setBackground(java.awt.Color.gray);
        m43.setBorder(null);

        jButton5.setText("Realizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Matriz de Rango: ");

        numMatriz.setFont(new java.awt.Font("Estrangelo Edessa", 1, 36)); // NOI18N

        jButton7.setText("Resultado");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Procedimiento.setText("Procedimiento");
        Procedimiento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ProcedimientoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Procedimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProcedimientoMouseClicked(evt);
            }
        });
        Procedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcedimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton3)
                                        .addGap(152, 152, 152)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m21, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m41, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m23, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m43, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(m14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(m44, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(358, 358, 358)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton5)))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(202, 202, 202)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(jButton2)
                                .addGap(20, 20, 20)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(numMatriz, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(m21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(m31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(m41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(m22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(m32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(m42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(m23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(m33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(m43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(m24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(m34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(m44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Procedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //Metodo borrar tabla
        despintarTabla();
        despBorder();
        //Boton para crear la tabla

        //Escribe el numero en grande
        String numM = jTextField1.getText();
        numMatriz.setText(numM);

        //Metodo que "crea la tabla"
        apareceTabla();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void m11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Boton para procedimientos de la realizacion de la matriz por el metodo de Kramer
        int tamaño = Integer.parseInt(numMatriz.getText());
        int matriz[][] = new int[tamaño][tamaño];

        switch (tamaño) {
            case 4:
                matriz[3][0] = Integer.parseInt(m41.getText());
                matriz[3][1] = Integer.parseInt(m42.getText());
                matriz[3][2] = Integer.parseInt(m43.getText());
                matriz[3][3] = Integer.parseInt(m44.getText());
                matriz[0][3] = Integer.parseInt(m14.getText());
                matriz[1][3] = Integer.parseInt(m24.getText());
                matriz[2][3] = Integer.parseInt(m34.getText());
                matriz[3][3] = Integer.parseInt(m44.getText());
            case 3:
                matriz[2][0] = Integer.parseInt(m31.getText());
                matriz[2][1] = Integer.parseInt(m32.getText());
                matriz[2][2] = Integer.parseInt(m33.getText());
                matriz[0][2] = Integer.parseInt(m13.getText());
                matriz[1][2] = Integer.parseInt(m23.getText());
            case 2:
                matriz[1][0] = Integer.parseInt(m21.getText());
                matriz[1][1] = Integer.parseInt(m22.getText());
                matriz[0][0] = Integer.parseInt(m11.getText());
                matriz[0][1] = Integer.parseInt(m12.getText());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Algo salio mal");

        }
    
        int det;
        
        det = determinanteMatriz(matriz, 4);
        
        System.out.println(det);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Boton para la pantalla de resultado
        Resultado obj2 = new Resultado();
        obj2.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcedimientoActionPerformed
        // Boton para la pantalla de procedimiento
        Procedimiento pro = new Procedimiento();
        pro.setVisible(true);


    }//GEN-LAST:event_ProcedimientoActionPerformed

    private void ProcedimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProcedimientoMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_ProcedimientoMouseClicked

    private void ProcedimientoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ProcedimientoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ProcedimientoAncestorAdded

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
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio().setVisible(true);
            }
        });
    }

    void despBorder() {
        m11.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m12.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m13.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m14.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m21.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m22.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m23.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m24.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m31.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m32.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m33.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m34.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m41.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m42.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m43.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        m44.setBorder(javax.swing.BorderFactory.createEmptyBorder());

    }

    void despintarTabla() {
        m11.setBackground(new Color(0, 0, 0, 0));
        m12.setBackground(new Color(0, 0, 0, 0));
        m13.setBackground(new Color(0, 0, 0, 0));
        m14.setBackground(new Color(0, 0, 0, 0));
        m21.setBackground(new Color(0, 0, 0, 0));
        m22.setBackground(new Color(0, 0, 0, 0));
        m23.setBackground(new Color(0, 0, 0, 0));
        m24.setBackground(new Color(0, 0, 0, 0));
        m31.setBackground(new Color(0, 0, 0, 0));
        m32.setBackground(new Color(0, 0, 0, 0));
        m33.setBackground(new Color(0, 0, 0, 0));
        m34.setBackground(new Color(0, 0, 0, 0));
        m41.setBackground(new Color(0, 0, 0, 0));
        m42.setBackground(new Color(0, 0, 0, 0));
        m43.setBackground(new Color(0, 0, 0, 0));
        m44.setBackground(new Color(0, 0, 0, 0));
    }

    public static int determinanteMatriz(int x[][], int N) {
        int det = 0;
        switch (N) {
            case 2:
                det = ((x[0][0] * x[1][1]) - (x[1][0] * x[0][1]));
                break;
            case 3:	//Método de Gauss
                det = ((x[0][0]) * (x[1][1]) * (x[2][2]) + (x[1][0]) * (x[2][1]) * (x[0][2]) + (x[2][0]) * (x[0][1]) * (x[1][2])) - ((x[2][0]) * (x[1][1]) * (x[0][2]) + (x[1][0]) * (x[0][1]) * (x[2][2]) + (x[0][0]) * (x[2][1]) * (x[1][2]));
                break;
            default:	//Desarrollo a partir de los elementos de una fila/columna			
                for (int z = 0; z < x.length; z++) {
                    det += (x[z][0] * adj(x, z, 0));
                }
        }
        return det;
    }
    
    public static int adj(int x[][], int i, int j){
		int adjunto;
		int y[][]=new int[x.length-1][x.length-1];
		int m,n;
		for(int k=0;k<y.length;k++){	
			if(k<i){							
				m=k;
			}
			else{
				m=k+1;
			}
			for(int l=0;l<y.length;l++){
				if(l<j){
					n=l;
				}
				else{
					n=l+1;
				}
				y[k][l]=x[m][n];
			}
		}
		adjunto=(int)Math.pow(-1,i+j)*determinanteMatriz(y, y.length);		
		return adjunto;																	
	}

    //Metodo que hace la ilucion de que aparece la tabla
    void apareceTabla() {
        int x = Integer.parseInt(jTextField1.getText());

        switch (x) {
            case 2:
                //Vuelve editable los TextFields
                m11.setEditable(true);
                m12.setEditable(true);
                m21.setEditable(true);
                m22.setEditable(true);
                //Añade los bordes 
                m11.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m12.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m21.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m22.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                //Cambia el color de fondo de las celdas
                m11.setBackground(Color.white);
                m12.setBackground(Color.white);
                m21.setBackground(Color.white);
                m22.setBackground(Color.white);

                break;
            case 3:
                //Vuelve editable los TextFields
                m11.setEditable(true);
                m12.setEditable(true);
                m13.setEditable(true);
                m21.setEditable(true);
                m22.setEditable(true);
                m23.setEditable(true);
                m31.setEditable(true);
                m32.setEditable(true);
                m33.setEditable(true);

                //Añadir los bordes (Pendiente
                m11.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m12.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m13.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m21.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m22.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m23.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m31.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m32.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m33.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                //cambia el color del fondo de las celdas
                m11.setBackground(Color.white);
                m12.setBackground(Color.white);
                m13.setBackground(Color.white);
                m21.setBackground(Color.white);
                m22.setBackground(Color.white);
                m23.setBackground(Color.white);
                m31.setBackground(Color.white);
                m32.setBackground(Color.white);
                m33.setBackground(Color.white);

                break;
            case 4:
                //Vuelve editable los TextFields
                m11.setEditable(true);
                m12.setEditable(true);
                m13.setEditable(true);
                m14.setEditable(true);
                m21.setEditable(true);
                m22.setEditable(true);
                m23.setEditable(true);
                m24.setEditable(true);
                m31.setEditable(true);
                m32.setEditable(true);
                m33.setEditable(true);
                m34.setEditable(true);
                m41.setEditable(true);
                m42.setEditable(true);
                m43.setEditable(true);
                m44.setEditable(true);
                //Añadir los bordes (Pendiente
                m11.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m12.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m13.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m14.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m21.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m22.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m23.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m24.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m31.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m32.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m33.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m34.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m41.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m42.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m43.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                m44.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                //cambia el color del fondo de las celdas
                m11.setBackground(Color.white);
                m12.setBackground(Color.white);
                m13.setBackground(Color.white);
                m14.setBackground(Color.white);
                m21.setBackground(Color.white);
                m22.setBackground(Color.white);
                m23.setBackground(Color.white);
                m24.setBackground(Color.white);
                m31.setBackground(Color.white);
                m32.setBackground(Color.white);
                m33.setBackground(Color.white);
                m34.setBackground(Color.white);
                m41.setBackground(Color.white);
                m42.setBackground(Color.white);
                m43.setBackground(Color.white);
                m44.setBackground(Color.white);

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Procedimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField m11;
    private javax.swing.JTextField m12;
    private javax.swing.JTextField m13;
    private javax.swing.JTextField m14;
    private javax.swing.JTextField m21;
    private javax.swing.JTextField m22;
    private javax.swing.JTextField m23;
    private javax.swing.JTextField m24;
    private javax.swing.JTextField m31;
    private javax.swing.JTextField m32;
    private javax.swing.JTextField m33;
    private javax.swing.JTextField m34;
    private javax.swing.JTextField m41;
    private javax.swing.JTextField m42;
    private javax.swing.JTextField m43;
    private javax.swing.JTextField m44;
    private javax.swing.JLabel numMatriz;
    // End of variables declaration//GEN-END:variables
}
