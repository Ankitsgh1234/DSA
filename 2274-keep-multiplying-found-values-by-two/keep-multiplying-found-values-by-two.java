class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> s= new HashSet<>();
         for (int num : nums) {
            s.add(num);
        }
        int n=original;

        while(s.contains(n)){
            n=n*2;

        }
        return n;

        
    }
}