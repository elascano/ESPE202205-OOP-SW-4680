package ec.edu.espe.stylesirelia.view;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.stylesirelia.controller.UserController;
import ec.edu.espe.stylesirelia.model.Connection;
import ec.edu.espe.stylesirelia.model.User;
import java.awt.Color;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class FrmLogin extends javax.swing.JFrame {

    int xMouse, yMouse;

    public FrmLogin() {
        Connection connection = new Connection();
        connection.connectionDataBase();

        initComponents();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        String path = System.getProperty("user.dir");
//        ImageIcon img = new ImageIcon(path +"\\src\\ec\\edu\\espe\\stylesirelia\\sources\\logoBettaCoders.png");
//        this.setIconImage(img.getImage());
        this.setTitle("Login Window");

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
        btnEnterLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textFieldUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        labelWelcome = new javax.swing.JLabel();
        btnLeaveLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exitButton = new javax.swing.JPanel();
        lbBtnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEnterLogin.setBackground(new java.awt.Color(51, 51, 51));
        btnEnterLogin.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        btnEnterLogin.setForeground(new java.awt.Color(242, 242, 242));
        btnEnterLogin.setText("Enter");
        btnEnterLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnterLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnterLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 160, 60));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        textFieldUser.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textFieldUser.setForeground(new java.awt.Color(204, 204, 204));
        textFieldUser.setText("Use your username");
        textFieldUser.setBorder(null);
        textFieldUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldUserMousePressed(evt);
            }
        });
        textFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUserActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 230, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        jLabel3.setText("Username");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        passwordField.setForeground(new java.awt.Color(102, 102, 102));
        passwordField.setText("*********");
        passwordField.setActionCommand("<Not Set>");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 230, 30));

        labelWelcome.setFont(new java.awt.Font("Freestyle Script", 0, 65)); // NOI18N
        labelWelcome.setText("Welcome to Styles by Irelia");
        jPanel1.add(labelWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 550, 130));

        btnLeaveLogin.setBackground(new java.awt.Color(51, 51, 51));
        btnLeaveLogin.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        btnLeaveLogin.setForeground(new java.awt.Color(242, 242, 242));
        btnLeaveLogin.setText("Leave");
        btnLeaveLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLeaveLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLeaveLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 160, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/stylesirelia/view/banner.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 340, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 340, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/stylesirelia/view/favicon.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));

        lbBtnExit.setBackground(new java.awt.Color(255, 255, 255));
        lbBtnExit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbBtnExit.setText("X");
        lbBtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBtnExit.setEnabled(false);
        lbBtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBtnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbBtnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbBtnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBtnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBtnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 896, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeaveLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLeaveLoginActionPerformed

    private void btnEnterLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterLoginActionPerformed

        User user;
        user = new User(textFieldUser.getText(), new String(passwordField.getPassword()));
        UserController userController = new UserController(user, "users");

        MongoCollection<Document> m = userController.getMongoCollection();

        Document doc = m.find(user.buildDocument()).first();

        if (doc != null) {
            FrmStylesIreliaMenu frmStylesIreliaMenu = new FrmStylesIreliaMenu();
            JOptionPane.showMessageDialog(null, "Welcome to the system");
            this.setVisible(false);
            frmStylesIreliaMenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "A one value is incorrect try again");
        }
    }//GEN-LAST:event_btnEnterLoginActionPerformed

    private void textFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldUserActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void lbBtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbBtnExitMouseClicked

    private void lbBtnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnExitMouseEntered
        exitButton.setBackground(Color.red);
        lbBtnExit.setForeground(Color.white);
    }//GEN-LAST:event_lbBtnExitMouseEntered

    private void lbBtnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnExitMouseExited
        exitButton.setBackground(Color.white);
        lbBtnExit.setForeground(Color.black);
    }//GEN-LAST:event_lbBtnExitMouseExited

    private void textFieldUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldUserMousePressed
        if (textFieldUser.getText().equals("Use your username")) {
            textFieldUser.setText("");
            textFieldUser.setForeground(Color.black);
        }
        if (String.valueOf(passwordField.getPassword()).isEmpty()) {
            passwordField.setText("*********");
            passwordField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_textFieldUserMousePressed

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        if (String.valueOf(passwordField.getPassword()).equals("*********")) {
            passwordField.setText("");
            passwordField.setForeground(Color.black);
        }
        if (textFieldUser.getText().isEmpty()) {
            textFieldUser.setText("Use your username");
            textFieldUser.setForeground(Color.gray);
        }
       
    }//GEN-LAST:event_passwordFieldMousePressed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterLogin;
    private javax.swing.JButton btnLeaveLogin;
    private javax.swing.JPanel exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JLabel lbBtnExit;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField textFieldUser;
    // End of variables declaration//GEN-END:variables
}
