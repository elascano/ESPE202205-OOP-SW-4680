
package edu.espe.ec.csv.view;

import edu.espe.ec.csv.model.BookStore;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BookStore> al = listBooks(scanner);
        File f = new File("./books.csv");
        try(FileWriter fw = new FileWriter(f);){
            for (BookStore bookstore : al){
               fw.write(bookstore.toCsv() + "\n" );
            }
            
        } catch (Exception e){
            System.out.println("Se produjo un error");
        }
        
    }
    public static ArrayList<BookStore> listBooks(Scanner scanner){
        ArrayList<BookStore> al = new ArrayList<BookStore>();
        String id;
        String author;
        String title;
        String editorial;
        BookStore b;
        do{
            System.out.println("Id: ");
            id = scanner.nextLine();
            if (!id.equalsIgnoreCase("FIN")){
                System.out.println("Author: ");
                author = scanner.nextLine();
                System.out.println("Title: ");
                title = scanner.nextLine();
                System.out.println("Editorial: ");
                editorial = scanner.nextLine();
                b = new BookStore(id, author, title, editorial);
                al.add(b);
            } 
            
        }while (!id.equalsIgnoreCase("FIN"));
            return al;
    }
}
