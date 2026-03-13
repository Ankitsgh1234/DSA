class Solution {
    public int furthestDistanceFromOrigin(String moves) {
       
        int r=0;
        int l=0;
        int n=moves.length();
        for(int i=0;i<n;i++){
           if(moves.charAt(i)=='R'){
                r++;
            }else if(moves.charAt(i)=='L'){
                l++;
            }
        }
        if(l>r){
            return n-2*r;
        }else{
            return n-2*l;
        }
    }
}