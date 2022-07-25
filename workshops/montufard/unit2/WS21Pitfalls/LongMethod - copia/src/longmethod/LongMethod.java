package longmethod;

/**
 *
 * @author David Montufar, DCCO-ESPE, GADC.MSI
 */
public class LongMethod {

void PrintOwing(){
    printBanner();
    var outstanding = GetOutstanding();
}
private decimal GetOutstanding(){
    decimal outstanding = 0;
    foreach (Order order in _orders)
    {
        outstanding += order.Amount;
    }
    return outstanding
}
}
