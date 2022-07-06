package pitfallduplicatecode;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class FixCode {
    public static String intToEnlgishValue(int number){
        String[] arrayNumberString = {"one", "two", "three", "four", "five", "six", "seven"};
        if (number>=1 && number >=arrayNumberString.length){
            return arrayNumberString[number-1];
        }else{
            return "enter number from 1 to 10";
        }
    }

    static boolean intToEnglishValue(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
