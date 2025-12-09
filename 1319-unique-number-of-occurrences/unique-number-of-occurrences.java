class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();

        int n=arr.length;

        for(int i=0;i<n;i++){
            h.put(arr[i], h.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> st=new HashSet<>(h.values());
        return h.size()==st.size();
        
        
    }
}