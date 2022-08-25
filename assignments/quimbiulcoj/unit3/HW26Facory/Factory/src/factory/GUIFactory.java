/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
abstract class GUIFactory {
 
public static GUIFactory getFactory() {
int sys = readFromConfigFile("OS_TYPE");
if (sys == 0)
return (new WinFactory());
else
return (new LinuxFactory());
}

public abstract Button createButton();
public abstract Menu createMenu();
}
}
