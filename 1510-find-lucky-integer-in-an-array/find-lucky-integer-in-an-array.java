class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
      
        int num=-1;
        
        for(Integer n: map.keySet()){
            if(n.equals(map.get(n))){
                if(n>num){
                     num=n;
                     
                }
              
            }
        }
        return num;
    }
}