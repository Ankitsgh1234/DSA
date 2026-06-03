class Solution {
    public List<String> stringMatching(String[] words) {
        int n=words.length;
        Set<String> arr= new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j!=i&&words[i].contains(words[j])){
                    arr.add(words[j]);
                }
            }
        }
        List<String> k=new ArrayList<>();
        for(String s:arr){
            k.add(s);
        }
        return k;
    }
}