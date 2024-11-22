package assgn;

 class  FinalKeyword{
final double PI = 3.14;


 final int ID;
 {
    ID = 121;
 }
 static final int  NUMBER = 324245;
 static int ROLL;
static{
    ROLL = 78;
}
String name;
FinalKeyword(String name){
this.name = name;
}
void getData(){
    System.out.println(ROLL);
    System.out.println(name);
}


}

class Final extends FinalKeyword{

    Final(String name) {
        super(name);
    }

    void showData(){
        
    }
    
}

public class _21Final{
public static void main(String[] args) {
    FinalKeyword ob = new FinalKeyword("Nikita");
    ob.getData();
    FinalKeyword.ROLL = 78;
}
}
