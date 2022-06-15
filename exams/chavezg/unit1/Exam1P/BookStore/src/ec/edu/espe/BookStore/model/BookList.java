/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.BookStore.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Genaro Chavez, DCCO-ESPE
 */
public class BookList {
      
    private List<Book> listBook;
    

    public BookList() {
        
        listBook = new ArrayList<Book>();
    }
    
    public void addBook(Book book){
        
        listBook.add(book);
        
    }
    
    
    public int sizeList(){
        return listBook.size();
    }
    
    public void printBook(){
        Book aux = new Book();
        Iterator it = listBook.iterator();
        while(it.hasNext()){
            aux = (Book) it.next();
            System.out.println(aux.toString());
        }
    }
    
}
