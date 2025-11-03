import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // num -> next greater
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 from left to right
        for (int num : nums2) {
            // If current num is greater than top of stack
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // For remaining numbers in stack, no next greater -> -1
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build result for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }
}
