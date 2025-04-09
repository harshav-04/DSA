// 3. Longest Substring Without Repeating Characters
// Solved
// Medium
// Topics
// Companies
// Hint
// Given a string s, find the length of the longest substring without duplicate characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (right < s.length()) {
            char currentChar = s.charAt(right);
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                left = map.get(currentChar) + 1;
            }
            map.put(currentChar, right);
            // System.out.println(currentChar);;

            // System.out.println(maxLen);
            maxLen = (maxLen > (right - left + 1)) ? maxLen : right - left + 1;
            // System.out.println(maxLen);
            right++;
        }
        return maxLen;

    }
}
