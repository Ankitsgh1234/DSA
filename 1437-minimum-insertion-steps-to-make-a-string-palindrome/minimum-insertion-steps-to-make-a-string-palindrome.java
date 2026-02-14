class Solution {
    public int minInsertions(String s) {
        int b=s.length();
        int a=longestPalindromeSubseq(s);
        return b-a;
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder temp = new StringBuilder(s);
        temp.reverse();
        String reversedStr = temp.toString();
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
        Arrays.fill(dp[i],-1);
        }

        return lcs(n-1,n-1,s,reversedStr,dp);
    }
    public static int lcs(int m,int n,String s1,String s2,int[][] dp){
        if(m==-1||n==-1){
            return 0;

        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(s1.charAt(m)==s2.charAt(n)){
            return dp[m][n]=1+lcs(m-1,n-1,s1,s2,dp);
        }
        return dp[m][n]=Math.max(lcs(m-1,n,s1,s2,dp),lcs(m,n-1,s1,s2,dp));
    }
}