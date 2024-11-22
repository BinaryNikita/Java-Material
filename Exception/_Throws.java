package Exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _Throws {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d:/abc.txt");
    }
   
}

class _Throws2{
    public static void main(String[] args) {
        _Throws s = new _Throws();
        try{
            s.readFile();
        } catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
