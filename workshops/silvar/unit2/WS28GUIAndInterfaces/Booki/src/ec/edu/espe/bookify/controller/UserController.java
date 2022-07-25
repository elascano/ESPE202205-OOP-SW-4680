/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.bookify.controller;

import ec.edu.espe.bookify.model.User;
import utils.DatabaseManager;
import utils.Persistences;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class UserController {
    Persistences persistences;
    public boolean register(User user){
        persistences = new DatabaseManager();
        persistences.create("Users", user);
        return true;
    }
            
    public boolean update(String criterion, User user){
        persistences.update("Users", criterion, user);
        return true;
    }
}
