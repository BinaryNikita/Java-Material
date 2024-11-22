package FileHandling ;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 class File1 {
    public static void main(String[] args)  {
        
        File newFile =  new File("output.txt");
        try{
            newFile.createNewFile(); 
        } catch(IOException e){
            System.out.println("Unable to create the file");
        }

        try{
            FileWriter fileWrite = new FileWriter("NewFile1.txt");
            fileWrite.write("This is new File ");
            fileWrite.close();
        } catch(IOException e){
            e.getStackTrace();
        }
        try {
            Scanner sc =  new Scanner(newFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
        System.out.println("Unable to find the file");
        }

        File outpFile = new File("NewFile.txt");
        try (FileInputStream fis = new FileInputStream(outpFile)) {
            if(outpFile.delete()){
                System.out.println("I have deleted the file. "+ outpFile.getName());
            } else {
                System.out.println("Got some error while deleting a file");
            }

            int i;
            try {
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
