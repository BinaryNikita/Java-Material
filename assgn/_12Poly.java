package assgn;

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
    void showData(){
        System.out.println("Inside Parent class");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor");
    }
    void showData(){
        System.out.println("Inside Child class");
    }
}

class _12Poly {
    public static void main(String[] args) {
        Parent ob = new Child();
        ob.showData();
    }
}

