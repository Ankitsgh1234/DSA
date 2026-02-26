class Solution {
    public int minMoves(int target, int maxDoubles) {

        if (target == 1) return 0;
        if (maxDoubles == 0) return target - 1;

        int c = 0;

        while (target != 1) {

            // 🔥 If no doubles left, finish in one step
            if (maxDoubles == 0) {
                return c + (target - 1);
            }

            if (target % 2 == 0) {
                target = target / 2;
                maxDoubles--;
            } else {
                target--;
            }

            c++;
        }

        return c;
    }
}