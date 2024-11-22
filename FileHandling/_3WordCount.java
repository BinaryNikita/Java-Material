package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class _3WordCount {

    public static void main(String[] args) {
        try{
            File file2 = new File("output.txt");
            FileInputStream fis = new FileInputStream(file2);
            fis.read(file2);
            


    }
    }
}

class Words{
    public static void main(String[] args) {
        String words = "One Two Three Four";
int countWords = words.split("\\s").length;
System.out.println(countWords);
    }
}