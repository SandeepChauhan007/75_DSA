 /*  2nd Question   for  75 DSA Questions

/*  Problem Statement (What this code is trying to do):

 Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0


Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


------------------  Java Program -------------------------------------  */

// package dsa_75;

public class BuySellStock {


	public static int maxProfit(int[] nums) {

		int buy = nums[0];

		int profit = 0;

		for(int index = 1; index < nums.length; index++) {

			if(nums[index] < buy) {

				buy = nums[index];
			} else if(nums[index] - buy > profit) {

				profit = nums[index] - buy ;
			}
		}

		return profit;
	}


	public static void main(String args[]) {

		int[] arr = {7,1,5,3,6,4};	

		System.out.println(maxProfit(arr));

	}

}


/* ----------------------------------------------------------------
  Dry Run 
  
  
  Loop Iteration Details:
Iteration 1: index = 1, arr[1] = 1
1 < 7 → update buy = 1

profit remains 0

Iteration 2: index = 2, arr[2] = 5
5 > 1, check profit: 5 - 1 = 4

4 > 0 → update profit = 4

Iteration 3: index = 3, arr[3] = 3
3 > 1, check profit: 3 - 1 = 2

2 < 4 → no change

Iteration 4: index = 4, arr[4] = 6
6 > 1, check profit: 6 - 1 = 5

5 > 4 → update profit = 5

Iteration 5: index = 5, arr[5] = 4
4 > 1, check profit: 4 - 1 = 3

3 < 5 → no change

---------------------------------------------------
