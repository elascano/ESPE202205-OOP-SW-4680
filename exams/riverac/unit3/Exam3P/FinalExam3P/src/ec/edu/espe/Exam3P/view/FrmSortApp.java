package ec.edu.espe.Exam3P.view;

import ec.edu.espe.Exam3P.controller.ListNumbersController;
import ec.edu.espe.Exam3P.controller.SortingContext;
import ec.edu.espe.Exam3P.model.ListNumbers;
import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class FrmSortApp extends javax.swing.JFrame {

    /**
     * Creates new form SortApp
     */
    public FrmSortApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbSorting = new javax.swing.JLabel();
        btnOrganize = new javax.swing.JButton();
        txtDisorderedNumbers = new javax.swing.JTextField();
        lbDisorderedNumbers = new javax.swing.JLabel();
        lbOrderedNumbers = new javax.swing.JLabel();
        txtNumberInOrder = new javax.swing.JTextField();
        lbAlgorithm = new javax.swing.JLabel();
        txtAlgorithm = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSorting.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lbSorting.setText("Sorting Algorithms");
        getContentPane().add(lbSorting, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        btnOrganize.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        btnOrganize.setText("Organize");
        btnOrganize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizeActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrganize, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        txtDisorderedNumbers.setToolTipText("Enter the numbers you want to order and see what algorithm was used");
        txtDisorderedNumbers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDisorderedNumbersKeyTyped(evt);
            }
        });
        getContentPane().add(txtDisorderedNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 180, -1));

        lbDisorderedNumbers.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lbDisorderedNumbers.setText("Disordered Numbers:");
        getContentPane().add(lbDisorderedNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 170, -1));

        lbOrderedNumbers.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lbOrderedNumbers.setText("Ordered Numbers:");
        getContentPane().add(lbOrderedNumbers, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 150, -1));

        txtNumberInOrder.setEnabled(false);
        getContentPane().add(txtNumberInOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 180, -1));

        lbAlgorithm.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        lbAlgorithm.setText("Algorithm:");
        getContentPane().add(lbAlgorithm, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        txtAlgorithm.setEnabled(false);
        getContentPane().add(txtAlgorithm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 180, -1));

        btnReturn.setFont(new java.awt.Font("Kristen ITC", 0, 18)); // NOI18N
        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrganizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganizeActionPerformed
        String numberInDesorder;
        SortingContext sortingContext;
        sortingContext = new SortingContext();
        numberInDesorder = txtDisorderedNumbers.getText();
        ListNumbers listNumbers = new ListNumbers();
        String[] numberToSort = numberInDesorder.split(",");
        int[] numbersOfList= new int[numberToSort.length];
        listNumbers.setListOfNumbersDisordered(numbersOfList);
        for (int i = 0; i < numberToSort.length; i++) {
            numbersOfList[i] = Integer.parseInt(numberToSort[i]);
        }
        
        sortingContext.setSortStrategy(numbersOfList,listNumbers);
        txtNumberInOrder.setText(Arrays.toString(listNumbers.getListOfNumberOrdered()));
        txtAlgorithm.setText(listNumbers.getSortAlgorithm());
    }//GEN-LAST:event_btnOrganizeActionPerformed

    private void txtDisorderedNumbersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDisorderedNumbersKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Enter only numbers, for example: 1, 2, 3, etc.. ");
      }
    }//GEN-LAST:event_txtDisorderedNumbersKeyTyped

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmMenu frmMenu = new FrmMenu();
        frmMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSortApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrganize;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbAlgorithm;
    private javax.swing.JLabel lbDisorderedNumbers;
    private javax.swing.JLabel lbOrderedNumbers;
    private javax.swing.JLabel lbSorting;
    private javax.swing.JTextField txtAlgorithm;
    private javax.swing.JTextField txtDisorderedNumbers;
    private javax.swing.JTextField txtNumberInOrder;
    // End of variables declaration//GEN-END:variables
}