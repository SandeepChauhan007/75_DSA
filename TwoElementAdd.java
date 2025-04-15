
 /*  Ist Question   for  75 DSA Questions

/*  Problem Statement (What this code is trying to do):

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]  


------------------  Java Program -------------------------------------  */


// package dsa_75;

import java.util.Arrays;
import java.util.HashMap;

public class AddTwoNumbers {

    public static int[] addTwoNumber(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            if (hashmap.containsKey(complement)) {
                return new int[] { hashmap.get(complement), index };
            }
            hashmap.put(nums[index], index);
        }

        return new int[] {}; // No match found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(addTwoNumber(nums, target)));
    }
}

/* -------------------------------------------------------------------------------
Dry Run 

Iteration 1:
index = 0 → nums[0] = 2

complement = 9 - 2 = 7

hashmap is empty → no match

Store: hashmap.put(2, 0)

Iteration 2:
index = 1 → nums[1] = 7

complement = 9 - 7 = 2

hashmap.containsKey(2) → ✅ yes!

Match found → return { hashmap.get(2), 1 } → { 0, 1 }


*/


