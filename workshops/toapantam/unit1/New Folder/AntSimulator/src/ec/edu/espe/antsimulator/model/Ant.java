
package ec.edu.espe.antsimulator.model;

/**
 *
 * @author MARTIN
 */
public class Ant {
  
   Cell position;
   int weigth;
   
   public void run(){
       System.out.printIn("ant is running");         
   }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public Cell getPosition() {
        return position;
    }

    public int getWeigth() {
        return weigth;
    }

    public Ant(Cell position, int weigth) {
        this.position = position;
        this.weigth = weigth;
    }
}
