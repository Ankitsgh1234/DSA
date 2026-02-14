class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();

        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
        Arrays.fill(dp[i],-1);
        }

        int a= lcs(m-1,n-1,word1,word2,dp);
        int sum=m-a;
        sum+=n-a;
        return sum;
    }
     public static int lcs(int m,int n,String s1,String s2,int[][] dp){
        if(n==-1||m==-1){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(s1.charAt(m)==s2.charAt(n)){
            return dp[m][n]= 1+lcs(m-1,n-1,s1,s2,dp);
        }
        return dp[m][n]= Math.max( lcs(m-1,n,s1,s2,dp),lcs(m,n-1,s1,s2,dp));

    }
}