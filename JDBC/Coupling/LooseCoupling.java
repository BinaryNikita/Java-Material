
/**
 * InnerLooseCoupling
 */
interface Engine2 {
    void start();
}

class ElectricEngine implements Engine2 {

    public void start() {
        System.out.println("Electric Engine strated");
    }
}

class PetrolEngine implements Engine2 {

    public void start() {
        System.out.println("Petrol Engine strated");
    }
}

class Car2 {
    private Engine2 engine;

    public Car2(Engine2 engine) {
        this.engine = engine;
    }

    public void startCar(){
        engine.start();
        System.out.println("Car started");
    }

}

public class LooseCoupling {
    public static void main(String[] args) {

        Engine2 electric = new ElectricEngine();
        Engine2 petrol = new PetrolEngine();
        Car2 swift = new Car2(electric);
        Car2 toyota = new Car2(petrol);
        swift.startCar();;
        toyota.startCar();

    }
}
