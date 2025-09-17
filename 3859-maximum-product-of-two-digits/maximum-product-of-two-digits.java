class Solution {
    public int maxProduct(int n) {
        int p=1;
        int n1=n;
        List<Integer> arr=new ArrayList<>();
        while(n1>0){
            arr.add(n1%10);
            n1/=10;
        }
        int max=0;
        Collections.sort(arr);
        max=arr.get(arr.size()-1);
        int smax=arr.get(arr.size()-2);

        
        // for(int i:arr){
        //     if(i>max)
        //     max=i;

        // }
        // int smax=0;
        // for(int i:arr){
        //     if(i>smax)
        //     smax=i;
            

        // }
         
        return max*smax;
        
    }
}