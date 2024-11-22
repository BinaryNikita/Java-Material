package Array;

import java.util.Arrays;

public class CommonPrefixInArray {
    public static void main(String[] args) {
        /*
         * Input: strs[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
Output: gee
Explanation: “gee” is the longest common prefix in all the given strings.

Input: strs[] = [“hello”, “world”]
Output: -1
Explanation: There’s no common prefix in the given strings.
         */

         String strs[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
         Arrays.sort(strs);
         for(String s: strs){
            System.out.println(s);
         }


        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
String common = "";
for(int i = 0; i < idx; i++){
        common += s1.charAt(i);
}

System.out.println(common);

         }

    }

