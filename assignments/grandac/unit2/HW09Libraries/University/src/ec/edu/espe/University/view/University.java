package ec.edu.espe.University.view;

import com.google.gson.Gson;
import ec.edu.espe.utils.FileManager;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author Carlos Granda, DCCO- ESPE, Syntax Error
 */
public class University {
    public static void main(String[] args) {
      //  FileManager fileManager=new FileManager();
        System.out.println("data recoverd from File Manager -->"+FileManager.readFile("File Manager"));
        String pathJSON;
        String dataJSON;

        pathJSON = System.getProperty("user.dir")+ "\\data.json";
        dataJSON=FileManager.readJson(pathJSON);
        
        System.out.println(dataJSON);
        
        int addend1=5;
        int addend2=4;
        int sum;
        sum=FileManager.add(addend1,addend2);
        System.out.println("the addition is -->"+sum);
    }
    
}

