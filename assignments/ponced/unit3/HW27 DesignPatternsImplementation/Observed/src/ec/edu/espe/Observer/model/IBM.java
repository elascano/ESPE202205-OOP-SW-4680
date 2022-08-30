
package ec.edu.espe.Observer.model;

/**
 *
 * @author Diego Ponce, DCCO-ESPE, DEES Developers
 */
public class IBM {
    private String symbol;
    private double price;
    public IBM(String symbol, double price ) {
        this.symbol = symbol;
        this.price = price
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price price;
    }
    notifyObservers(new Double(price);
    public String getSymbol() {
        return symbol;
    }
    public void selSymbol(String symbol) {
        this.symbol = symbol;
    notifyObservers(symbol);
}
