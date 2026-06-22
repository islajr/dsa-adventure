// LC 140: Word Break II
class Solution {
    List<String> result;
    Set<String> wordSet;

    public List<String> wordBreak(String s, List<String> wordDict) {
        wordSet = new HashSet<>(wordDict);
        result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        backtrack(0, s, curr);
        return result;
    }

        private void backtrack(int i, String s, List<String> curr) {
        if (i == s.length()) {
            result.add(String.join(" ", curr));
            return;
        }

        for (int j = i; j < s.length(); j++) {
            String sub = s.substring(i, j + 1);
            if (wordSet.contains(sub)) {
                curr.add(sub);
                backtrack(j + 1, s, curr);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
