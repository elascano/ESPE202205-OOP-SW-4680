package ec.espe.edu.products.controller;

import ec.espe.edu.products.model.Product;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class ProductController {
    /* add: podemos agregar un producto o
    remove volver a escoger el producto*/
    Product product; 
    public boolean add(Product product, JFrame frmFrame){
        
        String message;
        message = product.getName()+ "Se agrego al sistema";
        JOptionPane.showMessageDialog(frmFrame, message);
    
    
    
    return true;
      }

   }
