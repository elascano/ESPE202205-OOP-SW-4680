
package exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Pacheco
 */
public class GestorTallerMecanico {

    public static void main(String[] args) {

        boolean salir;
        salir = false;
        double precioKit1;
        double tiempoKit1;
        Scanner textInput = new Scanner(System.in);
        int op;
        ArrayList<Pieza> piezaParaKit1 = new ArrayList<>();
        ArrayList<Kit> kitObra1 = new ArrayList<>();
        
        Pieza pieza1 = new Pieza(1, "Espatula", 13.4, 10);
        Pieza pieza2 = new Pieza(2, "martillo", 11.4, 10);
        Pieza pieza3 = new Pieza(3, "destornillador", 15.4, 10);
        piezaParaKit1.add(pieza1);
        piezaParaKit1.add(pieza2);
        piezaParaKit1.add(pieza3);
        
        Kit kit1 = new Kit("Reparcion carro", 1, 10, piezaParaKit1);
        precioKit1= precioKit(kit1);
        kit1.setPrecio(precioKit1);
        tiempoKit1= tiempoKit(kit1);
        kit1.setTiempoKit(tiempoKit1);
        kitObra1.add(kit1);
        
        System.out.println("La piza mas usada del kit 1 es: "+ piezaMasUsada(kit1));
        
        Obra obra = new Obra(1, "Casa de Juan", 30.3, 40, kitObra1);
        
        for (Kit kit : kitObra1) {
            System.out.println(kit.getNombre());
            System.out.println(kit.getPiezas().size());
            
        }
        
        
    }
    
    public static double precioKit(Kit kit){
        double precioKit=0;
        for (int i = 0; i < kit.getPiezas().size(); i++) {
            precioKit+= kit.getPiezas().get(i).getPrecio();
            
        }
        precioKit= precioKit - (precioKit*10/100);
        return precioKit;
    }
    public static double tiempoKit(Kit kit){
        double tiempoKit=0;
        for (int i = 0; i < kit.getPiezas().size(); i++) {
            tiempoKit+= kit.getPiezas().get(i).getTiempo();
            
        }
        tiempoKit= tiempoKit + (tiempoKit*10/100);
        return tiempoKit;
    }
    public static double precioObra(Obra obra){
        double precioObra=0;
        for (int i = 0; i <obra.getKits().size(); i++) {
            precioObra+= obra.getKits().get(i).getPrecio();
        }
        
        return precioObra;
    }
    public static String piezaMasUsada(Kit kit){
        int aux=0;
        String pieza="";
        for (int i = 0; i < kit.getPiezas().size(); i++) {
            if (aux<kit.getPiezas().get(i).getTiempo()) {
                aux=kit.getPiezas().get(i).getTiempo();
                pieza=kit.getPiezas().get(i).getNombre();
            }
        }
        
        return pieza;
    }

}
