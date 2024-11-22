package Array;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        /*
         * Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
         */

String[] str = {"flower","flow","flight"};
String prefix = "";
for(int i = 0; i < str.length; i++){
    String temp = "";
    for(int j = i+1 ,m = 0; j < str.length; j++, m++){
        if(str[i].charAt(m) != str[j].charAt(m)){
            break;
        } else {
            temp += str[i].charAt(m);
        }
        if(prefix.equals(temp)){
            prefix = temp;
        }
    }

}
System.out.println(prefix);

    }
}
