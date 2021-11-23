/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Registro;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Marca;
import modelo.Modelo;
import modelo.Vehiculo;

/**
 *
 * @author José Alcantara
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    public Agregar() {
        initComponents();
        this.setResizable(false);
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
        jLabel5 = new javax.swing.JLabel();
        NumChasisField = new javax.swing.JTextField();
        ColorField = new javax.swing.JTextField();
        PrecioField = new javax.swing.JTextField();
        ModeloField = new javax.swing.JTextField();
        MarcaField = new javax.swing.JTextField();
        ChkStock = new javax.swing.JCheckBox();
        EnviarPanel = new javax.swing.JPanel();
        EnviarLabel = new javax.swing.JLabel();
        ChasisLabel = new javax.swing.JLabel();
        PrecioLabel = new javax.swing.JLabel();
        MarcaLabel = new javax.swing.JLabel();
        ColorLabel2 = new javax.swing.JLabel();
        TransmisionField = new javax.swing.JComboBox<>();
        ModeloLabel = new javax.swing.JLabel();
        TransmisionLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(76, 49, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 376));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO CORTADO2.png"))); // NOI18N

        ChkStock.setForeground(new java.awt.Color(255, 255, 255));
        ChkStock.setText("Disponible");
        ChkStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkStockActionPerformed(evt);
            }
        });

        EnviarPanel.setBackground(new java.awt.Color(179, 62, 66));
        EnviarPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        EnviarPanel.setToolTipText("");
        EnviarPanel.setPreferredSize(new java.awt.Dimension(85, 32));
        EnviarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnviarPanelMouseClicked(evt);
            }
        });

        EnviarLabel.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        EnviarLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnviarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EnviarLabel.setText("Enviar");
        EnviarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout EnviarPanelLayout = new javax.swing.GroupLayout(EnviarPanel);
        EnviarPanel.setLayout(EnviarPanelLayout);
        EnviarPanelLayout.setHorizontalGroup(
            EnviarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnviarPanelLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(EnviarLabel)
                .addGap(62, 62, 62))
        );
        EnviarPanelLayout.setVerticalGroup(
            EnviarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EnviarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EnviarLabel))
        );

        ChasisLabel.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        ChasisLabel.setForeground(new java.awt.Color(255, 255, 255));
        ChasisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChasisLabel.setText("Chasis");
        ChasisLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        PrecioLabel.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        PrecioLabel.setForeground(new java.awt.Color(255, 255, 255));
        PrecioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PrecioLabel.setText("Precio");
        PrecioLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        MarcaLabel.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        MarcaLabel.setForeground(new java.awt.Color(255, 255, 255));
        MarcaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MarcaLabel.setText("Marca");
        MarcaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ColorLabel2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        ColorLabel2.setForeground(new java.awt.Color(255, 255, 255));
        ColorLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ColorLabel2.setText("Color");
        ColorLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TransmisionField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Automático", "Manual" }));
        TransmisionField.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TransmisionFieldItemStateChanged(evt);
            }
        });

        ModeloLabel.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        ModeloLabel.setForeground(new java.awt.Color(255, 255, 255));
        ModeloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModeloLabel.setText("Modelo");
        ModeloLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TransmisionLabel2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        TransmisionLabel2.setForeground(new java.awt.Color(255, 255, 255));
        TransmisionLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TransmisionLabel2.setText("Transmision");
        TransmisionLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Complete los siguientes campos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EnviarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(ChkStock, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChasisLabel)
                                    .addComponent(ColorLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(NumChasisField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PrecioField)
                                            .addComponent(ColorField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(PrecioLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TransmisionLabel2)
                            .addComponent(MarcaLabel)
                            .addComponent(ModeloLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TransmisionField, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MarcaField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(ModeloField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumChasisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChasisLabel)
                    .addComponent(TransmisionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TransmisionLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorLabel2)
                    .addComponent(MarcaLabel)
                    .addComponent(MarcaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrecioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioLabel)
                    .addComponent(ModeloLabel)
                    .addComponent(ModeloField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ChkStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(EnviarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnviarPanelMouseClicked
        Registro r = new Registro();
        boolean stock = ChkStock.isSelected();
        String color = ColorField.getText();
        int marca = Integer.parseInt(MarcaField.getText());
        int modelo = Integer.parseInt(ModeloField.getText());
        int numChasis = Integer.parseInt(NumChasisField.getText());
        int precio = Integer.parseInt(PrecioField.getText());
        String transmision = TransmisionField.getSelectedItem().toString();
                
        Vehiculo vehiculo = new Vehiculo(numChasis, marca, modelo, color, precio, transmision, stock);
        try {
            r.Agregar(vehiculo);
            JOptionPane.showMessageDialog(this, "Se agregó el vehiculo exitosamente ", "Información", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Vehiculo" + vehiculo.getModelo(), "Error", JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(Agregar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EnviarPanelMouseClicked

    private void ChkStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkStockActionPerformed

    private void TransmisionFieldItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TransmisionFieldItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TransmisionFieldItemStateChanged

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChasisLabel;
    private javax.swing.JCheckBox ChkStock;
    private javax.swing.JTextField ColorField;
    private javax.swing.JLabel ColorLabel2;
    private javax.swing.JLabel EnviarLabel;
    private javax.swing.JPanel EnviarPanel;
    private javax.swing.JTextField MarcaField;
    private javax.swing.JLabel MarcaLabel;
    private javax.swing.JTextField ModeloField;
    private javax.swing.JLabel ModeloLabel;
    private javax.swing.JTextField NumChasisField;
    private javax.swing.JTextField PrecioField;
    private javax.swing.JLabel PrecioLabel;
    private javax.swing.JComboBox<String> TransmisionField;
    private javax.swing.JLabel TransmisionLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
