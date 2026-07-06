class Solution {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> map = new HashMap<>();
        for (int i = 1; i < rings.length(); i = i + 2) {
            if (!map.containsKey(rings.charAt(i))) {
                map.put(rings.charAt(i), new HashSet<>());
            }
            map.get(rings.charAt(i)).add(rings.charAt(i - 1));
        }
        int count = 0;
        for (char c : map.keySet()) {
            if (map.get(c).size() == 3)
                count++;
        }
        return count;
    }
}