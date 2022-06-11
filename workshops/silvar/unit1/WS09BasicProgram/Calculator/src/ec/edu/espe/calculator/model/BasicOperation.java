package ec.edu.espe.calculator.model;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class BasicOperation {
    private int addend1;
    private int addend2;
    private int minuend;
    private int sustrahend;
    private int multiplicand;
    private int multiplicator;
    private float dividend;
    private float divisor; 
    private int sum;
    private int difference;
    private int product; 
    private float quotient;
    
    public int add(int addend1, int addend2){
        setSum(addend1 + addend2);
        return getSum();
    }
    
    public int substract(int minuend, int sustrahend){
        setDifference(minuend - sustrahend);
        return getDifference();
    }
    
    public int multiply(int multiplicand, int multiplicator){
        setProduct(multiplicand & multiplicator);
        return getProduct();
    }  

    public float divide(float dividend, float divisor){
        setQuotient(dividend / divisor);
        return getQuotient();
    }
    public BasicOperation() {
        this.addend1 = 0;
        this.addend2 = 0;
        this.minuend = 0;
        this.sustrahend = 0;
        this.multiplicand = 0;
        this.multiplicator = 0;
        this.dividend = 0;
        this.divisor = 0;
        this.sum = 0;
        this.difference = 0;
        this.product = 0;
        this.quotient = 0;
    }
    
    public BasicOperation(int addend1, int addend2, int minuend, int sustrahend, int multiplicand, int multiplicator, float dividend, float divisor, int sum, int difference, int product, float quotient) {
        this.addend1 = addend1;
        this.addend2 = addend2;
        this.minuend = minuend;
        this.sustrahend = sustrahend;
        this.multiplicand = multiplicand;
        this.multiplicator = multiplicator;
        this.dividend = dividend;
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
     * @return the sustrahend
     */
    public int getSustrahend() {
        return sustrahend;
    }

    /**
     * @param sustrahend the sustrahend to set
     */
    public void setSustrahend(int sustrahend) {
        this.sustrahend = sustrahend;
    }

    /**
     * @return the multiplicand
     */
    public int getMultiplicand() {
        return multiplicand;
    }

    /**
     * @param multiplicand the multiplicand to set
     */
    public void setMultiplicand(int multiplicand) {
        this.multiplicand = multiplicand;
    }

    /**
     * @return the multiplicator
     */
    public int getMultiplicator() {
        return multiplicator;
    }

    /**
     * @param multiplicator the multiplicator to set
     */
    public void setMultiplicator(int multiplicator) {
        this.multiplicator = multiplicator;
    }

    /**
     * @return the dividend
     */
    public float getDividend() {
        return dividend;
    }

    /**
     * @param dividend the dividend to set
     */
    public void setDividend(float dividend) {
        this.dividend = dividend;
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
     * @return the difference
     */
    public int getDifference() {
        return difference;
    }

    /**
     * @param difference the difference to set
     */
    public void setDifference(int difference) {
        this.difference = difference;
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
