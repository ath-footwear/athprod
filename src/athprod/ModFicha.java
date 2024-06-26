/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package athprod;

import DAO.daoDetFichas;
import DAO.daoserver;
import Modelo.Allsingleton;
import Modelo.Colores;
import Modelo.DetFichas;
import Modelo.Fichas;
import Modelo.Materiales;
import Modelo.Piezas;
import Modelo.Tipo_material;
import Modelo.Unidades;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author GATEWAY1-
 */
public class ModFicha extends javax.swing.JDialog {

    ArrayList<Tipo_material> arrtipos = new ArrayList<>();
    ArrayList<Piezas> arrpiezas = new ArrayList<>();
    ArrayList<Materiales> arrmateriales = new ArrayList<>();
    ArrayList<Colores> arrcolores = new ArrayList<>();
    ArrayList<Unidades> arrunidades = new ArrayList<>();
    DetFichas detfic = new DetFichas();
    String info = "0";
    String mod = "0";
    Fichas fi;

    /**
     * Creates new form ModFicha
     *
     * @param parent
     * @param modal
     */
    public ModFicha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/edit-validated_40458.png"));
        setIconImage(icon);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        cargacombos();
        JlEdicion.setVisible(false);
        JlEd.setVisible(false);

    }

    public void ms() {
        System.out.println("info-" + info);
        if (info.equals("2")) {
            System.out.println("dentro 2 " + detfic.getConsumo());
            JlTipo.setText(detfic.getTipomdesc());
            JlPieza.setText(detfic.getPiezadesc());
            JlMaterial.setText(detfic.getMaterialdesc());
            JlUnidad.setText(detfic.getUnidad());
            JlColor.setText(detfic.getColordesc());
            JtPiezapar.setText(detfic.getPzaxpar());
            JtConsumo.setText(detfic.getConsumo() + "");
            JtObservaciones.setText(detfic.getObservaciones());
            JtTotal.setText(detfic.getTotal() + "");
            JlEdicion.setVisible(true);
            JlEd.setVisible(true);

        } else {
            JlEdicion.setVisible(false);
            JlEd.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JbTipo = new javax.swing.JComboBox<>();
        JbPieza = new javax.swing.JComboBox<>();
        JbMaterial = new javax.swing.JComboBox<>();
        JbColor = new javax.swing.JComboBox<>();
        JbUnidad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JtConsumo = new javax.swing.JTextField();
        JtPiezapar = new javax.swing.JTextField();
        JtObservaciones = new javax.swing.JTextField();
        JtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JbAgregar = new javax.swing.JButton();
        JlTipo = new javax.swing.JLabel();
        JlPieza = new javax.swing.JLabel();
        JlMaterial = new javax.swing.JLabel();
        JlColor = new javax.swing.JLabel();
        JlUnidad = new javax.swing.JLabel();
        JlEdicion = new javax.swing.JLabel();
        JlEd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cuerpo de Ficha Tecnica");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        JbTipo.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        JbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbTipoActionPerformed(evt);
            }
        });

        JbPieza.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        JbMaterial.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        JbColor.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        JbUnidad.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N

        jLabel1.setText("TIPO");

        jLabel2.setText("PIEZA");

        jLabel3.setText("COLOR");

        jLabel4.setText("MATERIAL");

        jLabel5.setText("UNIDAD");

        JtConsumo.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        JtConsumo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtConsumoActionPerformed(evt);
            }
        });

        JtPiezapar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        JtPiezapar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtPiezapar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtPiezaparActionPerformed(evt);
            }
        });

        JtObservaciones.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        JtObservaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtObservaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtObservacionesActionPerformed(evt);
            }
        });

        JtTotal.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        JtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtTotalActionPerformed(evt);
            }
        });

        jLabel6.setText("PIEZAS X PAR");

        jLabel7.setText("CONSUMO");

        jLabel8.setText("OBSERVACIONES");

        jLabel9.setText("TOTAL");

        JbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ic_send_128_28719.png"))); // NOI18N
        JbAgregar.setText("Agregar");
        JbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAgregarActionPerformed(evt);
            }
        });

        JlTipo.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        JlTipo.setForeground(new java.awt.Color(251, 1, 68));
        JlTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JlPieza.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        JlPieza.setForeground(new java.awt.Color(251, 1, 68));
        JlPieza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JlMaterial.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        JlMaterial.setForeground(new java.awt.Color(251, 1, 68));
        JlMaterial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JlColor.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        JlColor.setForeground(new java.awt.Color(251, 1, 68));
        JlColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JlUnidad.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        JlUnidad.setForeground(new java.awt.Color(251, 1, 68));
        JlUnidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        JlEdicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Ordering_25406.png"))); // NOI18N

        JlEd.setText("EDICION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JlPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(JlMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JbMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JlColor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JlUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbPieza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JtPiezapar, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(JtConsumo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlEdicion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JlEd, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JbAgregar)
                .addGap(354, 354, 354))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JlTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(JtPiezapar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlEd)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JlEdicion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlPieza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(JtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(JtObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(JtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JlUnidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(JbAgregar)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Cerrar();
    }//GEN-LAST:event_formWindowClosed

    private void JbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JbTipoActionPerformed

    private void JtConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtConsumoActionPerformed
        JtObservaciones.requestFocus();
    }//GEN-LAST:event_JtConsumoActionPerformed

    private void JtObservacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtObservacionesActionPerformed
        JtTotal.requestFocus();
    }//GEN-LAST:event_JtObservacionesActionPerformed

    private void JtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtTotalActionPerformed
        JbAgregar.requestFocus();
    }//GEN-LAST:event_JtTotalActionPerformed

    private void JbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAgregarActionPerformed
        if(mod.equals("0")){//solo mete una linea al arreglo
            addrow();
        }if(mod.equals("2")){
            
        }
        
    }//GEN-LAST:event_JbAgregarActionPerformed

    private void JtPiezaparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtPiezaparActionPerformed
        JtConsumo.requestFocus();
    }//GEN-LAST:event_JtPiezaparActionPerformed

    public void addrow() {//Añade 1 nuevo objeto al arreglo de tipo detalle de ficha
        ArrayList<DetFichas> arr = new ArrayList<>();
        DetFichas df = new DetFichas();
        int rowtipo = JbTipo.getSelectedIndex();
        int rowpieza = JbPieza.getSelectedIndex();
        int rowmaterial = JbMaterial.getSelectedIndex();
        int rowcolor = JbColor.getSelectedIndex();
        int rowunidad = JbUnidad.getSelectedIndex();
        df.setPzaxpar(JtPiezapar.getText().toUpperCase());
        df.setConsumo(Float.parseFloat(JtConsumo.getText()));
        df.setObservaciones(JtObservaciones.getText().toUpperCase());
        df.setTotal(Float.parseFloat(JtTotal.getText()));
        df.setId_tipom(arrtipos.get(rowtipo).getId_tipo());
        df.setId_pieza(arrpiezas.get(rowpieza).getId_pieza());
        df.setId_material(arrmateriales.get(rowmaterial).getId_material());
        df.setId_color(arrcolores.get(rowcolor).getId_color());
        df.setUnidad(arrunidades.get(rowunidad).getDescripcion());
        df.setTipomdesc(arrtipos.get(rowtipo).getDescripcion());
        df.setPiezadesc(arrpiezas.get(rowpieza).getDescripcion());
        df.setMaterialdesc(arrmateriales.get(rowmaterial).getDescripcion());
        df.setColordesc(arrcolores.get(rowcolor).getDescripcion());
        if (Allsingleton.getDf().isEmpty()) {
            arr.add(df);
            //Allsingleton.setDff(df);
        } else {
            for (int i = 0; i < Allsingleton.getDf().size(); i++) {
                DetFichas dff = new DetFichas();
                dff.setPzaxpar(Allsingleton.getDf().get(i).getPzaxpar());
                dff.setConsumo(Allsingleton.getDf().get(i).getConsumo());
                dff.setObservaciones(Allsingleton.getDf().get(i).getObservaciones());
                dff.setTotal(Allsingleton.getDf().get(i).getTotal());
                dff.setId_tipom(Allsingleton.getDf().get(i).getId_material());
                dff.setId_pieza(Allsingleton.getDf().get(i).getId_pieza());
                dff.setId_material(Allsingleton.getDf().get(i).getId_material());
                dff.setId_color(Allsingleton.getDf().get(i).getId_color());
                dff.setUnidad(Allsingleton.getDf().get(i).getUnidad());
                dff.setTipomdesc(Allsingleton.getDf().get(i).getTipomdesc());
                dff.setPiezadesc(Allsingleton.getDf().get(i).getPiezadesc());
                dff.setMaterialdesc(Allsingleton.getDf().get(i).getMaterialdesc());
                dff.setColordesc(Allsingleton.getDf().get(i).getColordesc());
                arr.add(dff);
            }
            //arr.add(Allsingleton.getDff());
            arr.add(df);
        }
        Allsingleton.setDf(arr);
        //JOptionPane.showMessageDialog(null, "Completo!, actualiza la tabla de la ficha tecnica.");
        Cerrar();
    }

    /**
     * @param args the command line arguments
     */
    private void Cerrar() {
//        String botones[] = {"SI", "NO"};
//        int eleccion = JOptionPane.showOptionDialog(this,"¿Deseas cerrar esta ventana?", "TOP-SUELAS", 
//                0, 0, null, botones, this);
//        if(eleccion == JOptionPane.YES_OPTION){
        dispose();
//        }else if(eleccion == JOptionPane.NO_OPTION){       
//        }
    }

    private void cargacombos() {
        daoserver server = new daoserver();
        Connection con = server.Getconexion();
        daoDetFichas df = new daoDetFichas();
        arrtipos = df.gettipomaterial(con);
        arrpiezas = df.getpiezas(con);
        arrmateriales = df.getmateriales(con);
        arrcolores = df.arrcolores(con);
        arrunidades = df.getunidades(con);
        llenacombos();
    }

    private void llenacombos() {
        if (arrcolores.isEmpty() || arrtipos.isEmpty() || arrpiezas.isEmpty()
                || arrmateriales.isEmpty() || arrunidades.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Falta informacion necesaria "
                    + "por llenar, verifica los COLORES, PIEZAS, MATERIALES, UNIDADES Y TIPOS");
        } else {
            for (int i = 0; i < arrcolores.size(); i++) {
                JbColor.addItem(arrcolores.get(i).getDescripcion());
            }
            for (int i = 0; i < arrpiezas.size(); i++) {
                JbPieza.addItem(arrpiezas.get(i).getDescripcion());
            }
            for (int i = 0; i < arrmateriales.size(); i++) {
                JbMaterial.addItem(arrmateriales.get(i).getDescripcion());
            }
            for (int i = 0; i < arrtipos.size(); i++) {
                JbTipo.addItem(arrtipos.get(i).getDescripcion());
            }
            for (int i = 0; i < arrunidades.size(); i++) {
                JbUnidad.addItem(arrunidades.get(i).getDescripcion());
            }
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModFicha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModFicha dialog = new ModFicha(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JbAgregar;
    private javax.swing.JComboBox<String> JbColor;
    private javax.swing.JComboBox<String> JbMaterial;
    private javax.swing.JComboBox<String> JbPieza;
    private javax.swing.JComboBox<String> JbTipo;
    private javax.swing.JComboBox<String> JbUnidad;
    private javax.swing.JLabel JlColor;
    private javax.swing.JLabel JlEd;
    private javax.swing.JLabel JlEdicion;
    private javax.swing.JLabel JlMaterial;
    private javax.swing.JLabel JlPieza;
    private javax.swing.JLabel JlTipo;
    private javax.swing.JLabel JlUnidad;
    private javax.swing.JTextField JtConsumo;
    private javax.swing.JTextField JtObservaciones;
    private javax.swing.JTextField JtPiezapar;
    private javax.swing.JTextField JtTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
