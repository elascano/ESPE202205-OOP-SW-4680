
package hw15fixcode;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
public class HW15FixCode {

    
    public static void main(String[] args) {
        
        System.out.println(intToEnglishValue(4));
        
        
    }
    
    
    public static String intToEnglishValue(int number){
        
        String[] arrayNumbersString = {"one", "two", "three", "four","five","six","seven","eight","nine","ten"};

        if(number>=1 && number <= arrayNumbersString.length){
            return arrayNumbersString[number-1];
          
        }else{
            return "Enter numbers from 1 to 10 :) ";
        }

    }
}
