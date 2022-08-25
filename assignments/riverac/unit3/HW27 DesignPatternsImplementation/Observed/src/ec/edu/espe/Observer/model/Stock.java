
package ec.edu.espe.Observer.model;

import java.util.ArrayList;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Stock {
    protected String symbol;
    protected double price;
    private ArrayList investors = new ArrayList();
    public Stock(){}
public void addObserver( lInvestor iinvestor){
investors.add|( investor );
public void deleteObserver( Investor investor){
investors.remove( iinvestor)
public void notityObservers(Object args){
Iterator i investors.iterator();
while( i.hasNext()){
lInvestor investor (lInvestorji.next():
investor.update(this,args
}
