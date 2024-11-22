package Exception;
import java.io.*;

public class Rough {

    public Rough() {
        try {
            FileOutputStream fout = new FileOutputStream("output.txt");
            String str = "Hello, world!";
              fout.write(str.getBytes());
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Rough();
    }
}
