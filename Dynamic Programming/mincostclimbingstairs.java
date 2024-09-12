
// 746. Min Cost Climbing Stairs
// Solved
// Easy
// Topics
// Companies
// Hint
// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

// You can either start from the step with index 0, or the step with index 1.

// Return the minimum cost to reach the top of the floor.

// Input: cost = [10,15,20]
// Output: 15
// Explanation: You will start at index 1.
// - Pay 15 and climb two steps to reach the top.
// The total cost is 15.

import java.util.Arrays;

public class mincostclimbingstairs {
    
}
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n =cost.length;
        int dp[] = new int [n];
        Arrays.fill(dp, -1);

        return Solve(cost , dp , n , 0);

    }public int Solve(int [] cost , int dp[] , int n , int idx){
        if(n==0 ||n==1){
            return 0;
        }

        if(idx==1){
            return cost[1];
        }

        if(idx==0){
            return cost[0];
        }

        if(dp[idx]!=-1){
            return dp[idx];
        }

        int climb_ONE = Solve(cost , dp , n , idx+1);
        int climb_TWO = Solve(cost , dp , n , idx+2);


        int ans = Math.min(climb_ONE , climb_TWO) + cost[idx];

         return  dp[idx]= ans;



    }


}
