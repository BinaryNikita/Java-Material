package Collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//without this the default from Object.toString(), 
// which includes the class name (Person) and the object's hashcode.


    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}


public class SortObjectsInList {
    
public static void main(String[] args) {
    List<Person> people = new ArrayList<>();
    people.add(new Person("Nikita", 21));
    people.add(new Person("Payal", 19));
    people.add(new Person("Priyanshi", 20));

    Comparator<Person> ageComparator = new Comparator<Person>() {
        public int compare(Person p1, Person p2){
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    };

    Collections.sort(people, ageComparator);

    for(Person p: people){
        System.out.println(p);
    }


    
}
}
