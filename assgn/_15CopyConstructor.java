package assgn;

class Student{
    String name;
    int Id;
    Student(String name, int Id){
         this.name = name;
         this.Id = Id;
         this.name = "Rohan";

         System.out.println(" Inside parameterized: "+name + " "+ Id);
    }
    /*  When you assign "Nikita" to this.name inside the 
    second constructor, you're only modifying the name attribute of 
    the new object. The original object pointed to by s1 
    remains unchanged. This is because you're modifying 
    the data at the memory location referenced by this, 
    which refers to the newly created object.  */ 


    private Student(Student s1){
        this.name = s1.name;
        this.Id = s1.Id;
        this.name = "Nikita";
        System.out.println("Inside Copy: " + name + " " + Id);
    }

    public static void main(String[] args) {
        Student n = new Student(null);
    }

}

class StudentMain{
    public static void main(String[] args) {
        Student s1 = new Student("Neha", 121);
        Student s2 = new Student(s1);


    }
}
