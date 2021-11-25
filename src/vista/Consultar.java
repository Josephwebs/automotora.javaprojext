/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Registro;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Vehiculo;

/**
 *
 * @author José Alcantara
 */
public class Consultar extends javax.swing.JFrame {

    /**
     * Creates new form Consultar
     */
    public Consultar() {
        initComponents();
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JPanel();
        EnviarLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ChasisLabel = new javax.swing.JLabel();
        ChasisLabel1 = new javax.swing.JLabel();
        transcombox = new javax.swing.JComboBox<>();
        ChasisLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        marcaCombox = new javax.swing.JComboBox<>();
        precioCombox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(76, 49, 49));

        btnConsultar.setBackground(new java.awt.Color(179, 62, 66));
        btnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        EnviarLabel1.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        EnviarLabel1.setForeground(new java.awt.Color(255, 255, 255));
        EnviarLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnviarLabel1.setText("Consultar");
        EnviarLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EnviarLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnviarLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnConsultarLayout = new javax.swing.GroupLayout(btnConsultar);
        btnConsultar.setLayout(btnConsultarLayout);
        btnConsultarLayout.setHorizontalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConsultarLayout.createSequentialGroup()
                .addComponent(EnviarLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnConsultarLayout.setVerticalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConsultarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EnviarLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO CORTADO2.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Complete los siguientes campos");

        ChasisLabel.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        ChasisLabel.setForeground(new java.awt.Color(255, 255, 255));
        ChasisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChasisLabel.setText("Marca");
        ChasisLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ChasisLabel1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        ChasisLabel1.setForeground(new java.awt.Color(255, 255, 255));
        ChasisLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChasisLabel1.setText("Transmision");
        ChasisLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        transcombox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        transcombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Automático", "Manual" }));
        transcombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transcomboxActionPerformed(evt);
            }
        });

        ChasisLabel2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        ChasisLabel2.setForeground(new java.awt.Color(255, 255, 255));
        ChasisLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChasisLabel2.setText("Rango de precio");
        ChasisLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tblVehiculos.setBackground(new java.awt.Color(179, 62, 66));
        tblVehiculos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        tblVehiculos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tblVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero Chasis", "Marca", "transmision", "Precio"
            }
        ));
        tblVehiculos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblVehiculos.setGridColor(new java.awt.Color(255, 153, 0));
        tblVehiculos.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblVehiculos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblVehiculos);

        marcaCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        precioCombox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(ChasisLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(marcaCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ChasisLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transcombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ChasisLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(precioCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChasisLabel1)
                    .addComponent(ChasisLabel)
                    .addComponent(transcombox)
                    .addComponent(marcaCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChasisLabel2)
                    .addComponent(precioCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transcomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transcomboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transcomboxActionPerformed

    private void EnviarLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarLabel1MouseClicked
        int nChasis;
        int marca;
        String transmision;
        int precio;
        DefaultTableModel modelo = (DefaultTableModel) tblVehiculos.getModel();
                
        /**try {
            id = Integer.parseInt(txtId.getText());
        } catch (Exception e) {
            id = 0;
        }
        **/
        Registro rg = new Registro();
        modelo.setRowCount(0);
            // listar todos
            List<Vehiculo> lista = rg.consultar();

            for (Vehiculo tmp : lista) {
                nChasis = tmp.getNumeroChasis();
                marca = tmp.getMarca();
                transmision = tmp.getTransmision();
                precio = tmp.getPrecio();

                modelo.addRow(new Object[]{nChasis, marca, transmision, precio});
            }
        /**
        } else { //consulta por id
            Libro libro = rg.buscarPorId(id);
            titulo = libro.getTitulo();
            autor = libro.getAutor();
            precio = libro.getPrecio();
            disponible = libro.isDisponible();

            modelo.addRow(new Object[]{titulo, autor, precio, disponible});

        }
        **/
    }//GEN-LAST:event_EnviarLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChasisLabel;
    private javax.swing.JLabel ChasisLabel1;
    private javax.swing.JLabel ChasisLabel2;
    private javax.swing.JLabel EnviarLabel1;
    private javax.swing.JPanel btnConsultar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> marcaCombox;
    private javax.swing.JComboBox<String> precioCombox;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JComboBox<String> transcombox;
    // End of variables declaration//GEN-END:variables
}
