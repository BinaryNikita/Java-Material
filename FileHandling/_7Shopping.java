package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Shopping implements Serializable{

    String itemName;
    int itemPrice;
    int itemQuantity;
    int Total;
    Shopping(String itemName, int itemPrice, int itemQuantity ){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }


    void showBill() {
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + itemPrice);
        System.out.println("Quantity: " + itemQuantity);
        totalBill();
    }
    
    double totalBill(){
        this.itemPrice = itemPrice * itemQuantity;
        return itemPrice;
    }
}

 class _7ShoppingDriver {

public static void main(String[] args) throws ClassNotFoundException {
    File productFile = new File("ProductBill.dat");
    try{
        FileOutputStream fos = new FileOutputStream(productFile);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Shopping sp = new Shopping("Toy", 230, 2);
        Shopping sp2 = new Shopping("Chocolate",20 , 5);
        oos.writeObject(sp);
        oos.writeObject(sp2);
        fos.close();
    } catch(IOException e){
System.out.println("Something went wrong during serialization....");
    }

    File outpFile = new File("ProductBill.dat");

        try (FileInputStream fis = new FileInputStream(outpFile);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Shopping sp = (Shopping) ois.readObject();
            Shopping sp2 = (Shopping) ois.readObject();
              
            System.out.println("Total amount: "+sp.totalBill());
            System.out.println("Total amount: " + sp2.totalBill());

  
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Something went wrong during deserialization....." + e);
            e.printStackTrace();
        }

}
 }