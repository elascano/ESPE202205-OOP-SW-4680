/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.stylesirelia.view;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import ec.edu.espe.stylesirelia.controller.CustomerController;
import ec.edu.espe.stylesirelia.controller.StylistController;
import ec.edu.espe.stylesirelia.controller.Connection;
import ec.edu.espe.stylesirelia.model.Customer;
import ec.edu.espe.stylesirelia.model.Stylist;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class FrmUpdateCustomer extends javax.swing.JFrame {

    public class centerFrame extends javax.swing.JFrame {

        public centerFrame() {
            initComponents();

            setLocationRelativeTo(null);
        }
    }

    private CustomerController customerController;

    /**
     * Creates new form FrmUpdateCustomer
     */
    public FrmUpdateCustomer() {
        initComponents();
        Connection.connectionDataBase();
        customerController = new CustomerController();
        loadCustomerComboBox();
    }
    public void loadCustomerComboBox() {

        CodecRegistry codecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoDatabase db = Connection.mongodb.withCodecRegistry(codecRegistry);
        MongoCollection<Customer> collectionCustomers = db.getCollection("customers", Customer.class);
        List<Customer> customers = collectionCustomers.find(new Document(), Customer.class).into(new ArrayList<Customer>());

        for (Customer customer : customers) {
            comboBoxCustomers.addItem(customer.getIdentificationCard());
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

        jPanel3 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtAppoiment = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Appoiment = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBackMenu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtUpdate1 = new javax.swing.JButton();
        cmbPayment = new javax.swing.JComboBox<>();
        comboBoxCustomers = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 136, 164, -1));

        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberKeyTyped(evt);
            }
        });
        jPanel3.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 176, 164, -1));

        txtAppoiment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppoimentActionPerformed(evt);
            }
        });
        txtAppoiment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAppoimentKeyTyped(evt);
            }
        });
        jPanel3.add(txtAppoiment, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 256, 164, -1));

        jLabel2.setText("Cedula");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 96, 60, -1));

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        jPanel3.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 296, 164, -1));

        jLabel3.setText("Nombre");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 139, 78, -1));

        btnFind.setText("Editar");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel3.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jLabel4.setText("Número");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 179, 121, -1));

        jLabel5.setText("Pagado");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 219, 121, -1));

        Appoiment.setText("Fecha");
        jPanel3.add(Appoiment, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 259, 121, -1));

        jLabel7.setText("Dirección");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 299, 121, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setText("Actualizar Cliente");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 240, -1));

        btnBackMenu.setText("Volver");
        btnBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMenuActionPerformed(evt);
            }
        });
        jPanel3.add(btnBackMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/stylesirelia/sources/bg-logo.png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, -30, 280, -1));

        txtUpdate1.setText("Actualizar");
        txtUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdate1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        cmbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pay", "Need to pay" }));
        cmbPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaymentActionPerformed(evt);
            }
        });
        jPanel3.add(cmbPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 256, -1));
        jPanel3.add(comboBoxCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMenuActionPerformed
        FrmStylesIreliaMenu frmStylesIreliaMenu = new FrmStylesIreliaMenu();
        frmStylesIreliaMenu.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btnBackMenuActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        try {
            Document doc = customerController.read(comboBoxCustomers.getSelectedItem().toString(),"identificationCard");
            Customer customer = customerController.parseDocumentToClass(doc);
            
            
            txtAppoiment.setText(customer.getAppointment());
            txtName.setText(customer.getName());
            txtAddress.setText(customer.getAddress());
            txtNumber.setText(String.valueOf(customer.getNumber()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique bien los datos, no se encontro.");
        }

    }//GEN-LAST:event_btnFindActionPerformed

    private void txtUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdate1ActionPerformed
        Document doc = customerController.read(comboBoxCustomers.getSelectedItem().toString(),"identificationCard");
        Customer customer = new Customer(comboBoxCustomers.getSelectedItem().toString(),
                txtName.getText(),
                Integer.parseInt(txtNumber.getText()),
                false, txtAppoiment.getText(), txtAddress.getText());
        customerController.update(doc, customerController.buildDocument(customer));
        Document result = customerController.read(customerController.buildDocument(customer));
        if (result!=null) {
            
            JOptionPane.showMessageDialog(null, "Actualizado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Hubo un problema, intente de nuevo");
        }
    }//GEN-LAST:event_txtUpdate1ActionPerformed

    private void cmbPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaymentActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");} // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyTyped
       char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros \n Enter only numbers");} // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberKeyTyped

    private void txtAppoimentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppoimentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppoimentActionPerformed

    private void txtAppoimentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAppoimentKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");} // TODO add your handling code here:
    }//GEN-LAST:event_txtAppoimentKeyTyped

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");} // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyTyped

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
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appoiment;
    private javax.swing.JButton btnBackMenu;
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox<String> cmbPayment;
    private javax.swing.JComboBox<String> comboBoxCustomers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAppoiment;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JButton txtUpdate1;
    // End of variables declaration//GEN-END:variables
}
