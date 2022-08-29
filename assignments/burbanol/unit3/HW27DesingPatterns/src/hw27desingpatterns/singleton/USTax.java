/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw27desingpatterns.singleton;

/**
 *
 * @author Luis Burbano, DCCO- ESPE, BettaCoders
 */
class USTax{
  private static USTax instance;
  private USTax(){};
  public static USTax getInstance(){
    if(instance == null)
       instance=new USTax();
    return instance;
  }
  public float salesTotal(){
      System.out.println("Singleton");
      return 0;
  }
}
  
