package InnerClasses;

class OuterStaticClass {
    OuterStaticClass() {
        System.out.println("Outer Class Constructor");
    }

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Initializer Outer Class");
    }

    public class InnerStaticClass {
        
        InnerStaticClass() {
            System.out.println("Inner class Constructor");
        }

        {
            System.out.println("Initializer Inner Class");
        }

    }

    public static void main(String[] args) {
        OuterStaticClass o = new OuterStaticClass();
        OuterStaticClass.InnerStaticClass i = o.new InnerStaticClass();
    }
}
