class Car {
    private Engine engine;
    
    public Car(){
        this.engine = new Engine();
    }
    
    public void startCar(){
    engine.start();
    System.out.println("Car started");
    }
        
    }
    
    class Engine {
    public void start(){
        System.out.println("Engine started");
    }
        
    }
    
    public class TightCoupling {
        
        public static void main(String[] args) {
            
            Car toyota = new Car();
            toyota.startCar();
        }
    
    }
    