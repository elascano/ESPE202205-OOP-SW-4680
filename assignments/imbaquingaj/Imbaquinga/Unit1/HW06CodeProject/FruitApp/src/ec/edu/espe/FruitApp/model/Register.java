package ec.edu.espe.FruitApp.model;

/**
 *
 * @author Carlos Granda,Ronny Ibarra,Jose Imbaquinga, DCCO-ESPE, Syntax Error
 */
public class Register {
    private String name;
    private String code;
    private int amount;
    private String id;

    public Register() {
    }

    public Register(String name, String code, int amount, String id) {
        this.name = name;
        this.code = code;
        this.amount = amount;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Register{" + "name=" + name + ", code=" + code + ", amount=" + amount + ", id=" + id + '}';
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
