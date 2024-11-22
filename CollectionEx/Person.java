package CollectionEx;

import java.util.*;

public class Person {

private String name;
private int age;

public Person(String name,int age){
    this.name=name;
    this.age=age;
}

public String getName(){
    return name;
}

public int getAge(){
    return age;
}
public String toString(){
    return name + "(" + age + ")";
}
}

class AgeComparator implements Comparator<Person>{
public int compare(Person p1,Person p2){
    return Integer.compare(p1.getAge(),p2.getAge());
}
}

class ComparatorExample{
    public static void main(String[] args) {
    List<Person> people=new ArrayList<>();
    people.add(new Person("Monica", 67));
    people.add(new Person("Nikil", 97));
    people.add(new Person("shubhi", 34));
    people.add(new Person("Yuvi", 56));

    Collections.sort(people, new AgeComparator());

    System.out.println(people);
    }
}




   
    

