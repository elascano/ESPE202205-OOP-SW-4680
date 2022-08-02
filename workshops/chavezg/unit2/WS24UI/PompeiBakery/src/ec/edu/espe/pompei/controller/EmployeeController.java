/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pompei.controller;

import ec.edu.espe.pompei.model.Employee;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class EmployeeController {
    
    public boolean add(JFrame jFrame,Employee employee){
        //TDO, save this information in database
        if(employee.getName().equals("")){
            return false;
        }
        else{
            JOptionPane.showMessageDialog(jFrame, employee.getName());
            return true;
        }
    }
    
}
