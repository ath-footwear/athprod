/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import DAO.daocfdi;
import DAO.daoempresa;
import DAO.daofactura;
import Modelo.ConceptosES;
import Modelo.Empresas;
import Modelo.Formadepago;
import Modelo.Usuarios;
import Modelo.convertirNumeros;
import Modelo.convertnum;
import Modelo.factura;
import Modelo.metodopago;
import Modelo.usocfdi;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author GATEWAY1-
 */
public class pago2 extends javax.swing.JPanel {

    public String nombre;
    public Connection sqlcfdi, sqlempresa;
    public Connection ACobranza, rcpt, cpt;
    public ArrayList<Formadepago> arrfpago = new ArrayList<>();
    public ArrayList<usocfdi> arruso = new ArrayList<>();
    public ArrayList<metodopago> arrmetodo = new ArrayList<>();
    public ArrayList<ConceptosES> arrcuentas = new ArrayList<>();
    public ArrayList<factura> arrfacturas = new ArrayList<>();
    public String empresa, empresacob;
    public Usuarios u;

    daocfdi dcfdi = new daocfdi();
    int estado = 0;
    int ciudad = 0;
    int pais = 0;

    /**
     * Creates new form Cliente1
     */
    public pago2() {
        initComponents();
//        iniciarconexiones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        JtCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtDetalle = new javax.swing.JTable();
        Jlemp = new javax.swing.JLabel();

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/file_pdf_download_icon-icons.com_68954.png"))); // NOI18N
        jMenuItem1.setText("Imprimir pdf");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        pop.add(jMenuItem1);

        jMenuItem2.setText("Cancelar pago");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        pop.add(jMenuItem2);

        setBackground(new java.awt.Color(255, 255, 255));

        JtCliente.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        JtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JtCliente.setBorder(null);
        JtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtClienteMousePressed(evt);
            }
        });
        JtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Cliente");

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JtDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JtDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JtDetalleMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(JtDetalle);

        Jlemp.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jlemp.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(JtCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jlemp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(JtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Jlemp, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtClienteActionPerformed
        generatabla();
    }//GEN-LAST:event_JtClienteActionPerformed

    private void JtDetalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtDetalleMousePressed
        if (evt.getButton() == 3) {// activar con clic derecho
            pop.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_JtDetalleMousePressed

    private void JtClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtClienteMousePressed
        JtCliente.setText("");
    }//GEN-LAST:event_JtClienteMousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        setreport(arrfacturas.get(JtDetalle.getSelectedRow()).getFolio(),arrfacturas.get(JtDetalle.getSelectedRow()).getRegimen());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private double formatdecimal(double cant) {
        int dato = 0;
        int punto = 0;
        boolean band = false;
        double resp;
        String c = String.valueOf(cant);
//        String cadena = "";
        for (int i = 0; i < c.length(); i++) {
//            Empieza a tomar datos despues del punto
            if (c.charAt(i) == '.') {
                band = true;
            }
            if (band) {
//                3 digitos de decimal para saber qe hacer con los decimales
                if (punto == 3) {
                    dato = Integer.parseInt(c.charAt(i) + "");
                    i = c.length();
                    break;
                }
//                cadena += c.charAt(i);
                punto++;
            }
        }
        if ((dato <= 5)) {
            resp = BigDecimal.valueOf(cant).setScale(2, RoundingMode.FLOOR).doubleValue();
        } else {
            resp = BigDecimal.valueOf(cant).setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
        return resp;
    }

    private void limpiar() {

        JtCliente.setText("");
        generatabla();

    }

    private void generatabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Pago");
        model.addColumn("Cliente");
        model.addColumn("Orden de pago");
        model.addColumn("forma de pago");
        model.addColumn("Metodo de pago");
        model.addColumn("Estado");
        model.addColumn("Estado sat");
        model.addColumn("Regimen Fiscal");

        daofactura d = new daofactura();
//        arrabonos = d.getabonospago(cpt, JtCliente.getText(), empresacob, 15);
        arrfacturas = d.getdocpagos(cpt, JtCliente.getText(), "PAG", empresacob);
        int tamaño = arrfacturas.size();
//        model.setRowCount(arrabonos.size());
        model.setRowCount(tamaño);
        for (int i = 0; i < arrfacturas.size(); i++) {
            String a = (arrfacturas.get(i).getEstatus() == 1) ? "Activo" : "Inactivo";
            String a1 = (arrfacturas.get(i).getFoliofiscal().equals("")) ? "No timbrado" : "Timbrado";
            model.setValueAt(arrfacturas.get(i).getFolio(), i, 0);
            model.setValueAt(arrfacturas.get(i).getNombre(), i, 1);
            model.setValueAt(arrfacturas.get(i).getOrdenpago(), i, 2);
            model.setValueAt(arrfacturas.get(i).getFormapago(), i, 3);
            model.setValueAt(arrfacturas.get(i).getMetodopago(), i, 4);
            model.setValueAt(a, i, 5);
            model.setValueAt(a1, i, 6);
            model.setValueAt(arrfacturas.get(i).getRegimen(), i, 6);
            
        }
        JtDetalle.setModel(model);
    }

    private String formatfecha(String fe) {
        String nfecha = "";
        for (int i = 0; i < fe.length() - 2; i++) {
            nfecha += (fe.charAt(i) == ' ') ? "T" : fe.charAt(i) + "";
        }
//        System.out.println(fe);
//        System.out.println(nfecha);
        return nfecha;
    }

    private boolean verificaint(String cad) {
        boolean resp = false;
        String patt = "[0-9]+";
        Pattern pat = Pattern.compile(patt);
        Matcher match = pat.matcher(cad);
        if (match.matches()) {
            resp = true;
        }
        return resp;
    }

    private void setreport(int folio, String regimen) {
        try {
            daoempresa d = new daoempresa();
//            Identificar si es de ath o uptown
            DecimalFormat form = new DecimalFormat("####.##");//para los decimales
            String n = (empresa.equals("UptownCPT")) ? "2" : "1";
            String logo = (empresa.equals("UptownCPT")) ? "Uptown.jpg" : "AF.png";
            Empresas e = d.getempresarfc(sqlempresa, n);
//             fin identificar empresa
            Map parametros = new HashMap();
//            Clase que contiene el numero convertido a caracter
            convertnum conv = new convertnum();
            convertirNumeros cnum = new convertirNumeros();

//            Agregar parametros al reporte
            parametros.put("folio", folio);
//            parametros.put("totalletra", conv.controlconversion(total).toUpperCase()); String.valueOf(total)
            parametros.put("totalletra", "");
            parametros.put("nombre", e.getNombre());
            parametros.put("rfc", e.getRfc());
            parametros.put("regimen", e.getRegimen());
            parametros.put("lugar", e.getCp());
            parametros.put("comprobante", e.getNumcertificado());
            parametros.put("logo", "C:\\af\\bin\\" + logo);// direcion predefinida, posible cambiar en un futuro
            parametros.put("metodo", "PUE");
            parametros.put("uso", " Pagos");
            parametros.put("serie", "PAG");
            parametros.put("regimencliente", regimen);

            JasperReport jasper = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/index_p.jasper"));
            JasperPrint print = JasperFillManager.fillReport(jasper, parametros, cpt);
            JasperViewer ver = new JasperViewer(print, false); //despliegue de reporte
            ver.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            ver.setTitle("PAG " + folio);
            ver.setVisible(true);
//            Exportacion al archivo pdf
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File(e.getXml() + "\\PAG_" + folio + ".pdf"));
            exporter.exportReport();
        } catch (JRException ex) {
            Logger.getLogger(fac1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlemp;
    public javax.swing.JTextField JtCliente;
    private javax.swing.JTable JtDetalle;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPopupMenu pop;
    // End of variables declaration//GEN-END:variables
}
