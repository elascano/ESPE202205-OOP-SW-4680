package ec.edu.espe.codeproject.model;

import org.bson.Document;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
public abstract class Abstract {
       public abstract Document buildDocument();
       private String name;
       private int unit;
       private int id;
       private int cellphone;

    public Abstract(String name, int unit, int id, int cellphone) {
        this.name = name;
        this.unit = unit;
        this.id = id;
        this.cellphone = cellphone;
    }

    public Abstract() {
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the unit
     */
    public int getUnit() {
        return unit;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(int unit) {
        this.unit = unit;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cellphone
     */
    public int getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }
       
}
    
    

