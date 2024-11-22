package assgn;

class CopyConstructor {
    int age;
    String name;
    CopyConstructor(int age, String name){
System.out.println(this.age);
System.out.println(this.name);
    }

    public void printInfo(){
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
    }
    CopyConstructor(CopyConstructor s2){
            this.name = s2.name;
            this.age = s2.age;

    }
    CopyConstructor(){

    }
    
}

class ConstructorDriver{
    public static void main(String[] args) {
        CopyConstructor s1 = new CopyConstructor();
        CopyConstructor s2 = new CopyConstructor(s1);
        
        s1.name = "Nikita";
        s1.age = 21;
        s2.printInfo();
    }
}
