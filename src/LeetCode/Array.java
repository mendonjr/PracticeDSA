package LeetCode;
import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] nums = {1,1,1,1};
        // int[][] accounts = {{1, 2, 3}, {3, 2, 1}};

        // int[] ans = buildArray(nums);
        //int ans = maximumWealth(accounts);
        // int[] ans = shuffle(nums, 2);
        List<Boolean> ans = kidsWithCandies(nums, 3);

        int answ = numIdenticalPairs(nums);
        System.out.println(answ);
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

    static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {

            ans[i] = (i % 2 == 0) ? nums[i / 2] : nums[n + i / 2];
        }
        return ans;


    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


        List<Boolean> result = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < candies.length; i++) {
            temp = candies[i] + extraCandies;

            boolean isGreater = true;
            for (int candy : candies) {
                if (temp < candy) {
                    isGreater = false;
                    break;
                }
            }
            result.add(isGreater);
        }
        return result;


    }

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;

    }

}
