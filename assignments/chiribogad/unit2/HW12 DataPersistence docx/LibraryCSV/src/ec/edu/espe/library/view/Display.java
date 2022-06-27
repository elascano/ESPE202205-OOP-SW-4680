package ec.edu.espe.library.view;

import Utils.CsvManager;
import ec.edu.espe.library.model.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 * @author Daniel Chiriboga, DCCO-ESPE, DAMAGE SE
 */
public class Display {

    public static void main(String[] args) {
        CsvManager file;
        file = new CsvManager();
        String fileName;
        fileName = "./Books.csv";
        String title;
        String autor;
        String editorial;
        String date;
        String searchBook;
        Scanner imput;
        imput = new Scanner(System.in);
        ArrayList<Book> book;
        book = new ArrayList<>();
        Book data;
        
        System.out.println("Insert name:");
        title = imput.nextLine();
        System.out.println("Insert author:");
        autor = imput.nextLine();
        System.out.println("Insert editorial:");
        editorial = imput.nextLine();
        System.out.println("Insert the publication date:");
        date = imput.nextLine();

        data = new Book(title,autor,editorial,date);
        book.add(data);
        file.write(fileName,book.toString()+"\n");

        file.read(fileName);
        
        System.out.println("Insert the name of the book you want to search for:");
        searchBook = imput.nextLine();
        file.find(fileName,searchBook);
    }

}
