package ec.edu.espe.codeproject.model;
import java.util.ArrayList;
/**
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode 
 */
public class Providers {
    private int cellPhone;
    private String providerName;
    private ArrayList<ViveresPedro> viveresPedros;
    private ArrayList<ProviderProduct> providerProduct;

    public Providers(int cellPhone, String providerName, ArrayList<ViveresPedro> viveresPedros) {
        this.cellPhone = cellPhone;
        this.providerName = providerName;
        this.viveresPedros = viveresPedros;
    }
  
     public void viveresPedro(ViveresPedro viverespedros){ 
      }
     
    public ArrayList<Money> getMoney(){
        ArrayList<Money> money = new ArrayList<>();
        
        return money;
    }
    /**
     * @return the cellPhone
     */
    public int getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return the providerName
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * @param providerName the providerName to set
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * @return the viveresPedros
     */
    public ArrayList<ViveresPedro> getViveresPedros() {
        return viveresPedros;
    }

    /**
     * @param viveresPedros the viveresPedros to set
     */
    public void setViveresPedros(ArrayList<ViveresPedro> viveresPedros) {
        this.viveresPedros = viveresPedros;
    }
    public void ProviderProduct(ArrayList<ProviderProduct> providerProduct){
        this.providerProduct = providerProduct;
    }
    
}
