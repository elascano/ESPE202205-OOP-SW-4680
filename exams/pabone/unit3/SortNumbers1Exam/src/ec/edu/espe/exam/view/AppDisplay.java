
package ec.edu.espe.exam.view;

import javax.swing.JOptionPane;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import java.util.Arrays;
import ec.edu.espe.exam.controller.MongoDBConnection;

/**
 *
 * @author Elkin Pabon, Erick Moreira DCCO-ESPE, DEES Developers
 */

public class AppDisplay extends javax.swing.JFrame {

    MongoCollection <Document> SortNumbers = new MongoDBConnection().data().getCollection("Algorithm");

    
    public AppDisplay() {
        
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblEnterNumbers = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        txtSortNumbers = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTypeNumbers = new javax.swing.JTextField();
        btnOrdenNumbers = new javax.swing.JButton();
        cbSelectSize = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblSort = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setForeground(new java.awt.Color(242, 242, 242));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel4.setText("Ordered Numbers");

        lblEnterNumbers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnterNumbers.setForeground(new java.awt.Color(0, 51, 153));

        btnExit.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtSortNumbers.setEditable(false);
        txtSortNumbers.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 12)); // NOI18N
        jLabel2.setText("Select how many numbers you want to enter:");

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 1, 14)); // NOI18N
        jLabel5.setText("NUMBERS:");

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 18)); // NOI18N
        jLabel1.setText("Sort numbers App");

        txtTypeNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeNumbersActionPerformed(evt);
            }
        });
        txtTypeNumbers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTypeNumbersKeyTyped(evt);
            }
        });

        btnOrdenNumbers.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        btnOrdenNumbers.setText("SORT NUMBERS");
        btnOrdenNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenNumbersActionPerformed(evt);
            }
        });

        cbSelectSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txtTypeNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(btnOrdenNumbers))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(cbSelectSize, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(626, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSelectSize, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTypeNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnOrdenNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lblSort.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblSort.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(txtSortNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(lblEnterNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblSort, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSortNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSort)
                .addGap(8, 8, 8)
                .addComponent(btnExit)
                .addGap(141, 141, 141)
                .addComponent(lblEnterNumbers)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTypeNumbersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTypeNumbersKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros)
        {
            JOptionPane.showMessageDialog(null, "Only numbers");
            evt.consume();
        }

        if (txtTypeNumbers.getText().trim().length() == 10) {
            evt.consume();
        }

    }//GEN-LAST:event_txtTypeNumbersKeyTyped

    private void txtTypeNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeNumbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeNumbersActionPerformed

    private void btnOrdenNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenNumbersActionPerformed

        String number = txtTypeNumbers.getText();
        number = number.trim();
        String[] data = number.split("\n");
        int numbers = data.length;
        cbSelectSize.getSelectedItem();
       

        if ( numbers > 0 && numbers <= 3 ) {
            lblSort.setText("Algorithm used: BUBBLE SORT");
            Arrays.sort(data);
            for ( String sortNumber : data ) {
                txtSortNumbers.setText(sortNumber);
            }

            Document dataMongo = new org.bson.Document();
            dataMongo.put("- Unsorted Numbers", txtTypeNumbers.getText());
            dataMongo.put("- Sorted Numbers", txtSortNumbers.getText());
            dataMongo.put("- Size of Array", cbSelectSize.getSelectedItem());
            dataMongo.put("- Algorithm Used", "Bubble Sort");

            SortNumbers.insertOne(dataMongo);
        }

        if ( numbers > 4 && numbers <= 7 ) {
            lblSort.setText("Algorithm used: INSERTION SORT");
            Arrays.sort(data);
            for ( String sortNumber : data ) {
                txtSortNumbers.setText(sortNumber);
            }
            Document dataMongo = new org.bson.Document();
            dataMongo.put("- Unsorted Numbers", txtTypeNumbers.getText());
            dataMongo.put("- Sorted Numbers", txtSortNumbers.getText());
            dataMongo.put("- Size of Array", cbSelectSize.getSelectedItem());
            dataMongo.put("- Algorithm Used", "Insertion Sort");

            SortNumbers.insertOne(dataMongo);
        }

        if ( numbers > 7 ) {
            lblSort.setText("Algorithm used: QUICK SORT");
            Arrays.sort(data);
            for ( String sortNumber : data ) {
                txtSortNumbers.setText(sortNumber);
            }
            Document dataMongo = new org.bson.Document();
            dataMongo.put("- Unsorted Numbers", txtTypeNumbers.getText());
            dataMongo.put("- Sorted Numbers", txtSortNumbers.getText());
            dataMongo.put("- Size of Array", cbSelectSize.getSelectedItem());
            dataMongo.put("- Algorithm Used", "Quick Sort");

            SortNumbers.insertOne(dataMongo);

        }

    }//GEN-LAST:event_btnOrdenNumbersActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(AppDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOrdenNumbers;
    private javax.swing.JComboBox<String> cbSelectSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEnterNumbers;
    private javax.swing.JLabel lblSort;
    private javax.swing.JTextField txtSortNumbers;
    private javax.swing.JTextField txtTypeNumbers;
    // End of variables declaration//GEN-END:variables
}
