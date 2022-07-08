package ec.edu.espe.Bookify.controller;

import ec.edu.espe.Bookify.model.User;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class BookifyController {
 
    public boolean UserLogin(User user){
        
        return !user.getUser().equals("");
    
    }
    
}
