package calculatorarea;

import java.util.Scanner;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class CalculatorArea {

   
    public static void main(String[] args) {
        
       
        Scanner teclado = new Scanner(System.in);
        double radio,diametro,area;
        double Pi = 3.1416;
        System.out.println("Cual es el radio del círculo");
        radio = teclado.nextDouble();
        diametro=radio*2;
        area=(Pi)*(radio*radio);
        System.out.println("El diametro del circulo es:" +diametro);
        System.out.println("El area del circulo es: " +area);        
        
    }
    
}
