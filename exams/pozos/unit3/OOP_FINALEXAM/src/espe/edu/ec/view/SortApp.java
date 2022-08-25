package espe.edu.ec.view;
import espe.edu.ec.controller.BubbleSort;
import utils.InputValidation;
import espe.edu.ec.controller.InsertionSort;
import espe.edu.ec.controller.QuickSort;
import espe.edu.ec.controller.SortingContext;
import java.util.Arrays;
import javax.swing.JOptionPane;
import utils.FormsHandler;

/**
 *
 * @author QUILUMBAQUIN JAIRO,STEVEN POZO DCC0-ESPE: CODEX++
 */
public class SortApp extends javax.swing.JFrame {

    SortingContext contexto;
    InputValidation input;
    FormsHandler fmrs;

    public SortApp() {
        initComponents();
        input = new InputValidation();
        fmrs = new FormsHandler();
        TFsortedElements.setEditable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxNumberOfElements = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFsortedElements = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        TFElementsToBeSorted = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("SortApp");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel2.setText("Number of Elements to be sorted:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        cbxNumberOfElements.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(cbxNumberOfElements, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setText("Elements To be Sorted(0-9)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setText("Sorted Elements");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));
        jPanel1.add(TFsortedElements, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 200, -1));

        jToggleButton1.setText("Sort");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        TFElementsToBeSorted.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFElementsToBeSortedKeyTyped(evt);
            }
        });
        jPanel1.add(TFElementsToBeSorted, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 200, -1));

        lblError.setText("_");
        jPanel1.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFElementsToBeSortedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFElementsToBeSortedKeyTyped

        if (cbxNumberOfElements.getSelectedIndex() == 0) {
            TFElementsToBeSorted.setEditable(false);
        } else {
            input.NumberValidation(TFElementsToBeSorted, evt, lblError, cbxNumberOfElements.getSelectedIndex() - 1);
        }


    }//GEN-LAST:event_TFElementsToBeSortedKeyTyped

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        SetSortMethtod();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
    private javax.swing.JTextField TFElementsToBeSorted;
    private javax.swing.JTextField TFsortedElements;
    private javax.swing.JComboBox<String> cbxNumberOfElements;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblError;
    // End of variables declaration//GEN-END:variables

    void SetSortMethtod() {

        int elements;
        elements = cbxNumberOfElements.getSelectedIndex();
        switch (elements) {

            case 0 ->
                JOptionPane.showMessageDialog(this, "Enter a valid number of elements");
            case 1,2,3 -> {
                bubblemehtod();
                savetoDB(elements, bubblemehtod(), textFieldToArray(), "BubbleMethod");
            }
            case 4,5,6,7 -> {
                InsertionMethod();
                savetoDB(elements, InsertionMethod(), textFieldToArray(), "InsertionSort");
            }
            case 8,9,10 -> {
                QuickSortMethod();
                savetoDB(elements, QuickSortMethod(), textFieldToArray(), "QuickSort");
            }

        }

    }

    int[] bubblemehtod() {

        int ordered[];
        String toset;
        contexto = new SortingContext(new BubbleSort());
        ordered = contexto.setSortTrategy(textFieldToArray());
        toset = ArrayTostring(ordered);
        showSortArray(toset);

        return ordered;

    }

    int[] InsertionMethod() {

        int ordered[];
        String toset;
        contexto = new SortingContext(new InsertionSort());
        ordered = contexto.setSortTrategy(textFieldToArray());
        toset = ArrayTostring(ordered);
        showSortArray(toset);
        return ordered;

    }

    int[] QuickSortMethod() {

        int ordered[];
        String toset;
        contexto = new SortingContext(new QuickSort());
        ordered = contexto.setSortTrategy(textFieldToArray());
        toset = ArrayTostring(ordered);
        showSortArray(toset);
        return ordered;

    }

    int[] textFieldToArray() {

        int numbers[];
        numbers = TFElementsToBeSorted.getText().chars().map(x -> x - '0').toArray();
        return numbers;
    }

    String ArrayTostring(int ordered[]) {
        String toset;
        toset = Arrays.toString(ordered);
        return toset;
    }

    void showSortArray(String toset) {
        TFsortedElements.setText(toset);
    }

    void savetoDB(int size, int[] sort, int[] unsort, String algorithm) {
        fmrs.saveElementsToDB(size, sort, unsort, algorithm);

    }

}
