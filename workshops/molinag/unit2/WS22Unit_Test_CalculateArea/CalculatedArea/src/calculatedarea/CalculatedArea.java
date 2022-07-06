package calculatedarea;

import java.util.Scanner;

/**
 *
 * @author Molina Gustavo, DCCO-ESPE GADC.msi
 */
public class CalculatedArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio,diametro,area;
        System.out.println("Dame el radio del circulo");
        radio = teclado.nextDouble();
        diametro=radio*2;
        area=(3.1416)*(radio*radio);
        System.out.println("El diametro del circulo es:"+diametro);
        System.out.println("El area del circulo es: "+area);
    }
    
}
