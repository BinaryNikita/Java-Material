package StringMethods;

 class VowelCount {
    public static void main(String[] args) {
        String name = "AakrIti";
        char newChar;
        int count = 0;
        int l = name.length();
        for(int i = 0; i < l; i++){
            newChar = name.charAt(i);
            if(newChar == 'a' || newChar == 'e' || newChar == 'u' || newChar == 'i' ||newChar == 'o'||
            newChar == 'A' || newChar == 'E' || newChar == 'U' || newChar == 'I' ||newChar == 'O' ){
             count++;
            }
        }
        System.out.println("Total number of vowels in  " + name + " is: " + count);
    }
    
}

class aCharacterCounter{
    public static void main(String[] args) {
        String name = "muskan";
        char newChar;
        int count = 0;
        for(int i = 0; i < name.length(); i++){
            newChar = name.charAt(i);
            if(newChar == 'a' || newChar == 'A'){
             count++;
            }
        }
        System.out.println(count);
        
    }
  
    }

