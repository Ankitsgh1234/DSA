class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int n=tokens.length;
        for(String token : tokens){

            if(token.equals("+") || token.equals("-") ||
               token.equals("*") || token.equals("/")){

                int b = st.pop();
                int a = st.pop();

                int ans = op(a, b, token.charAt(0));
                st.push(ans);

            } else {
                st.push(Integer.parseInt(token));  
            }
        }
        return st.pop();
    }
    public static int op(int a,int b,char ch){
        if(ch=='/'){
            return a/b;
        }
        else if(ch=='*'){
            return a*b;
        }
        else if(ch=='-'){
            return a-b;
        }
        else {
            return a+b;
        }
    }
}