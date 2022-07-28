/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.controller;

import ec.edu.espe.Bookify.model.Users;
import utils.DataBaseManager;
import utils.Persistance;

/**
 *
 * @author H301
 */
public class UsersController {
    
    Persistance persistance= new DataBaseManager();
    
public boolean register(Users user){
    
    persistance.create("User", user);
    
return true;
}
public boolean update(String criterion, Users user){
    
    persistance.update("Users", criterion,user);
    return true;
}



}
