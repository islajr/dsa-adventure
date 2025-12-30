
import java.util.HashMap;
import java.util.Objects;

class ValidAnagram {
    /* * 
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    */   

    public static boolean isAnagram(String s, String t) {

        // early exit
        if (s.length() != t.length())
                return false;
        
        HashMap<Character, Integer> sHash = extract(s);
        HashMap<Character, Integer> tHash = extract(t);

        // comparing both hashmaps
        for (Character c : sHash.keySet()) {
            if (!(tHash.containsKey(c) && Objects.equals(tHash.get(c), sHash.get(c))))
                return false;
        }   

        return true;

    }

    /* extract: returns a hashmap frequency table of all characters in a string */
    private static HashMap<Character, Integer> extract(String s) {
        HashMap<Character, Integer> sHash = new HashMap<>();
        Integer placeholder = 0;
        for (int i = 0; i < s.length(); i++) {
            placeholder = sHash.get(s.charAt(i));
            if (placeholder == null) {   // if not present
                sHash.put(s.charAt(i), 1);
            } else {
                sHash.replace(s.charAt(i),  placeholder + 1);
            }
        }

        return sHash;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }
}