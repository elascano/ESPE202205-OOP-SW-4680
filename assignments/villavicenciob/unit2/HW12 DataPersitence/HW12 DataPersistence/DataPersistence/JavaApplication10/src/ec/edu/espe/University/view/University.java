package ec.edu.espe.University.view;

import com.google.gson.Gson;
import ec.edu.espe.utils.FileManager;
import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.JsonManager;





/**
 *
 * @author Josue Villavicencio, DCCO - ESPE,MyWayCode
 */
public class University {
    public static void main(String[] args) {
      String data="data.json";
      String json;
      json = "{\"Book\":\"Clean code\":{\n"
              +"\"autor\":\"Robert Martin\",\n"
              +"\"date\":\"2008\"\n";
      
      JsonManager jsonManager = new  JsonManager();
      jsonManager.write(data,json);
      jsonManager.read(data);
        System.out.println(jsonManager.read(data));
    }
    

}

