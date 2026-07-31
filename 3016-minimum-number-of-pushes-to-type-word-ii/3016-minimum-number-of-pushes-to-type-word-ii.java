import java.util.*;

class Solution {
    public int minimumPushes(String word) {
        
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);

        int answer = 0;
        int push = 1;
        int count = 0;
        for (int i = 25; i >= 0; i--) {
            
            if (freq[i] == 0) {
                continue;
            }

            answer += freq[i] * push;
            count++;
            if (count % 8 == 0) {
                push++;
            }
        }

        return answer;
    }
}