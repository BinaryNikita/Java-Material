package InnerClasses;

public class _1Example {
    private int outerField = 10;
    
        public class  Inner {
        void display(){
            System.out.println("Inner class method");
            System.out.println("Accessing outer Field: " + outerField);
        }
        }
        public static void main(String[] args) {
            _1Example ex = new _1Example();
            _1Example.Inner inner = ex.new Inner();
            inner.display();
        }
    }
    