package Desingpatterns.abstractpatter;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
abstract class GUIFactory {

    public static GUIFactory getFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return (new WinFactory());
        } else {
            return (new LinuxFactory());
        }
    }

    private static int readFromConfigFile(String os_type) {
        return 0;
        }

    public abstract Button createButton();

    public abstract Menu createMenu();
}
