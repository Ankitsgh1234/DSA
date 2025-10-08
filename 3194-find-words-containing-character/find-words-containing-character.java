class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> arr=new ArrayList<>();
        int i=0;
        for (String item : words) {
            if(item.contains(String.valueOf(x))){
                arr.add(i);

            }
            i++;
        }
        // return List.toArrays(arr);
        return arr;

        
    }
}