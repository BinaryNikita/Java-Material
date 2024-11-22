package DeepAndShallowRx;
class Parent{
    StringBuffer name = new StringBuffer();
    Parent(StringBuffer name){
        this.name = name;
    }
    public Parent(Parent p1) {
        this.name = p1.name;
    }
    
}

public class DeepAndShallow{

    public static void main(String args[]){
        //Deep Copy
        Parent p1 = new Parent(new StringBuffer("Nikita"));
        Parent p2 = new Parent(p1.name);
        p1.name = new StringBuffer("Varsha");
        System.out.println(p2.name);
        System.out.println(p1.name);

        //Shallow Copy 
        Parent p3 = new Parent(p1);
        System.out.println(p3.name);


        
    }
}
