package espe.edu.ec.Homework.model

import java.util.Scanner

class Vehicle  constructor(treademark:String, model:String, color:String, price: Float){
  var treademark:String
  var model:String
  var color:String
  var price:Float

  init {


      this.treademark = treademark;
      this.model =model;
      this.color =color;
      this.price=price;

  }


  //toString
  override fun toString(): String {
    return "Vehicle(treademark='$treademark', model='$model', color='$color', price=$price)\n"
  }

}


