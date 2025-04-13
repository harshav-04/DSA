// 229. Majority Element II
// Solved
// Medium
// Topics
// Companies
// Hint
// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]

// Constraints:

// 1 <= nums.length <= 5 * 104
// -109 <= nums[i] <= 109

// Follow up: Could you solve the problem in linear time and in O(1) space?
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        int count1 = 0;
        int count2 = 0;
        int candidate1 = 0;
        int candidate2 = 1;
        List<Integer> l = new ArrayList<>();
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        if (count1 > len / 3) {
            l.add(candidate1);
        }
        if (count2 > len / 3) {
            l.add(candidate2);
        }
        return l;

        // int n = nums.length;
        // int l=0;
        // int r =0;
        // int count =0;
        // List <Integer> m = new ArrayList<> ();
        // Arrays.sort(nums);
        // while ( r < n){
        // if( nums[r]== nums[l]){
        // count++;
        // }
        // else {
        // count = 1;
        // l=r;
        // }

        // if(count > n/3 ){
        // if(m.size()==0){
        // m.add(nums[r]);
        // }
        // else if(m.get(m.size()-1)!= nums[r]){
        // m.add(nums[r]);
        // }

        // }
        // r++;
        // }
        // return m;

    }
}