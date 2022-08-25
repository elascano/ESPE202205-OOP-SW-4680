package utils;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author QUILUMBAQUIN JAIRO,STEVEN POZO DCC0-ESPE: CODEX++
 */
public class InputValidation {
    
      
    public void NumberValidation(JTextField txtField, java.awt.event.KeyEvent evt, JLabel lblfield, int length) {

        
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || Character.isISOControl(evt.getKeyChar())||evt.getKeyChar()==',') {
            LengthValidation(txtField, evt, length);
            lblfield.setText("");
        } else {
            lblfield.setText("Enter Only digits");
            txtField.setEditable(false);
        }
    }
    
    public void StringValidation(JTextField txtField, java.awt.event.KeyEvent evt, JLabel lblfield, int length) {

        if (Character.isAlphabetic(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar()) || Character.isISOControl(evt.getKeyChar())) {
            LengthValidation(txtField, evt, length);
            lblfield.setText("");
        } else {
            txtField.setEditable(false);
            lblfield.setText("Error");
        }

    }
    
    public void LengthValidation(JTextField txtField, java.awt.event.KeyEvent evt, int length) {

        String text = txtField.getText();

        if (text.length() <= length || Character.isISOControl(evt.getKeyChar())) {
            txtField.setEditable(true);
        } else {
            txtField.setEditable(false);
        }

    }
    
    
    
    
}
