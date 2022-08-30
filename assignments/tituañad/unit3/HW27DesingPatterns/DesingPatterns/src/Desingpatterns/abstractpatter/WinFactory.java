package Desingpatterns.abstractpatter;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
class WinFactory extends GUIFactory{
  public Button createButton(){
    return(new WinButton());
  }
  public Menu createMenu(){
    return(new WinMenu());
  }
}
