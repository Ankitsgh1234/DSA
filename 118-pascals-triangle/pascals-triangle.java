class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            l.add(grow(i));
        }
        return l;
        
    }
    public List<Integer> grow(int n){
        long ans=1;
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        for(int i=0;i<n;i++){
            ans=ans*(n-i);
            try{

            ans=ans/(i+1);
            }
            catch(Exception e){
                System.out.println(e);
            }
            temp.add((int)ans);
        }
        return temp;
    }
}