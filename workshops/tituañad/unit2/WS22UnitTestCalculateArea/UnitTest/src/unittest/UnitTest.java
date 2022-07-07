
package unittest;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */



public class UnitTest {

 
    public static void main(String[] args) {
        
        double area;
        
        
        Triangulo triangulo;
        triangulo = new Triangulo(4, 4, 3);
        area= triangulo.demostrateAreaTriangle();
        
        triangulo = new Triangulo(5, 5, 5);
        area= triangulo.demostrateAreaTriangle();
        
        triangulo = new Triangulo(4.3, 3.4, 3);
        area= triangulo.demostrateAreaTriangle();
        
        System.out.println("Area Result:"+area);
     
    }
}
    
    

