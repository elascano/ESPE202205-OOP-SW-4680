/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.viveresP.controller.InventoryController;

/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class CostumerController {
        public boolean addToStock(Inventory inventory){
        //TODO, save this information in the database
        if(inventory.getMake().equals(¨"")){
            return false;
    }
        else{
            JOptionPnae.showMessageDialog(jFrame,inventory.getMake());    
                return true;
        }
    }
    
}
    
}
