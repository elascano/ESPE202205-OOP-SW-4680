package longmethod;

/**
 *
 * @author Carlos Granda, DCCO-ESPE, Syntax Error
 */
public class LongMethod {
    
    void printOwing(){
        printBanner();
        var outstanding = outstanding;
        printDetails(outstanding);
    }
    
    private decimal outstanding(){
        decimal outstanding = 0;
        for each(order order inOrders){
            outstanding += order.amount;
        }
        return outstanding;
    }
    
    private void PrintDetails(Decimal outstanding){
        console.Write("name: " + name);
        console.Write("amount " + outstanding);
    }
    
    private static void printBanner() {
        console.WriteLine("************************");
        console.WriteLine("*** Customers Owner ****");
        console.WriteLine("************************");
    }
}


