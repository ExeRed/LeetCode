package org.example.HouseRobber;

public class HouseRobber {
    public static int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        }

        // Create an array to store the maximum amount of money that can be robbed at each house
        int[] dp = new int[n];

        // Initialize the first two elements
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // Iterate through the rest of the houses
        for (int i = 2; i < n; i++) {
            // Decide whether to rob the current house or skip it
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        // The result is the maximum amount of money that can be robbed from the last house
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Example 1: " + rob(nums1));

        int[] nums2 = {1, 5, 3, 4, 5};
        System.out.println("Example 2: " + rob(nums2));
    }
}
