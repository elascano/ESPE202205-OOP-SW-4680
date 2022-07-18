package ec.edu.espe.Bookify.controller;

import ec.edu.espe.Bookify.view.FrmBookifyMainMenu;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



public class FormsHandler {

        public static void goToMainScreen(JFrame jFrameToClose){
        FrmBookifyMainMenu frmBookifyMainMenu = new FrmBookifyMainMenu ();
        jFrameToClose.setVisible(false);
        frmBookifyMainMenu .setVisible(true);
        }
   
}
