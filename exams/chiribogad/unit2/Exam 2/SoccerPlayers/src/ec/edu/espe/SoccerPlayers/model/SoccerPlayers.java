package ec.edu.espe.SoccerPlayers.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class SoccerPlayers {
    private String name;
    private int age;
    private int number;
    private String team;

    public SoccerPlayers(String name, int age, int number, String team) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
}
