package Exception;
import java.util.Scanner;
/*15 Create  two other classes for particular vehicle types (trucks, submarines, ) 
that extend the Vehicle class to include fields and methods appropriate to the
particular type of vehicle.
a) In  the new classes you define, override the set_speed() method so that an
exception   is raised if the speed  to set to a value above a threshold of your
 choosing. You should do this by creating a new  exception  class for reporting 
 that a speed limit  violation has occurred.

b)  Modify the main() method provided in the file to exercise all of the code 
specified above.Keep it in the prog class. Be sure to have main() try to set the
speed of one of the vehicles past the speed limit,   */
class SpeedException extends RuntimeException{
    String msg;
    SpeedException(String msg){
        super(msg);
    }
}

class Vehicle{
    int speed;
   void set_speed() {
System.out.println("Vehicle speed is: " + speed);
   }
   
}

class Trucks extends Vehicle{
    int speed;
Trucks(int speed){
    this.speed = speed;
}
void set_speed() {
    System.out.println("Speed is" + speed);
}

public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter the speed of Truck: ");
    int speed = sc.nextInt();
    if(speed > 150){
        throw new SpeedException("Very high speed slow it down");
    }
    Trucks ob =  new Trucks(speed);
    ob.set_speed();
   }
   

}



    