class Solution {
    public boolean isZeroArray(int[] nums, int[][] q) {
        int m=nums.length;
        int n=q.length;
        int c=0;
        for(int i=0;i<n;i++){
            int a=q[i][0];
            int b=q[i][1];
            if((b-a)==m-1){
                c++;
                continue;
            }
            for(int j=a;j<=b;j++)nums[j]--;
        }
        System.out.println(c);
        for(int i=0;i<m;i++)if(nums[i]>c)return false;
        return true;
    }
}