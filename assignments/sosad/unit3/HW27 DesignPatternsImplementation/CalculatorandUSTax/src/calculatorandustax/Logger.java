
package calculatorandustax;

/**
 *
 * @author Diana Sosa, DCCO-ESPE MyWayCode
 */
public class Logger {
    private static Logger log;
    private Logger(){
    }
    
    public static Logger getInstance(){
        if(log==null){
            log=new Logger();
        }
        return log;
    }
    
    public void log(String mesf){
        System.out.println(mesf);
    }
}
