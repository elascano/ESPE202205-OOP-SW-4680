/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.arrays.view;

import ec.edu.arrays.model.book;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class arrays {

    
    public static void main(String[] args) {
        book[] books=new book[4];
        books[0]= new book("Clean Code", "Robert Cecil Martin", "Pearson Education", 2008);
        books[1]= new book("The Pragmatic Programmer", "Robert Cecil Martin", "Pearson Education", 2008);
        books[2]= new book("Code Complete", "Steve McConnell", "Microsoft Press", 1993);
        books[3]= new book("The Mythical Man-Month", "Fred Brooks", "Addison-Wesley", 1975);
        
        for(int i = 0; i < 4; i++){
            System.out.println("book"+ (i+1)+" -> "+ books[i]);
        }
        
        
    }
    

}
