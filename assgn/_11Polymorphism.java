package assgn;

class Polymorphism {
    String name = "Nikita";
    String surname = "Vishnoi";
    int age = 21;
    public void showData(String name, String surname){
        this.name = name;
        this.surname = surname;
        System.out.println("First");
        System.out.println("Your name is: " + name);
        System.out.println("Your surname is: " + surname);
    }
    public void showData(String surname, int age){
        this.age = age;
        this.surname = surname;
        System.out.println("Second");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
    }
    
}


public class _11Polymorphism {
public static void main(String[] args) {
    Polymorphism p1 = new Polymorphism();
    p1.showData("Nikita", "Vishnoi");
    p1.showData("Nikita", 21);

}
    
}


