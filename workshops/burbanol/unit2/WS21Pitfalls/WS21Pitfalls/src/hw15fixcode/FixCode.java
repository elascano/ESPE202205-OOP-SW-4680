
package hw15fixcode;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class FixCode {
    public static String intToEnglishValue(int number){
        
        String[] arrayNumbersString = {"one", "two", "three", "four","five","six","seven","eight","nine","ten"};

        if(number>=1 && number <= arrayNumbersString.length){
            return arrayNumbersString[number-1];
          
        }else{
            return "Enter numbers from 1 to 10 :) ";
        }

    }
    
}
