
package longmethods;

import java.util.Scanner;

/**
 *
 * @author Roberto Bedon, DCCO-ESPE, BettaCoders
 */
public class MaxMin_Resolution {
     int max = 0;
    int min = 0;

 System.out.println("Ingrese 5 numeros enteros para identificar el numero mayor y el menor de esa serie");

 
  Scanner numero = new Scanner(System.in);

    //Se ingresan los 5 números enteros para evaluarlos
    for (int i = 1; i < 6; i++) { 
   
    System.out.print(i + " Ingrese un numero: "); 
    int num = numero.nextInt(); 
    if (min != 0 && max != 0) {
    if (num > max) {
    max = num;
}
    if (num < min) {
        min = num;
}
        }
    
    else
{
       min = num;
       max = num;
}
     }
       System.out.println("El numero Maximo es: " + max);
       System.out.println("El numero Minimo es: " + min);


   }
 
}
