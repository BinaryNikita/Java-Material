package assgn;

abstract class Vehicle {
   // abstract class
    abstract void start();

    static int model;
    //concrete method
    void stop(){
        System.out.println("Vehicle is stopping!");
    }
}
abstract class Bike extends Vehicle{
    
}

class Truck extends Vehicle{
     
    void start(){
        System.out.println("Truck is starting");
    }

}

class Abstraction{
    public static void main(String[] args) {
        Truck ob = new Truck();
        System.out.println(ob);
        ob.start();
        ob.stop();
        ob.model = 2001;
        System.out.println(ob.model);
    }
}
