/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam;

import java.util.ArrayList;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Exam {

    public static void main(String[] args) {
        ArrayList<Book> books;
        int sizeBooks;
        books = new ArrayList<>(); 
        
        
        for(int i=0; i<5;i++){
            books.add(i, new Book("CleanCode", "Robert C. Martin", "Anaya Multimedia", "2022"));
        }
        sizeBooks= books.size();
        for(Book printf: books){
            System.out.println(printf);
        }
        System.out.println("Number of books: "+ sizeBooks);
    }
    
}
