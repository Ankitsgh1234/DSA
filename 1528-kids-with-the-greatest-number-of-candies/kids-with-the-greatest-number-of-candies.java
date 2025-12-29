class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int n=candies.length;
        int max=0;
        List<Boolean> lt=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if((candies[i]+e)>=max){
                lt.add(true);
            }else{
                lt.add(false);
            }

        }
        return lt;
    }
}