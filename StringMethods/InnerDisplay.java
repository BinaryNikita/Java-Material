package StringMethods;
 class Display {

// length
    public void show(String name) {
        System.out.println("The length of " + name + " is: " + name.length());

    }


// char
    public void show(String name, int charLen ) {

        char result = name.charAt(charLen);
        System.out.println("Character at the index " + charLen+ " is: "+ result);
        

    }
    // reverse String

    public void reverseString(String name){
        String rev = " ";
        char newChar;

        for(int i = 0; i < name.length(); i++){
             newChar = name.charAt(i);
             rev = newChar + rev;
        }
        System.out.println("The reverse of " + name + " is: " + rev);

    }
    // one by one character printer
    public void stringIndex(String name){
       char charIndex;
       for(int i = 0; i <= name.length(); i++){
        charIndex = name.charAt(i);
        System.out.println("The character at the index " + i + " is " + charIndex);
       }
    } 
    
    // subStringfinder
    public void substringFinder(String name, int ind1, int ind2){
        if (ind1 < 0 || ind2 > name.length() || ind1 > ind2) {
            System.out.println("Invalid indices. Please provide valid indices within the string length.");
            return;
        } else {
            String sub = name.substring(ind1, ind2);
            System.out.println("Substring with ending and starting index");
            System.out.println("The substring from index " + ind1 + " to " + ind2 + " is " + sub); 
            String oneString = name.substring(ind1);
            System.out.println("Substring with starting index " + ind1 + " is " + oneString);
        }

        }
        
        public void PallindroneChecker(String name){
           String rev = "";
           char newChar;
           for(int i = 0; i < name.length(); i++){
            newChar = name.charAt(i);
            rev = rev + newChar;    
        }
        if(rev.equals(name)){
            System.out.println("Pallindrone");
        } else {
            System.out.println("Not pallindrone");
        }
}

public void lengthChecker(String name){
    int count = 0;
    char newChar;
           for(int i = 0; i < name.length(); i++){
            newChar = name.charAt(i);
            count++;
}
System.out.println("The length is" + count);
 }

 public void uppLower(String name){
    int upp = 0;
    int low = 0;
    char newChar;
    for(int i = 0; i < name.length(); i++){
        newChar = name.charAt(i);
        if(newChar >= 'A' && newChar <= 'Z'){
            upp++;
        } 
        if(newChar >= 'a' && newChar <= 'z'){
            low++;
        } 
        
      
    }
    System.out.println("The uppercase letters are: " + upp);
    System.out.println("The lowercase letters are: " + low);
 }
 }
 class Driver {
    public static void main(String[] args) {
        Display display = new Display();
        display.show("Nikita");
        display.show("Nikita", 0);
        display.reverseString("Nikita");
        display.stringIndex("Nikita");
        display.substringFinder("Nikita", 2, 5);
        display.PallindroneChecker("ada");
        display.lengthChecker("Nikita");
        display.uppLower("NikiTa");
        System.out.println("Nikita" + 'V');
    }
    
}



