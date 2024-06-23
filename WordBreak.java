import java.util.List;

public class WordBreak {
    
    public boolean wordBreak(String s, List<String> wordDict) {
        return helper(s, wordDict);
    }
    private boolean helper(String s, List<String> wordDict) {
        if (s.isEmpty()) {
            return true;
        }

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                String temp = s.substring(word.length());
                if (helper(temp, wordDict)) {
                    return true;
                }
            }
        }

        return false;
    }
}
