/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneltpu;

import Modelo.Almacen;
import Modelo.Claveprov;
import Modelo.Dureza;
import Modelo.Materiales;
import Modelo.Unidades;
import Modelo.Usuarios;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author GATEWAY1-
 */
public class NuevomatPedimento extends javax.swing.JDialog {

    ArrayList<Unidades> arrunidad = new ArrayList<>();
    ArrayList<Claveprov> arrclave = new ArrayList<>();
    public Connection cpt, rcpt;
    public Connection litecfdi;
    public ArrayList<Materiales> arrmat = new ArrayList<>();
    ArrayList<Almacen> arralm = new ArrayList<>();
    private Materiales mat;
    ArrayList<Dureza> arrdur = new ArrayList<>();
    public Usuarios u;

    /**
     * Creates new form Nuevomaterial
     */
    public NuevomatPedimento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        JtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JcSat = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        JtCantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JcAlmacen = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        JcDureza = new javax.swing.JComboBox<>();
        JlUnidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bordemorado.png")))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Dureza de producto");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Costo");

        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JtPrecio.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        JtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtPrecio.setBorder(null);
        JtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        JtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtPrecioMousePressed(evt);
            }
        });
        JtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtPrecioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Producto");

        JcSat.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        JcSat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JcSatItemStateChanged(evt);
            }
        });
        JcSat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JcSatMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ic_send_128_28719.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cancel_icon-icons.com_54824.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JtCantidad.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        JtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtCantidad.setBorder(null);
        JtCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        JtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtCantidadMousePressed(evt);
            }
        });
        JtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtCantidadActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Cantidad");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Almacen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 657, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(JlUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator3)
                                    .addComponent(JtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator4)
                                    .addComponent(JtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(JcAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JcDureza, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JcSat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(JlUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addComponent(JcSat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JcDureza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel9)
                .addGap(7, 7, 7)
                .addComponent(JcAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setcombos() {
        DefaultComboBoxModel mate = new DefaultComboBoxModel();
        DefaultComboBoxModel almc = new DefaultComboBoxModel();
        DefaultComboBoxModel dur = new DefaultComboBoxModel();
        for (Materiales arrmat1 : arrmat) {
            String desc = (u.getTurno().equals("5")) ? arrmat1.getDescripcion()
                    : arrmat1.getDescripcion() + " - " + arrmat1.getNoserie();
            mate.addElement(desc);
        }
        for (Almacen arrmat1 : arralm) {
            almc.addElement(arrmat1.getNombre());
        }
        for (Dureza arrmat1 : arrdur) {
            dur.addElement(arrmat1.getDureza());
        }
        JcAlmacen.setModel(almc);
        JcSat.setModel(mate);
        JcDureza.setModel(dur);
    }

    private void JtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtPrecioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtPrecioMousePressed

    private void JtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtPrecioActionPerformed
        JtCantidad.requestFocus();
    }//GEN-LAST:event_JtPrecioActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        mat = new Materiales();
        mat.setDescripcion("");
        dispose();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        setmaterial();
    }//GEN-LAST:event_jLabel1MousePressed

    private void JtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtCantidadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtCantidadMousePressed

    private void JtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtCantidadActionPerformed
        setmaterial();
    }//GEN-LAST:event_JtCantidadActionPerformed

    private void JcSatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JcSatMousePressed

    }//GEN-LAST:event_JcSatMousePressed

    private void JcSatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JcSatItemStateChanged
        mostrarunidad();
    }//GEN-LAST:event_JcSatItemStateChanged
    /**
     * Agrega el material en un objeto de tipo material y al termino se pasa el
     * dato al arraylist
     */
    private void setmaterial() {
        boolean band = verificafloat(JtPrecio.getText());
        boolean band1 = verificafloat(JtCantidad.getText());
        if (!band) {
            JtPrecio.requestFocus();
            JtPrecio.setText("");
        }
        if (!band1) {
            JtCantidad.requestFocus();
            JtCantidad.setText("");
        }
        if (band && band1) {
            mat = new Materiales();
            mat.setId_material(arrmat.get(JcSat.getSelectedIndex()).getId_material());
            mat.setCosto(Double.parseDouble(JtPrecio.getText()));
            mat.setPrecio(arrmat.get(JcSat.getSelectedIndex()).getPrecio());
            mat.setCantidad(Double.parseDouble(JtCantidad.getText()));
            mat.setDureza(arrdur.get(JcDureza.getSelectedIndex()).getDureza());
            mat.setDescripcion(arrmat.get(JcSat.getSelectedIndex()).getDescripcion());
            mat.setId_almacen(arralm.get(JcAlmacen.getSelectedIndex()).getAlmacen());
            mat.setUnidad(arrmat.get(JcSat.getSelectedIndex()).getUnidad());
            if(u.getTurno().equals("5")){
                mat.setMaterialpedimento(arrmat.get(JcSat.getSelectedIndex()).getDescripcion() + " " + arrdur.get(JcDureza.getSelectedIndex()).getDureza());
            }else{
                mat.setMaterialpedimento(arrmat.get(JcSat.getSelectedIndex()).getTipo_maquina() + " " + arrdur.get(JcDureza.getSelectedIndex()).getDureza());
            }
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error al capturar alguno de los datos, intentalo de nuevo");
        }

    }

    public Materiales getmaterial() {
        return mat;
    }

    /**
     * Formatear para que no tome en cuenta los espacios
     *
     * @param mat
     * @return
     */
    private String getmatformat(String mat) {
        String resp = "";
        for (int i = 0; i < mat.length(); i++) {
            String caracter = mat.charAt(i) + "";
            if (!caracter.equals(" ")) {
                resp += caracter;
            }
        }
        return resp;
    }

    private boolean verificafloat(String cad) {
        boolean resp = false;
        String patt = "[0-9]+||[0-9]+.[0-9]+";
        Pattern pat = Pattern.compile(patt);
        Matcher match = pat.matcher(cad);
        if (match.matches()) {
            resp = true;
        }
        return resp;
    }

    private void mostrarunidad() {
        if (!u.getTurno().equals("5")) {
            String val = arrmat.get(JcSat.getSelectedIndex()).getUnidad() + ", " + arrmat.get(JcSat.getSelectedIndex()).getNoserie();
            JlUnidad.setText(val);
        } else {
            JlUnidad.setText(arrmat.get(JcSat.getSelectedIndex()).getUnidad());
        }
    }

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
            java.util.logging.Logger.getLogger(NuevomatPedimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevomatPedimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevomatPedimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevomatPedimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NuevomatPedimento dialog = new NuevomatPedimento(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcAlmacen;
    private javax.swing.JComboBox<String> JcDureza;
    private javax.swing.JComboBox<String> JcSat;
    private javax.swing.JLabel JlUnidad;
    public javax.swing.JTextField JtCantidad;
    public javax.swing.JTextField JtPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
