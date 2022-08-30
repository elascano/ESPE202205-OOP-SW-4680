package Desingpatterns.abstractpatter;

/**
 *
 * @author Daniela Tituaña, DCCO-ESPE, MyWayCode
 */
class LinuxFactory extends GUIFactory{
  public Button createButton(){
     return(new LinuxButton());
  }
  public Menu createMenu(){
    return(new LinuxMenu());
  }
}
