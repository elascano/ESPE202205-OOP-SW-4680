package exam;

import java.util.ArrayList;

/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class Exam 
{
    public static void main(String[] args) {
        ArrayList<Book> books;
        books = new ArrayList<>(); 
        
    for(int i=0; i<4;i++)   {
            books.add(i, new Book("Clean Code", "Robert C. Martin", "Editorial1", "2022"));
                            }
        sizeBooks= books.size();
        for(Book printf: books){
            System.out.println(printf);
                                }
        System.out.println("Number of books: "+ sizeBooks);
                                            }
    
}
