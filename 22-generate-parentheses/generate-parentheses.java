class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lt=new ArrayList<>();
        gp(lt,"",0,0,n);
        return lt;


    }
    public static void gp(List<String> lt,String s,int l,int r,int n){
        
        if(r==n){
            lt.add(s);
            // s="";
            return;
        }
        if(l<n)
        gp( lt,s+"(", l+1, r, n);
        
        if(r<l)
        gp( lt,s+")",l, r+1, n);
        
    }
}