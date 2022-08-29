package ec.edu.espe.SortApp.controller;

import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public class ValidationController {
    public void NumberValidation(JTextField txtField, java.awt.event.KeyEvent evt, JLabel lblfield, int length) {

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || Character.isISOControl(evt.getKeyChar())) {
            LengthValidation(txtField, evt, length);
            lblfield.setText("");
        } else {
            lblfield.setText("Enter Only digits");
            txtField.setEditable(false);
        }
    }
    private void LengthValidation(JTextField txtField, KeyEvent evt, int length) {
         String text = txtField.getText();

        if (text.length() <= length || Character.isISOControl(evt.getKeyChar())) {
            txtField.setEditable(true);
        } else {
            txtField.setEditable(false);
        }
         }
}
