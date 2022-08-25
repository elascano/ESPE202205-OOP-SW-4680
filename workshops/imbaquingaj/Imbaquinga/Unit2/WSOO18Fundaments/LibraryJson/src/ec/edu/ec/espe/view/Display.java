/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.espe.view;


import utils.JsonManager;
import ec.edu.espe.model.LibraryJson;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Imbaquinga DCCO-ESPE, Syntax Error
 */
public class Display {

    public static void main(String[] args) {
       JsonManager file;
        file = new JsonManager();
        String fileName;
        fileName = "./Books.json";
        String title;
        
        String date;
        String searchBook;
        Scanner imput;
        imput = new Scanner(System.in);
        ArrayList<JsonManager> book;
        book = new ArrayList<>();
        JsonManager data;
        
        System.out.println("ingrese el nombre");
        title = imput.nextLine();
        System.out.println("ingrese el fecha de publicacion");
        date = imput.nextLine();

       data= new JsonManager(title,date);
        book.add(data);
        file.write(fileName,book.toString()+"\n");
        
        
        file.read(fileName);
        
        System.out.println("ingrese el nombre del libro que desea buscar:");
        searchBook = imput.nextLine();
        file.find(fileName,searchBook);

    }
}
