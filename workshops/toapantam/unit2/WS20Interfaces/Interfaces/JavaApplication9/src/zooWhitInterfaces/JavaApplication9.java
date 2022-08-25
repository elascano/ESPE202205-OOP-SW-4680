package zooWhitInterfaces;

/**
 *
 * @author MARTIN
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IAnimal iAnimal;
        
        iAnimal.feed();
        
        System.out.println("iAnimal ->" + iAnimal.getClass());
        iAnimal = new Cow("Cow " + iAnimal);
    }
    
}
