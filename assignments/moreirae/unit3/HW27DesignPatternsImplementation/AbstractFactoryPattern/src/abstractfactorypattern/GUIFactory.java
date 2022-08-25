
package abstractfactorypattern;

import java.awt.Button;
import java.awt.Menu;

/**
 *
 * @author Erick Moreira, DCCO-ESPE DEES Developers
 */

public abstract class GUIFactory {
    public static GUIFactory getFactory() {
    int sys = readFromConfigFile("OS_TYPE");
    if (sys == 0){
return (new WinFactory());
    }
    else{
return (new LinuxFactory());
    }
}

    private static int readFromConfigFile(String os_type) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

public abstract Button createButton();
public abstract Menu createMenu();

}
