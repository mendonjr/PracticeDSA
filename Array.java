package com.practice;

class Array {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // int[] nums = {3,2,0,1};
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};

        // int[] ans = buildArray(nums);
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int[] buildArray(int[] nums) {

        //int temp=0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static int maximumWealth(int[][] accounts) {

        int[] wealth = new int[accounts.length];
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth[i] = temp + accounts[i][j];
                temp = wealth[i];
            }
            if (wealth[i] > max) {
                max = wealth[i];
            }

        }

        return max;
    }
}