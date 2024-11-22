package assgn;

public class _9Construtor {
    String name;
    int age;
    int marks = 87;
    
    

    public _9Construtor(String newName, int newAge){

    // object values //constructor arguments
     this.name = newName;
     this.age = newAge;
     
     System.out.println("Perameterised");
    }

    public void showData(){
        if(age>19){

            System.out.println(name + " You are eligible for Infobeans Student "); 
        } else {
            System.out.println("You are not eligible.");
        }
    }
    public _9Construtor(int marks, int age){
      this.age = age;
      this.marks = marks;
      System.out.println("Perameterised");

    }

    public int showData(int age){
        this.age = age;
        if(age>19 && marks>80){

            System.out.println(" You are eligible for Infobeans Student. "); 
        } else {
            System.out.println("You are not eligible.");
        }
        return 0;
    }

    public _9Construtor(){
        System.out.println("This is a default constructor");
    }

    // public void defaultData(){
    //     System.out.println(marks);
    // }


    
}
