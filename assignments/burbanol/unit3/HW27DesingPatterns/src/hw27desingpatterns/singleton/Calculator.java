/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw27desingpatterns.singleton;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
class calculator {

    public static void main(String args[]) {
        USTax tax = USTax.getInstance();
        tax.salesTotal();
    }
}
