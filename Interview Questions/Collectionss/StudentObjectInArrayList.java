package Collectionss;
/*
 * List of Students
Write a Java program to create a list of type Student. Create a method called getAllStudents(), which will return a list of Student.
The following task needs to be done:
1. Retrieve the student whose name starts with "H".
2. Calculate the average of all the marks of all the students.
3. Remove the student from the list whose name starts with "B".
Use the Iterator to iterate through the List.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class Student implements Comparable<Student>{
    String name;
    int eng;
    int java;
    int c;

    Student(String name, int eng, int java, int c){
        this.name = name;
        this.eng = eng;
        this.java = java;
        this.c = c;
    }

    String getName(){
        return this.name;
    }

    int getEng(){
        return this.eng;
    }
    int getJava(){
        return this.java;
    }
    int getC(){
        return this.c;
    }
    int getTotal(){
      int total = this.eng + this.java + this.c;
      return total; 
    }

    public int compareTo(Student other){
      return Integer.compare(this.getTotal(), other.getTotal());
    }

    public String toString(){
        return this.name + " " + this.eng + " " + this.java + " " + this.c;
    }



}

public class StudentObjectInArrayList {
    public static void main(String[] args) {
        ArrayList<Student> obj = new ArrayList<>();
        obj.add(new Student("Heena", 34, 89, 96));
        obj.add(new Student("Payal", 98, 76, 97));
        obj.add(new Student("Bhavna", 89, 98, 67));


        // for (Student student : obj) {
        //     if (student.getName().startsWith("H")) {
        //       System.out.println(student);
        //     }
        // }

    //     Iterator<Student> iterator = obj.iterator();
    //     while (iterator.hasNext()) {
    //         Student students = iterator.next();
    //         if (students.getName().startsWith("B")) {
    //             iterator.remove();
    //         }
    //     }
      

    //    int total = 0;
    //    for(Student student: obj){
    //      total += student.getTotal();
    //    }
         
    
    // System.out.println(obj);
    
    // Other Approach
    // for(int i = 0; i < obj.size(); i++){
    //     total += obj.get(i).getTotal();
    // }
    //    int average = total/obj.size();
    //    System.out.println(average);


    Collections.sort(obj);





    for(Student student: obj){
        System.out.println(student);
    }


    Comparator<Student> ageComparator = new Comparator<Student>() {
        @Override

        public int compare(Student s1, Student s2){
            return Integer.compare(s1., 0)
        }
    };
}

}
//    int average = obj.size() > 0 ? total / obj.size() : 0;
//    System.out.println("Average marks: " + average);