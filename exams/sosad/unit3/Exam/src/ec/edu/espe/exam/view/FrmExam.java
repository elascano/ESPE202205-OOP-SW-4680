package ec.edu.espe.exam.view;

import ec.edu.espe.exam.model.Controller;
import java.util.Arrays;

/**
 *
 * @author Diana Sosa
 */
public class FrmExam extends javax.swing.JFrame {

  

    public FrmExam() {
        initComponents();
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSort = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblEnterNumbers = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtList = new javax.swing.JTextArea();
        txtSorted = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 0));

        jPanel1.setForeground(new java.awt.Color(242, 242, 242));

        btnSort.setText("Ordenar");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        jLabel5.setText("Numeros");

        lblEnterNumbers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEnterNumbers.setForeground(new java.awt.Color(0, 51, 153));

        txtList.setColumns(20);
        txtList.setRows(5);
        jScrollPane3.setViewportView(txtList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSorted)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addComponent(lblEnterNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(lblEnterNumbers))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(txtSorted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btnSort)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        String number = txtList.getText();
        number = number.trim();
        String[] data = number.split("\n");
        int numbers = data.length;

        if (numbers > 0 && numbers <= 3) {
     
            Arrays.sort(data);
            for (String sortNumber : data) {
                txtList.setText(sortNumber);
            }
            txtSorted.setText(String.valueOf(data));

            Num num;
            String list;
            String size;
            String sort;
            String sorted;
            Controller controller;
            controller = new Controller();

            list = txtList.getText();
            sorted = txtSorted.getText();
            size = Integer.toString(txtSorted.toString().length());
            sort = "Bubble Sort";

            num = new Num(list, size, sort, sorted);
            controller.register(num, this);

            txtList.setText("");
            txtSorted.setText("");
            
            
        }
        if (numbers > 4 && numbers <= 7) {
            Arrays.sort(data);
            for (String sortNumber : data) {
                txtSorted.setText(sortNumber);
            }
            
            
            Num num;
            String list;
            String size;
            String sort;
            String sorted;
            Controller controller;
            controller = new Controller();

            list = txtList.getText();
            sorted = txtSorted.getText();
            size = Integer.toString(txtSorted.toString().length());
            sort = "Insertion Sort";

            num = new Num(list, size, sort, sorted);
            controller.register(num, this);

            txtList.setText("");
            txtSorted.setText("");
            
        }
        if (numbers > 7) {
            Arrays.sort(data);
            for (String sortNumber : data) {
                txtSorted.setText(sortNumber);
            }
            
                Num num;
            String list;
            String size;
            String sort;
            String sorted;
            Controller controller;
            controller = new Controller();

            list = txtList.getText();
            sorted = txtSorted.getText();
            size = Integer.toString(txtSorted.toString().length());
            sort = "Quick Sort";

            num = new Num(list, size, sort, sorted);
            controller.register(num, this);

            txtList.setText("");
            txtSorted.setText("");
        }
    }//GEN-LAST:event_btnSortActionPerformed


    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblEnterNumbers;
    private javax.swing.JTextArea txtList;
    private javax.swing.JTextField txtSorted;
    // End of variables declaration//GEN-END:variables
}
