package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class Output {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("NewFile.txt");

        int i;
        while ((i = fin.read()) != -1) {
            System.out.print((char) i);
        }
        fin.close();
        try{
            FileInputStream fis = new FileInputStream("NewFile.txt");

        }catch(Exception e){
         System.out.println(e.getMessage());
        }
    }
}
