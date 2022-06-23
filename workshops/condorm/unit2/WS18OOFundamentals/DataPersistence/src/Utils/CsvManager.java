/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author Mateo Condor, DCCO-ESPE, DAMAGE SE Team
 */
public class CsvManager extends FileManager {

    @Override
    public void insert() {

    }

    @Override
    public boolean write(String fileName, String data) {
        File file;
        file = new File(fileName);
        try ( FileWriter fileW = new FileWriter(fileName, true);) {
            fileW.write(data);
        } catch (Exception e) {
            System.out.println("An error has occurred");
        }

        return file.exists();
    }

    @Override
    public ArrayList<String> read(String fileName) {
        try ( BufferedReader fileR = new BufferedReader(new FileReader(fileName));) {
            String readerBooks;
            System.out.println("Los libros registrados son:\n");
            while ((readerBooks = fileR.readLine()) != null) {
                System.out.println(readerBooks);
            }
        } catch (Exception e) {
            System.out.println("An error has occurred");
        }
        return null;   
    }

    @Override
    public boolean delete(String fileName, String criterion) {
        return false;
    }

    @Override
    public ArrayList<String> find(String fileName, String criterion) {
        try ( BufferedReader fileF = new BufferedReader(new FileReader(fileName));) {
            String findBooks;
            while ((findBooks = fileF.readLine()) != null) {
                if(findBooks.contains(criterion)){
                    System.out.println("si se encontro el libro: \n" + findBooks);
                }
            }
        } catch (Exception e) {
            System.out.println("An error has occurred");
        }
        return null;
    }

    @Override
    public boolean update(String fileName, String criterion, String newData) {
        return false;
    }

}
