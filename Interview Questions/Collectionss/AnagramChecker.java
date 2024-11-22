package Collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramChecker {
    public static List<List<String>> anagramChecker(ArrayList<String> wordGroups) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : wordGroups) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (map.containsKey(sortedWord)) {
                map.get(sortedWord).add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(sortedWord, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>(Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat"));
        
        System.out.println(anagramChecker(obj));
    }
}
