class Solution {
    public int largestInteger(int num) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        char[] digits = String.valueOf(num).toCharArray();

        for (char ch : digits) {
            int d = ch - '0';
            if (d % 2 == 0) {
                even.add(d);
            } else {
                odd.add(d);
            }
        }

        // Sort both lists in descending order
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even, Collections.reverseOrder());

        // Reconstruct the number
        StringBuilder result = new StringBuilder();
        int oddIndex = 0, evenIndex = 0;

        for (char ch : digits) {
            int d = ch - '0';
            if (d % 2 == 0) {
                result.append(even.get(evenIndex++));
            } else {
                result.append(odd.get(oddIndex++));
            }
        }

        return Integer.parseInt(result.toString());
    }
}
