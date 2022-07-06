package ec.edu.espe.library.view;

import Utils.CsvManager;
import ec.edu.espe.library.model.Book;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ronny Ibarra, DCCO-ESPE, Syntax Error
 */
public class main {

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
        
        System.out.println("ingrese el nombre");
        title = imput.nextLine();
        System.out.println("ingrese el autor");
        autor = imput.nextLine();
        System.out.println("ingrese el editorial");
        editorial = imput.nextLine();
        System.out.println("ingrese el fecha de publicacion");
        date = imput.nextLine();

        data = new Book(title,autor,editorial,date);
        book.add(data);
        file.write(fileName,book.toString()+"\n");
        
        
        file.read(fileName);
        
        System.out.println("ingrese el nombre del libro que desea buscar:");
        searchBook = imput.nextLine();
        file.find(fileName,searchBook);

    }
}

