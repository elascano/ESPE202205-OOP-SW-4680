package ec.edu.espe.apartaments.model;

/**
 *
 * @author Jose Imbaquinga,DCCO-ESPE, DEES Syntaxi Error
 */
public class Apartament {
    private String houseNumber;
    private String street;
    private  int numberOrFloors;
    private String houseMaterial;
    private String garaje;

    public Apartament() {
    }

    public Apartament(String houseNumber, String street, int numberOrFloors, String houseMaterial, String garaje) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.numberOrFloors = numberOrFloors;
        this.houseMaterial = houseMaterial;
        this.garaje = garaje;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberOrFloors() {
        return numberOrFloors;
    }

    public void setNumberOrFloors(int numberOrFloors) {
        this.numberOrFloors = numberOrFloors;
    }

    public String getHouseMaterial() {
        return houseMaterial;
    }

    public void setHouseMaterial(String houseMaterial) {
        this.houseMaterial = houseMaterial;
    }

    public String getGaraje() {
        return garaje;
    }

    public void setGaraje(String garaje) {
        this.garaje = garaje;
    }

    @Override
    public String toString() {
        return "Apartament{" + "houseNumber=" + houseNumber + ", street=" + street + ", numberOrFloors=" + numberOrFloors + ", houseMaterial=" + houseMaterial + ", garaje=" + garaje + '}';
    }
    
}
