package ec.edu.espe.controller;

import ec.edu.espe.model.Movie;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class MovieController {
    
    public boolean search(Movie movie, JFrame frmFrame){
        int reply;
        String message;
        message = movie.getTitle() + " \nThis title will be searched in the system";
        JOptionPane.showMessageDialog(frmFrame, message);
        message = " Are you sure that you want search this movie " + movie.getTitle() + " to the system?";
        reply = JOptionPane.showConfirmDialog(frmFrame, message);        
        if(reply== JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(frmFrame, "Searching");
        } else{
            JOptionPane.showMessageDialog(frmFrame, "It was not searching", "WARNING",JOptionPane.ERROR_MESSAGE);
        }
        return true;   
    }
}
