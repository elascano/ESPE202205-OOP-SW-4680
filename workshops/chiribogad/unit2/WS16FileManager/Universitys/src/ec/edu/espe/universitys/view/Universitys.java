package ec.edu.espe.universitys.view;

import ec.edu.espe.utils.FileManager;

/**
 *
 * @author danyc
 */
public class Universitys {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        
        System.out.println("data recoverd from Filr manager -> " + fileManager.readFile("students.json"));

        int addend1 = 5;
        int addend2 = 46;
        int sum;
        sum = fileManager.add(addend1, addend2);
        System.out.println("the addition es -> " + sum);
    }
}
