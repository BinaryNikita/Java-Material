package StringMethods;

class demo{
    public static void main(String[] args) {
// String name = "Nikita";
// System.out.println(name.substring(0, 3));
String name = "Nikita";
        String name2 = "nikita";
       
        System.out.println(name == name2); // address check 
        if(name.equals(name2)){
            System.out.println("Same values");
        } else {
            System.out.println("Not same");
        }

        if(name.equalsIgnoreCase(name2)){
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }

String name = new String("Nikita");
String name4 = new String("Nikita");
System.out.println(name);
// String name2 = "Nikita";
// String name3 = "Nikita";
// System.out.println(name==name2);
// System.out.println(name2==name3);
// System.out.println(name==name4);

    }
}