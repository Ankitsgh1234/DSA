class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int n = garbage.length;
        int ans = 0;

        int lastM = 0, lastP = 0, lastG = 0;

        for (int i = 0; i < n; i++) {
            ans += garbage[i].length();

            for (char c : garbage[i].toCharArray()) {
                if (c == 'M') lastM = i;
                else if (c == 'P') lastP = i;
                else if (c == 'G') lastG = i;
            }
        }

        for (int i = 0; i < lastM; i++) ans += travel[i];
        for (int i = 0; i < lastP; i++) ans += travel[i];
        for (int i = 0; i < lastG; i++) ans += travel[i];

        return ans;
    }
}