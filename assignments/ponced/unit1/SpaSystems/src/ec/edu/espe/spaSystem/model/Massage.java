package ec.edu.espe.spaSystem.model;

/**
 *
 * @author Steven Pozo,Elkin Pabón,Ercik Moreira,David Ponce, DCCO-ESPE, DEES Developers
 */
public class Massage {
    private String duration;
    private String speciality;
    private String name;
    private float cost;

    public Massage() {
        
    }

    public Massage(String duration, String speciality, String name, float cost) {
        this.duration = duration;
        this.speciality = speciality;
        this.name = name;
        this.cost = cost;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Massage{" + "duration=" + duration + ", speciality=" + speciality + ", name=" + name + ", cost=" + cost + '}';
    }
    
    //FUNCIONES:
    public void timemassage(){
        
    }
    public void costMassage(){
        
    }
    public void type(){
        
    }
    
}
