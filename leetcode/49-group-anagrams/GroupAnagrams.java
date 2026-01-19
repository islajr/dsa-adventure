import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* * 
 * LC 49: Group Anagrams
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
*/
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            
            for (char c : s.toCharArray())
                count[c - 'a']++;

            String key = Arrays.toString(count);
            
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(s);

        }

        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupAnagrams(strs);

        for (List<String> outer : result) {
            System.out.println("-------------");
            for (String s : outer)
                System.out.println(s);
        }
    }
}