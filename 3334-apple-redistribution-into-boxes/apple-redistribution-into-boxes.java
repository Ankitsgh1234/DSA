class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = Arrays.stream(apple).sum();
        Arrays.sort(capacity);
        int boxCount = 0;
        for (int i = capacity.length - 1; i >= 0; --i) {
            total -= capacity[i];
            boxCount++;
            if (total <= 0) return boxCount;
        }
        return capacity.length;
    }
}
