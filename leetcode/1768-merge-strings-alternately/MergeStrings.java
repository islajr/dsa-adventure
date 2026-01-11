/* * 
 * LC 1768: Merge Strings Alternately
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
 * If a string is longer than the other, append the additional letters onto the end of the merged string. 
 * 
 * Return the merged string.
*/
public class MergeStrings {
    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        String result = "";
        while (i < Math.min(word1.length(), word2.length())) {
            result  = result + word1.charAt(i) + word2.charAt(i);
            i++;
        }

        if (word1.length() != word2.length()) {
            String longer = word1.length() > word2.length() ? word1 : word2;

            while (i < longer.length()) {
                result = result + longer.charAt(i);
                i++;
            }
        }
        

        return result;
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}