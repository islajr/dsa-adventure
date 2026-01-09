import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String left = strs[0];
        String right = strs[strs.length - 1];
        String result = "";

        for (int i = 0; i < Math.min(left.length(), right.length()); ++i) {
            if (left.charAt(i) != right.charAt(i))
                break;
            else
                result += left.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}