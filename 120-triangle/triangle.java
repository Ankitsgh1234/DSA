class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        int n=arr.size();
        // int[] dp=new int[n];
        // dp[0]=arr.get(0).get(0);1
        for(int i=1;i<n;i++){ 
            for(int j=0;j<arr.get(i).size();j++){
                if(j==0){
                    int min=(arr.get(i-1).get(j));
                    min+=arr.get(i).get(j);
                    arr.get(i).set(j,min);
                }    
                else if(j==arr.get(i).size()-1){
                    int min=(arr.get(i-1).get(j-1));
                    min+=arr.get(i).get(j);
                    arr.get(i).set(j,min);
                }
                else{
                    int min=Math.min(arr.get(i-1).get(j-1),arr.get(i-1).get(j));
                    min+=arr.get(i).get(j);
                    arr.get(i).set(j,min);

                }
            }
           
        }
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<arr.get(n-1).size();i++){
            sum=Math.min(sum,arr.get(n-1).get(i));
        }
        return sum;


    }
}