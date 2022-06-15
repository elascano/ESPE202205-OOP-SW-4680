
package ec.edu.espe.calculator.model;

/**
 *
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class BasicOperation {
    private int addend1;
    private int addend2;
    private int minuend;
    private float divisor;
    private int sum;
    private int difference;
    private int product;
    private float quotient;

    public int add(int addend1, int addend2){
        //TODO the actual algorithm
        sum = addend1 + addend2;
        
        return getSum();
    }
    
        public int subtract(int minuend, int subtrahend){
        //TODO the actual algorithm
        difference = minuend - subtrahend;
        
        return getDifference();
    }
        
        public int multiply(int multiplicand, int multiplier){
            product = multiplicand * multiplier;
            return product;
        }
        
           public float divide(float dividend, float divisor){
            quotient = dividend / divisor;
            return quotient;
        }
    public BasicOperation() {
        this.addend1 = 0;
        this.addend2 = 0;
        this.minuend = 0;
        this.divisor = 0;
        this.sum = 0;
        this.difference = 0;
        this.product = 0;
        this.quotient = 0;
    }
          
    public BasicOperation(int addend1, int addend2, int minuend, float divisor, int sum, int sifference, int product, float quotient) {
        this.addend1 = addend1;
        this.addend2 = addend2;
        this.minuend = minuend;
        this.divisor = divisor;
        this.sum = sum;
        this.difference = difference;
        this.product = product;
        this.quotient = quotient;
    }

    
    
    /**
     * @return the addend1
     */
    public int getAddend1() {
        return addend1;
    }

    /**
     * @param addend1 the addend1 to set
     */
    public void setAddend1(int addend1) {
        this.addend1 = addend1;
    }

    /**
     * @return the addend2
     */
    public int getAddend2() {
        return addend2;
    }

    /**
     * @param addend2 the addend2 to set
     */
    public void setAddend2(int addend2) {
        this.addend2 = addend2;
    }

    /**
     * @return the minuend
     */
    public int getMinuend() {
        return minuend;
    }

    /**
     * @param minuend the minuend to set
     */
    public void setMinuend(int minuend) {
        this.minuend = minuend;
    }

    /**
     * @return the divisor
     */
    public float getDivisor() {
        return divisor;
    }

    /**
     * @param divisor the divisor to set
     */
    public void setDivisor(float divisor) {
        this.divisor = divisor;
    }

    /**
     * @return the sum
     */
    public int getSum() {
        return sum;
    }

    /**
     * @param sum the sum to set
     */
    public void setSum(int sum) {
        this.sum = sum;
    }

    /**
     * @return the sifference
     */
    public int getDifference() {
        return difference;
    }

    /**
     * @param sifference the sifference to set
     */
    public void setDifference(int sifference) {
        this.difference = sifference;
    }

    /**
     * @return the product
     */
    public int getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(int product) {
        this.product = product;
    }

    /**
     * @return the quotient
     */
    public float getQuotient() {
        return quotient;
    }

    /**
     * @param quotient the quotient to set
     */
    public void setQuotient(float quotient) {
        this.quotient = quotient;
    }
}
