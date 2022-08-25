
package ec.edu.espe.area.controller;



/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class Function {
    
    public double getOfCalculator(double apothem, int side){
     
        
       double area;
       double perimeter;
       perimeter = (7*side);
       
       area = (perimeter * apothem)/2;
       
       return area;
        
    }
}
