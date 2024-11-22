package assgn;

 class This {
    String name;
    int age;

    void showData(int age, String name){
        this.name = name;
        this.age = age;
    }

}
// class this2 extends This{
    
// } 

public class ThisDriver{
    public static void main(String[] args) {
        This ob = new This();
        ob.showData();

       
      
    }
}
