package assgn;

 interface  Shape{
 void Area();
 default void show(){
    System.out.println("This is a default method");
 }

} 

class Rectangle implements Shape  {
 int length = 7;
    double width = 9;
    @Override
    public void Area(){
        System.out.println(length*width);

    }  
}

class Circle implements Shape {
    private int radius = 9;
    private double pi = 3.14;
    @Override
    public void Area(){
        System.out.println(pi * radius * radius);

    }
}

class InterfaceDriver{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        r.Area();
        c.Area();
        r.show();
            
    }
}
