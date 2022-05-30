/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.spaSystem.model;

/**
 *
 * @author Steven Pozo,Elkin Pabón,Ercik Moreira,David Ponce, DCCO-ESPE, DEES Developers
 */
public class Spa {
    private String location;
    private String numberClient;
    private String name;
    private String manager;

    public Spa(String location, String numberClient, String name, String manager) {
        this.location = location;
        this.numberClient = numberClient;
        this.name = name;
        this.manager = manager;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNumberClient() {
        return numberClient;
    }

    public void setNumberClient(String numberClient) {
        this.numberClient = numberClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Spa{" + "location=" + location + ", numberClient=" + numberClient + ", name=" + name + ", manager=" + manager + '}';
    }
    
    //FUNCIONES:
    public void offerService(){
        
    }
    
    
}
