// 5. Longest Palindromic Substring
// Solved
// Medium
// Topics
// Companies
// Hint
// Given a string s, return the longest palindromic substring in s.

// Example 1:

// Input: s = "babad"
// Output: "bab"
// Explanation: "aba" is also a valid answer.
// Example 2:

// Input: s = "cbbd"
// Output: "bb"

// Constraints:

// 1 <= s.length <= 1000
// s consist of only digits and English letters.
class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String evenPal = findPallindrome(s, i, i);
            longest = longest.length() > evenPal.length() ? longest : evenPal;
            if (i != s.length() - 1) {
                String oddPal = findPallindrome(s, i, i + 1);
                longest = longest.length() > oddPal.length() ? longest : oddPal;
            }

        }
        return longest;

    }

    public String findPallindrome(String s, int left, int right) {
        int call = 0;
        String longest = "";
        while (right < s.length() && left >= 0 && s.charAt(right) == s.charAt(left)) {
            longest = longest.length() > (right - left + 1) ? longest : s.substring(left, right);
            right++;
            left--;

        }
        System.out.println(longest);
        return longest;
    }
}