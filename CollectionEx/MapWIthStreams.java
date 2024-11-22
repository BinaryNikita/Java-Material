package CollectionEx;

import java.util.HashMap;

public class MapWIthStreams {
    public static void main(String[] args) {
        // Increase the price of products by 10%

        HashMap<String, Integer> products = new HashMap<>();
        products.put("Book", 200);
        products.put("Pen", 10);
        products.put("Pencil", 5);
        products.put("Rubber", 5);

        products.replaceAll((product, price) -> price + price * 10/100);
        System.out.println(products);
        //without streams find product with price greater than 100
        for(HashMap.Entry<String, Integer> entry : products.entrySet()){
              if(entry.getValue() > 100){
              System.out.println(entry.getKey());
              }
        }
        int totalPrice = products.values().stream().reduce(0, Integer::sum);
    
        System.out.println(totalPrice);
        
    }
}
