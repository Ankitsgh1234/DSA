class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int ans=0;
        ans+=requests[0];
        for(int i=0;i<requests.length-1;i++){
            int d=Math.abs(requests[i]-requests[i+1]);
            ans+=d;
        }
        return ans;
    }
}