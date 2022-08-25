
package ec.edu.espe.Template.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public abstract class CaffeineBeverage {
   public void prepareRecipe() { // template method
    boilWater();
    brew();
    pourInCup();
    if (wantsCondiments()) { 
        addCondiments(); 
    }
}

void boilWater(){
    System.out.println( "Boiling water" ); 
}
abstract void brew();
void pourInCup (){ 
    System.out.println( "Pouring into cup" );
}
abstract void addCondiments();
boolean wantsCondiments() { 
    return true;
} // a hook operation
}
        
