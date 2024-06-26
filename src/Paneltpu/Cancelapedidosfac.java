/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneltpu;

import DAO.daoConceptos;
import DAO.daoDevolucion;
import DAO.daokardexrcpt;
import Modelo.ConceptosES;
import Modelo.Ddevolucion;
import Modelo.Devolucion;
import Modelo.Motivosdev;
import Modelo.Usuarios;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GATEWAY1-
 */
public class Cancelapedidosfac extends javax.swing.JDialog {

    public Connection cpt, cob;
    public Connection litecfdi;
    public int concepto;
    int iddoc = 0;
    int id_cliente = 0;
    String nombre;
    Usuarios u;
    ArrayList<ConceptosES> arrc = new ArrayList<>();
    ArrayList<Motivosdev> arrm = new ArrayList<>();
    ArrayList<Ddevolucion> arrd = new ArrayList<>();

    /**
     * Creates new form Nuevomaterial
     */
    public Cancelapedidosfac(java.awt.Frame parent, boolean modal) {
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
        JlNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JlFolio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtDetalle = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        JcMotivo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JtObservaciones = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        JlCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bordemorado.png")))); // NOI18N

        JlNombre.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N

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

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Cancelacion de Facturas");

        jLabel9.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel9.setText("#");

        JlFolio.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        JlFolio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        JtDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JtDetalle.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        JtDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtDetalleMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(JtDetalle);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Motivo");

        JcMotivo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        JcMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcMotivoActionPerformed(evt);
            }
        });

        JtObservaciones.setColumns(20);
        JtObservaciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JtObservaciones.setRows(5);
        jScrollPane2.setViewportView(JtObservaciones);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("Observaciones");

        JlCuenta.setFont(new java.awt.Font("Calibri", 2, 12)); // NOI18N
        JlCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JlFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JlCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JcMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JlCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(JlFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(JcMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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


    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        dispose();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        if (JtObservaciones.getText().isEmpty() || JtObservaciones.getText().length() < 15) {
            JOptionPane.showMessageDialog(null, "Ingresa una descripcion del porque es la devolucion o un numero minimo de 15 caracteres");
            JtObservaciones.requestFocus();
        } else {
            Devolucion dev = new Devolucion();
            java.util.Date date = new Date();
            daoDevolucion dd = new daoDevolucion();
            daokardexrcpt dk = new daokardexrcpt();
            DecimalFormat formateador = new DecimalFormat("####.##");//para los decimales
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            dev.setId_concepto(arrc.get(0).getId_concepto());
            dev.setId_motivo(arrm.get(JcMotivo.getSelectedIndex()).getIdmotivo());
            dev.setFecha(sdf.format(date));
            dev.setId_kardex(arrd.get(0).getId_kardex());
            dev.setId_pedido(arrd.get(0).getId_pedido());
            dev.setDesc(JtObservaciones.getText().toUpperCase());
            dev.setNombre(nombre);
            dev.setStock(arrm.get(JcMotivo.getSelectedIndex()).getStock());
            dev.setId_cliente(id_cliente);
            dev.setSerie("A");
            dev.setId_cargoenc(arrd.get(0).getId_cargo());
            dev.setUsuario(u.getUsuario());
            dev.setId_kardexnuevo(dk.maxkardexsincuenta(cpt));
            ArrayList<Ddevolucion> arrdn = new ArrayList<>();
            int renglon=1;
            for (int i = 0; i < arrd.size(); i++) {
                if (JtDetalle.getValueAt(i, 6).toString().equals("*")) {
                    Ddevolucion d = arrd.get(i);
                    d.setRenglon(renglon);
                    double cant = Double.parseDouble(formateador.format(Double.parseDouble(JtDetalle.getValueAt(i, 4).toString())));
                    double precio = Double.parseDouble(formateador.format(Double.parseDouble(JtDetalle.getValueAt(i, 3).toString())));
                    double importe = Double.parseDouble(formateador.format(cant * precio));
                    d.setImporte(importe);
                    d.setCantidad(cant);
                    d.setPrecio(precio);
                    arrdn.add(d);
                }
                renglon++;
            }
            dev.setArr(arrdn);
            if (dd.newdev(cpt, dev, cob)) {
                JOptionPane.showMessageDialog(null, "Completo");
                dispose();
            }
        }

    }//GEN-LAST:event_jLabel1MousePressed

    private void JcMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JcMotivoActionPerformed

    private void JtDetalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtDetalleMousePressed
        String active = JtDetalle.getValueAt(JtDetalle.getSelectedRow(), 6).toString();
        if (active.equals("")) {
            JtDetalle.setValueAt("*", JtDetalle.getSelectedRow(), 6);
        } else {
            JtDetalle.setValueAt("", JtDetalle.getSelectedRow(), 6);
        }
    }//GEN-LAST:event_JtDetalleMousePressed

    public void muestradatos(String nombre, String folio, int iddoc, int cliente) {
        JlNombre.setText(nombre);
        JlFolio.setText(folio);
        this.nombre=nombre;
        this.iddoc = iddoc;
        id_cliente = cliente;
        rellenacomboandgetconcepto();
        llenatabla();
    }

    private void rellenacomboandgetconcepto() {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        daoConceptos d = new daoConceptos();
        daoDevolucion dd = new daoDevolucion();
        arrm = dd.arrmotivos(cpt);
        arrc = d.getConceptos(cpt, 10);
        for (Motivosdev arrm1 : arrm) {
            model.addElement(arrm1.getDescripcion());
        }
        JcMotivo.setModel(model);
        JlCuenta.setText(arrc.get(0).getNombre());
    }

    private void llenatabla() {
        DefaultTableModel model = new DefaultTableModel();
        daoDevolucion dd = new daoDevolucion();
        arrd = dd.arrfac(cpt, iddoc);
        model.setRowCount(arrd.size());
        model.addColumn("Pedido");
        model.addColumn("Material");
        model.addColumn("Fecha");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        model.addColumn("Importe");
        model.addColumn("");
        for (int i = 0; i < arrd.size(); i++) {
            model.setValueAt(JlFolio.getText(), i, 0);
            model.setValueAt(arrd.get(i).getDescripcion() + " " + arrd.get(i).getDureza(), i, 1);
            model.setValueAt(arrd.get(i).getFecha(), i, 2);
            model.setValueAt(arrd.get(i).getPrecio(), i, 3);
            model.setValueAt(arrd.get(i).getCantidad(), i, 4);
            model.setValueAt(arrd.get(i).getImporte(), i, 5);
            model.setValueAt("", i, 6);
        }
        JtDetalle.setModel(model);

    }

    private void vaciarcampos() {
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
            java.util.logging.Logger.getLogger(Cancelapedidosfac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cancelapedidosfac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cancelapedidosfac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cancelapedidosfac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cancelapedidosfac dialog = new Cancelapedidosfac(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> JcMotivo;
    private javax.swing.JLabel JlCuenta;
    private javax.swing.JLabel JlFolio;
    private javax.swing.JLabel JlNombre;
    private javax.swing.JTable JtDetalle;
    private javax.swing.JTextArea JtObservaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
