package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.w3c.dom.ls.LSProgressEvent;


public class NewFile {
    public static void main(String[] args) {
        File file1 = new File("output.txt");
        System.out.println(" getname " + file1.getName());
        System.out.println(" getAbsolutePath " + file1.getAbsolutePath());
        System.out.println(" length " + file1.length());
        System.out.println(" lastModified " + file1.lastModified());
        System.out.println(" canExecute " + file1.canExecute());
        System.out.println(" canRead " + file1.canRead());
        System.out.println(" canWrite " + file1.canWrite());
        System.out.println(" isFile " + file1.isFile());
        System.out.println("  " + file1.isDirectory());
        System.out.println("  " + file1.isHidden());
        long modifiedDate = file1.lastModified();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        String newFormat = sf.format(new Date(modifiedDate)).toString();
        System.out.println("The file is last modified on: "+newFormat);
        // sf.applyPattern(file1);


        try{
            File f = new File("NewFile.txt");
            FileOutputStream fo =  new FileOutputStream(f);
            String data = "           JAVA IS OBJECT ";
            byte b[] = data.getBytes();
            fo.write(b);
            System.out.println("Operation success");


        } catch (IOException e){
          System.out.println(e);
        }
       



    }

}
