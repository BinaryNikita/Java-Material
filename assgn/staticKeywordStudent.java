package assgn;

 class StudentUsecases1 {
    static String college = "Infobeans";
    String student;
    int id;

    StudentUsecases1(String student, int id){
        this.student = student;
        this.id = id;
    }
    public void getData(){
          System.out.println("College is: " + college);
          System.out.println("Name is: " + student);
          System.out.println("Id is: " + id);
    }
    
}

public class staticKeywordStudent{
    public static void main(String[] args) {
        StudentUsecases1 ob = new StudentUsecases1("Nikita", 1213);
        ob.getData();
        StudentUsecases1.college = "Foundation";
        StudentUsecases1 ob1 = new StudentUsecases1("Ankita", 113);
        ob1.getData();
        StudentUsecases1 ob3 = new StudentUsecases1("Shivani", 112);
        ob3.getData();
        
    }

}

 class Counter {
    private static int count = 0;

     Counter() {
        count++;
    }

    public static void getCount() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        getCount();

    }
}

class StaticVariable{
    int a = 9;
    int b = 8;
    int c = a+b;
     static void add(){
        System.out.println(c);
    }
// This will throw error beacause we cannot use instance variable inside a static method
}