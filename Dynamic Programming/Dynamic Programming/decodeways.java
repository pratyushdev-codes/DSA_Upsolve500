/**
 * decodeways
 */
public class decodeways {

    
}class Solution{
    public int numDecodings(String s) {
        int n = s.length();
        int dp []= new int[n];

        Arrays.fill(dp, -1);
        return Solve(s, dp , 0 , n);
 
        

    }public int Solve(String s , int dp[], int idx ,int  n){
 
        if(idx==s.length()){
            return 1;  //only 1 possible split found
        } 

        if(dp[idx]!=-1){
            return dp[idx];
        }

        if(s.charAt(idx)=='0') return 0;  //no possible split found


        int result = Solve(s , dp , idx+1,n);

        if(idx+1<n){

            if(s.charAt(idx)=='1' || (s.charAt(idx)=='2' && s.charAt(idx+1)<='6')){
                result+= Solve(s , dp , idx+2, n);
            }

        }
        return dp[idx] = result;

    }
}