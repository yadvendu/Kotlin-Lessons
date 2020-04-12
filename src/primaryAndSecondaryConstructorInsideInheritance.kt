open class Computer(var name:String, var brand:String){

}

class Laptop(name: String,brand: String,var batteryLife:Int): Computer(name,brand) {

}

class MacBook:Computer{
    val battery:Int

    constructor(name: String,brand: String,batteryLife: Int,number:Int):super(name,brand){
        battery = batteryLife
    }
}

class LenovoLaptop(name: String,brand: String,batteryLife: Int):Computer(name,brand){
    var manufacturedate:Int = -1

    constructor(name: String,brand: String,batteryLife: Int,manufactureDate:Int):this(name, brand, batteryLife){
        this.manufacturedate = manufacturedate
    }
}

