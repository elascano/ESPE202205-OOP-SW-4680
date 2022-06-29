package prueba;

import utils.JsonManager;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class Prueba {


    public static void main(String[] args) {
        JsonManager jsonManager;
        jsonManager = new JsonManager();
        
        jsonManager.write("book.Json", "{Nombre: El Principito, Autor: Antoine de Saint-Exupéry, editorial: Océano Historias gráficas}");
    }
    
}
