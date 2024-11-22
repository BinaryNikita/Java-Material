package assgn;
 public class PersonClass {
    protected String name = "Nikita";
    int age;
    protected void showData(String name , int age){
           System.out.println("Your name is " + name);
           System.out.println("Your age is " + age);
    }   
    
}
class DriverPerson {
   public static void main(String[] args) {
       
       PersonClass ob = new PersonClass();
       String userName =  ob.name;
       System.out.println(ob.name="moni");
        userName = "Nikita";
        int userAge = ob.age ;
        userAge = 21;
        ob.showData(userName, userAge);

   }
}