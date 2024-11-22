package FileHandling;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class _1Ass {
    public static void main(String[] args) throws FileNotFoundException {
        try( FileWriter fileWrite = new FileWriter("UserText.txt")){
            Scanner sc= new Scanner(System.in)
            System.out.println("Enter some text....");
            String text = sc.nextLine();
            fileWrite.write(text);
            fileWrite.close();
            System.out.println("Operation success");
        } catch(IOException e){
            e.getStackTrace();
        } 

     File outpFile = new File("NewFile.txt");
        FileInputStream fis = new FileInputStream(outpFile); 
            int i;
            try {
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        } 
    }

