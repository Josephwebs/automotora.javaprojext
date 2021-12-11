/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Registro;
import java.util.List;
import javax.swing.JOptionPane;
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        btnConsultar = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnConsultar1 = new javax.swing.JPanel();
        btnTodos = new javax.swing.JLabel();
        txttNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(76, 49, 49));

        btnConsultar.setBackground(new java.awt.Color(179, 62, 66));
        btnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnEnviar.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEnviar.setText("Consultar");
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnConsultarLayout = new javax.swing.GroupLayout(btnConsultar);
        btnConsultar.setLayout(btnConsultarLayout);
        btnConsultarLayout.setHorizontalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnConsultarLayout.setVerticalGroup(
            btnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGO CORTADO2.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Complete el siguiente campo");

        tblDatos.setBackground(new java.awt.Color(179, 62, 66));
        tblDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        tblDatos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tblDatos.setForeground(new java.awt.Color(255, 255, 255));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero Chasis", "Marca", "transmision", "Precio", "Color", "disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblDatos.setGridColor(new java.awt.Color(255, 153, 0));
        tblDatos.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblDatos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblDatos);

        btnConsultar1.setBackground(new java.awt.Color(179, 62, 66));
        btnConsultar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        btnConsultar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnTodos.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTodos.setText("Consultar Todos");
        btnTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTodosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnConsultar1Layout = new javax.swing.GroupLayout(btnConsultar1);
        btnConsultar1.setLayout(btnConsultar1Layout);
        btnConsultar1Layout.setHorizontalGroup(
            btnConsultar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );
        btnConsultar1Layout.setVerticalGroup(
            btnConsultar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        txttNumero.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txttNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttNumeroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel1.setText("Nro chasis : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodosMouseClicked
        int nChasis;
        String transmision, color, marca;
        int precio;
        boolean disponibilidad;
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        Registro rg = new Registro();
        modelo.setRowCount(0);
        // listar todos

        List<Vehiculo> lista = rg.consultar();

        for (Vehiculo tmp : lista) {
            nChasis = tmp.getNumeroChasis();
            marca = rg.buscarMarca(tmp.getMarca());
            transmision = tmp.getTransmision();
            precio = tmp.getPrecio();
            color = tmp.getColor();
            disponibilidad = tmp.isStock();
            modelo.addRow(new Object[]{nChasis, marca, transmision, precio,color,disponibilidad});
        }
    }//GEN-LAST:event_btnTodosMouseClicked

    private void btnEnviarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseClicked
        Registro rg = new Registro();
        if (!(txttNumero.getText().isEmpty())){
            try{
            int nroChasis = Integer.parseInt(txttNumero.getText());
            Vehiculo obj = rg.buscarVehiculo(nroChasis);
            DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
            modelo.setRowCount(0);
            int nChasis = obj.getNumeroChasis();
            String marca = rg.buscarMarca(obj.getMarca());
            String transmision = obj.getTransmision();
            int precio  = obj.getPrecio();
            String color= obj.getColor();
            boolean disponibilidad = obj.isStock();
            modelo.addRow(new Object[]{nChasis, marca, transmision, precio, color, disponibilidad});
            
            }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Caracter invalido, Ingrese solo numeros", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese el numero de chasis para buscar el vehiculo", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEnviarMouseClicked

    private void txttNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttNumeroActionPerformed

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
    private javax.swing.JPanel btnConsultar;
    private javax.swing.JPanel btnConsultar1;
    private javax.swing.JLabel btnEnviar;
    private javax.swing.JLabel btnTodos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txttNumero;
    // End of variables declaration//GEN-END:variables
}
