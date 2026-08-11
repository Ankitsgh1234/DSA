class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum1=0;
        int sum2=0;
        int c=1;
        int o=2;
        int i=0;
        while(i<n){
            sum1+=c;
            sum2+=o;
            c+=2;
            o+=2;
            i++;
        }
        int min=Math.min(sum1,sum2);
        int max=Math.max(sum1,sum2);
        while(min!=0){
            int temp=min;
            min=max%min;
            max=temp;
        }
        return max;
    }
}