package Strings;

public class LengthOfLastWord {

    /*
    
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

     */


     public static int lengthOfLastWord(String s) {
        int len = 0;
        String[] str = s.split(" ");
        len = str[str.length-1].length();
        return len;
     }
    public static void main(String[] args) {

       System.out.println(lengthOfLastWord("Hello World")); 
       System.out.println(lengthOfLastWord("   fly me   to   the moon  ")); 
       System.out.println(lengthOfLastWord("luffy is still joyboy")); 

        
    }
}
