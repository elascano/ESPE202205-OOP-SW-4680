package ec.edu.espe.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Joel Arguello, DCCO-ESPE, BETTACODDERS
 */
public class FileManager {

    public static String readFile(String fileName) {

        String data = "From" + fileName + "-->{\"name\":\"Steven\"}";
        return data;
    }

    public static int add(int addend1, int addend2) {
        int sum;
        sum = addend1 + addend2;
        return sum;
    }

    public static String readJson(String pathJSON) {

        File file = new File(pathJSON);
        Scanner readerFile;
        String data;
        data = "";

        try {
            readerFile = new Scanner(file);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            if (!(file.exists())) {
                file.createNewFile();
                fileWriter = new FileWriter(pathJSON);

            } else {
                fileWriter = new FileWriter(pathJSON, true);
            }
            bw.append(FileManager.readFile("data.json"));
            bw.close();
            data = readerFile.nextLine();

        } catch (Exception e) {
            System.out.println(e);
        }
        return data;

    }

}
