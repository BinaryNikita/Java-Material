package Collectionss;

import java.util.HashMap;
import java.util.Map;

class Products {
    String name;
    int price;
    int quantity;

    Products(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {

        return "Name: " + this.name + " Quantity: " + this.quantity + " Price: " + this.price;
    }

}

public class ProoductDriver {
    public static void main(String[] args) {

        HashMap<String, Products> product = new HashMap<>();
        product.put("Oil", new Products(700, 9));
        product.put("Sunscreen", new Products(100, 4));
        product.put("Lotion", new Products(200, 2));
        product.put("Cream", new Products(300, 3));

        // System.out.println(product.get("Lotion"));
        System.out.println(highestPrice(product));


    }


    public static Products highestPrice(HashMap<String, Products> products){
Products maxPrice = null;

for(Map.Entry<String, Products> entry: products.entrySet()){
if(entry.getValue().getPrice() > maxPrice.getPrice()){
    maxPrice = entry.getValue();
}

return maxPrice;
}

    }

}
