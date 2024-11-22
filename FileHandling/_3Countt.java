package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class _3Countt {
    public static void main(String[] args) {
             int count = 0;
        try{
            File file2 = new File("output.txt");
            FileInputStream fis = new FileInputStream(file2);
            int i;
            try {
                while ((i = fis.read()) != -1) {
                        if(i == 't'){
                        count++;
                    }
                }
                System.out.println(count);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch(IOException e){
            System.out.println(e);
        }
       
    }
}
