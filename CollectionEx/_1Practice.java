import java.util.ArrayList;
import java.util.Comparator;

public class _1Practice{
    public static void main(String[] args) {
        //1.
        ArrayList <String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Grey");
        System.out.println(colors);

        //2.

        for(String color: colors){
            System.out.println(color);
        }

        //3.
      
        System.out.println(colors.set(0, "White"));

        //4.
       
        System.out.println( colors.get(1));

        //5.

        colors.add("Orange");
        colors.add("Yellow");

        //6.

        System.out.println(colors.remove(2));

        //7.
        System.out.println(colors.contains("Black"));
      

        //8.
        colors.sort(null);

        //9.
        ArrayList<String> c = new ArrayList<>();
        c.addAll(colors);

        //10.
        colors.add(0, "Wooden");

        //11.
        colors.sort(Comparator.reverseOrder());
        System.out.println("Reverse");
        System.out.println(colors);
        
        //12.

        System.out.println(colors.equals(c));

        //13.
        // System.out.println(colors.);
        System.out.println("Suffle");
        for(int i =0; i < colors.size(); i++){
            int last = colors.size() - 1;
            if(i == 0){
                int temp = i;
                i = last;
                last = temp;
            }
            System.out.println(colors.get(i));
        }


        //14.
        colors.trimToSize();
        System.out.println(colors);

        //15.
        for(int i =0; i < colors.size(); i++){
            System.out.println("Element at index: " + i + " is: " + colors.get(i));
        }
    }
}

/**
 * Inner_1Practice
 */
 class Inner_1Practice {

    public static void main(String[] args) {
        ArrayList <String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Grey");
        System.out.println(colors.size());
        for(int i =colors.size()-1 ; i >= 0 ; i--){
            int first = 0;
            if(i == 0){
                int temp = i;
                i = first;
                first = temp;
            }
            System.out.println(colors.get(i));
        }



        
    }
}