package ec.edu.espe.calculator.model;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class BasicOperation {
    private int addend1;
    private int addend2;
    private int minuend;
    private int subtrahend;
    private float divisor;
    private int sum;
    private int difference;
    private int product;
    private float quotient;
    
    public int add(int addend1, int addend2) {
        //TODO the actual algorithm
        sum = addend1 + addend2;        
        return getSum();
    }
    
        public int subtract(int minuend, int subtrahend) {
        //TODO the actual algorithm
        difference = minuend - subtrahend;        
        return getDifference();
    }
        
        public int multiply(int multiplicand, int multiplier) {
        //TODO the actual algorithm
        product = multiplicand * multiplier;        
        return getProduct();
    }    
        
        public float add(float dividend, float divisor) {
        //TODO the actual algorithm
        quotient = dividend / divisor;        
        return getQuotient();
    }   
        
        public BasicOperation() {
        this.addend1 = 0;
        this.addend2 = 0;
        this.minuend = 0;
        this.subtrahend = 0;
        this.divisor = 0;
        this.sum = 0;
        this.difference = 0;
        this.product = 0;
        this.quotient = 0;
    }

        
    public BasicOperation(int addend1, int addend2, int minuend, int subtrahend, float divisor, int sum, int difference, int product, float quotient) {
        this.addend1 = addend1;
        this.addend2 = addend2;
        this.minuend = minuend;
        this.subtrahend = subtrahend;
        this.divisor = divisor;
        this.sum = sum;
        this.difference = difference;
        this.product = product;
        this.quotient = quotient;
    }

    /**
     * @return the addend1
     */
    private int getAddend1() {
        return addend1;
    }

    /**
     * @param addend1 the addend1 to set
     */
    private void setAddend1(int addend1) {
        this.addend1 = addend1;
    }

    /**
     * @return the addend2
     */
    private int getAddend2() {
        return addend2;
    }

    /**
     * @param addend2 the addend2 to set
     */
    private void setAddend2(int addend2) {
        this.addend2 = addend2;
    }

    /**
     * @return the minuend
     */
    private int getMinuend() {
        return minuend;
    }

    /**
     * @param minuend the minuend to set
     */
    private void setMinuend(int minuend) {
        this.minuend = minuend;
    }

    /**
     * @return the subtrahend
     */
    private int getSubtrahend() {
        return subtrahend;
    }

    /**
     * @param subtrahend the subtrahend to set
     */
    private void setSubtrahend(int subtrahend) {
        this.subtrahend = subtrahend;
    }

    /**
     * @return the divisor
     */
    private float getDivisor() {
        return divisor;
    }

    /**
     * @param divisor the divisor to set
     */
    private void setDivisor(float divisor) {
        this.divisor = divisor;
    }

    /**
     * @return the sum
     */
    private int getSum() {
        return sum;
    }

    /**
     * @param sum the sum to set
     */
    private void setSum(int sum) {
        this.sum = sum;
    }

    /**
     * @return the difference
     */
    private int getDifference() {
        return difference;
    }

    /**
     * @param difference the difference to set
     */
    private void setDifference(int difference) {
        this.difference = difference;
    }

    /**
     * @return the product
     */
    private int getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    private void setProduct(int product) {
        this.product = product;
    }

    /**
     * @return the quotient
     */
    private float getQuotient() {
        return quotient;
    }

    /**
     * @param quotient the quotient to set
     */
    private void setQuotient(float quotient) {
        this.quotient = quotient;
    }
    
    
}
