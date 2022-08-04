
package ec.edu.espe.exam.view;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
class InputNumbersValidation {
    public boolean ValidationNumbers(String inputJT){
    
    int input;
     try{
            
        input=Integer.parseInt(inputJT);
        return true;
     
     }catch(NumberFormatException e){
        
         return false;
     }
    
    }
    
}
