package ec.edu.espe.FruitStore.Controller;

import ec.edu.espe.FruitStore.model.Fruit;
import utils.DatabaseManager;
import utils.Persistence;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class FruitController {
    Persistence persistence;
    public boolean register(Fruit fruit){
        persistence = new DatabaseManager();
        persistence.create("fruits", fruit);
        return true;
        
    }
    public boolean update(String criterion, Fruit fruit){
        persistence.update("Fruits", criterion, fruit);
        return false;
    }
}
