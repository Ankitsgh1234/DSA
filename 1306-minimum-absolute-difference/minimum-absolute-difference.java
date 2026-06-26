class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> lt=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==min){
                List<Integer> n=new ArrayList<>();
                n.add(arr[i]);
                n.add(arr[i+1]);
                lt.add(n);
            }
        }
        return lt;
    }
}