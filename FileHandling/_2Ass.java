package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class CustomerData implements Serializable{
    private int cutomerID;
    private String customerName;
    transient private String contactNumber;
    int age;

    CustomerData(String customerName, int cutomerID, String contactNumber, int age){
        this.cutomerID = cutomerID;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.age = age;

    }

    void getData(){
        System.out.println("Customer name: " + customerName);
        System.out.println("Customer Id: " + cutomerID);
        System.out.println("Customer contact number: " + contactNumber);
        System.out.println("Customer age is: " + age);
    }
}


class TestDriver{
    public static void main(String[] args) throws IOException{
        File file = new File("Customer.txt");

            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            CustomerData ob = new CustomerData("Nikita Vishnoi", 101, "9000091233", 21);
            CustomerData ob2 = new CustomerData("Sakshi", 01, "76765878949", 23);
            oos.writeObject(ob); 
            oos.writeObject(ob2);
            oos.close(); 
            System.out.println("Serialization done.....");
            ObjectInputStream ois = new ObjectInputStream(file);
            CustomerData cd = (CustomerData) ois.readObject();
            ObjectInputStream ois = new ObjectInputStream(fin);
            CustomerData cd = (CustomerData) ois.readObject();
            
            ois.close(); 

            System.out.println("Deserialization done.....");
            cd.getData();

        } catch (Exception io) {
            System.out.println(io);
    }

    
}
    


