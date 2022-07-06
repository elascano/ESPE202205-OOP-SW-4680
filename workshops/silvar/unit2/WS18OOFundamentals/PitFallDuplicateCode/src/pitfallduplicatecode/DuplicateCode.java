package pitfallduplicatecode;
import jdk.jshell.spi.ExecutionControl;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class DuplicateCode {

    static boolean intToEnglishValue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String intToEnglishValue(int i){
        if (i == 1){
            return "one";
        }
        if (i== 2){
            return "two";
        }
        if (i== 3){
            return "trhee";
        }
        if (i== 4){
            return "four";
        }
        if (i>4){
            return "error";
        }
        return null;
    }
}
