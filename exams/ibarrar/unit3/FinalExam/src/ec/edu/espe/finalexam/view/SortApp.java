package ec.edu.espe.finalexam.view;

import ec.edu.espe.finalexam.controller.ListNumbersController;
import ec.edu.espe.finalexam.controller.SortingContext;
import ec.edu.espe.finalexam.model.ListNumbers;
import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronny Ibarra, Ricardo Imbaquinga, DCCO- ESPE, Syntax Error
 */
public class SortApp extends javax.swing.JFrame {

    /**
     * Creates new form SortApp
     */
    public SortApp() {
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

        btnSort = new javax.swing.JButton();
        txtNumberInDesorder = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNumberInOrder = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAlgorithm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setPreferredSize(new java.awt.Dimension(550, 290));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });
        getContentPane().add(btnSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 192, -1, -1));
        getContentPane().add(txtNumberInDesorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 145, -1));

        jLabel2.setText("Add Numbers");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setText("Numbers in order");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 101, -1));

        txtNumberInOrder.setEnabled(false);
        getContentPane().add(txtNumberInOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 145, -1));

        jLabel4.setText("Algorithm ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        txtAlgorithm.setEnabled(false);
        getContentPane().add(txtAlgorithm, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 130, 114, -1));

        jLabel5.setBackground(new java.awt.Color(102, 255, 102));
        jLabel5.setText("Sort Numbers");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        String numberInDesorder;
        SortingContext sortingContext;
        sortingContext = new SortingContext();
        numberInDesorder = txtNumberInDesorder.getText();
        ListNumbers listNumbers = new ListNumbers();
        String[] numberToSort = numberInDesorder.split(",");
        int[] numbersOfList= new int[numberToSort.length];
        listNumbers.setListOfNumbersDisordered(numbersOfList);
        for (int i = 0; i < numberToSort.length; i++) {
            numbersOfList[i] = Integer.parseInt(numberToSort[i]);
        }
        
        sortingContext.setSortStrategy(numbersOfList,listNumbers);
        txtNumberInOrder.setText(Arrays.toString(listNumbers.getListOfNumberOrdered()));
        txtAlgorithm.setText(listNumbers.getSort());
    }//GEN-LAST:event_btnSortActionPerformed

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
            java.util.logging.Logger.getLogger(SortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAlgorithm;
    private javax.swing.JTextField txtNumberInDesorder;
    private javax.swing.JTextField txtNumberInOrder;
    // End of variables declaration//GEN-END:variables
}
