class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {

        int[][] dp=new int[n][n];
        int[][] arr=new int[n][n];
        int k=mines.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=1;
            }
        }
        System.out.println(k);
        
        for(int i=0;i<k;i++){
            arr[mines[i][0]][mines[i][1]]=0;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i==0&&j==0){
                dp[i][j]=arr[i][j];
               }
               if(arr[i][j]==0){
                dp[i][j]=0;
                continue;
               }
               if(i==0||j==0||i==n-1||j==n-1){
                dp[i][j]=arr[i][j];
               }
               else{

                int up=0;
                int left=0;
                int down=0;
                int right=0;
                for(int p=i;p>=0;p--){
                    if(arr[p][j]==1){
                        up++;
                    }else{
                        break;
                    }
                }
                for(int p=i;p<n;p++){
                    if(arr[p][j]==1){
                        down++;
                    }else{
                        break;
                    }
                }
                for(int p=j;p>=0;p--){
                    if(arr[i][p]==1){
                        left++;
                    }else{
                        break;
                    }
                }
                for(int p=j;p<n;p++){
                    if(arr[i][p]==1){
                        right++;
                    }else{
                        break;
                    }
                }
                dp[i][j]=min(up,down,left,right);
               
               }
                
            }
        }

        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              max=Math.max(dp[i][j],max);
            }
               

        }
              
        return max;
    }
    public static int min(int a,int b,int c,int d){
        return Math.min(a,Math.min(b,Math.min(c,d)));
    }
}