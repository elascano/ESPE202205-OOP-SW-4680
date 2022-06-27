
package ec.edu.espe.AntSimulator1.model;

/**
 *
 * @author Erick Moreira, DCCO-ESPE, DEES Developers
 */
public class Area {
    
   private int width;
   private int height;
   private int limitNumberOfFoodPiles;
   private int tickDuration;

    @Override
    public String toString() {
        return "Area{" + "width=" + width + ", height=" + height + ", limitNumberOfFoodPiles=" + limitNumberOfFoodPiles + ", tickDuration=" + tickDuration + '}';
    }

   
   
    public Area(int width, int height, int limitNumberOfFoodPiles, int tickDuration) {
        this.width = width;
        this.height = height;
        this.limitNumberOfFoodPiles = limitNumberOfFoodPiles;
        this.tickDuration = tickDuration;
    }
    
   
   
   public void setup(){
       
   }
   public void addColony(Colony colony){
       
   }
   public void addAntEater(AntEater antEater){
       
   }
   public boolean isAnyFoodRemaining(){
       return false;
   }
   public Cell getCell(int row, int col ){
       return null;
   }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the limitNumberOfFoodPiles
     */
    public int getLimitNumberOfFoodPiles() {
        return limitNumberOfFoodPiles;
    }

    /**
     * @param limitNumberOfFoodPiles the limitNumberOfFoodPiles to set
     */
    public void setLimitNumberOfFoodPiles(int limitNumberOfFoodPiles) {
        this.limitNumberOfFoodPiles = limitNumberOfFoodPiles;
    }

    /**
     * @return the tickDuration
     */
    public int getTickDuration() {
        return tickDuration;
    }

    /**
     * @param tickDuration the tickDuration to set
     */
    public void setTickDuration(int tickDuration) {
        this.tickDuration = tickDuration;
    }
    
}

