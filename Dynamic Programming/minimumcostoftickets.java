
// You have planned some train traveling one year in advance. The days of the year in which you will travel are given as an integer array days. Each day is an integer from 1 to 365.

// Train tickets are sold in three different ways:

// a 1-day pass is sold for costs[0] dollars,
// a 7-day pass is sold for costs[1] dollars, and
// a 30-day pass is sold for costs[2] dollars.
// The passes allow that many days of consecutive travel.

// For example, if we get a 7-day pass on day 2, then we can travel for 7 days: 2, 3, 4, 5, 6, 7, and 8.
// Return the minimum number of dollars you need to travel every day in the given list of days.
// Input: days = [1,4,6,7,8,20], costs = [2,7,15]
// Output: 11
// Explanation: For example, here is one way to buy passes that lets you travel your travel plan:
// On day 1, you bought a 1-day pass for costs[0] = $2, which covered day 1.
// On day 3, you bought a 7-day pass for costs[1] = $7, which covered days 3, 4, ..., 9.
// On day 20, you bought a 1-day pass for costs[0] = $2, which covered day 20.
// In total, you spent $11 and covered all the days of your travel.
public class minimumcostoftickets {
    
}class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[][] = new int [days.length][366];
        for(int [] arr:dp){
            Arrays.fill(arr, -1);
        }
        return func(0 , 0 , days , costs , dp);
    }public int func(int i , int upto , int [] days , int costs [] ,int [][] dp){
        if(i==days.length) return 0;

        if(days[i]<= upto) return 0+ func(i+1 , upto , days , costs , dp);

        if(dp[i][upto]!=-1) return dp[i][upto];

        int a = costs[0] + func(i+1 , days[i] , days , costs, dp);
        int b = costs[1]+func(i+1 , days[i]+6 , days , costs, dp);
        int c = costs[2]+ func(i+1 , days[i]+29 , days , costs , dp);

        return dp[i][upto]= Math.min(a , Math.min(b,c));
    }
}
