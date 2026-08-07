class Solution {
    public int secondHighest(String s) {
        List<Integer> lt=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                lt.add(Integer.parseInt(s.substring(i,i+1)));
            }
        }
        int smax=-1;
        int max=0;
        for(int i:lt){
            max=Math.max(max,i);
        }
        for(int i=0;i<lt.size();i++){
            if(lt.get(i)!=max&&lt.get(i)>smax){
                smax=lt.get(i);
            }
        }
        return smax;
    }
}