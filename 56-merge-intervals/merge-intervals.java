import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<List<Integer>> lt = new ArrayList<>();

        for (int[] interval : intervals) {
            if (lt.isEmpty() || lt.get(lt.size() - 1).get(1) < interval[0]) {
                // No overlap → add new interval
                lt.add(Arrays.asList(interval[0], interval[1]));
            } else {
                // Overlap → merge with last interval
                int end = Math.max(lt.get(lt.size() - 1).get(1), interval[1]);
                lt.get(lt.size() - 1).set(1, end);
            }
        }

        // Convert to int[][]
        int[][] result = new int[lt.size()][2];
        for (int i = 0; i < lt.size(); i++) {
            result[i][0] = lt.get(i).get(0);
            result[i][1] = lt.get(i).get(1);
        }
        return result;
    }
}
