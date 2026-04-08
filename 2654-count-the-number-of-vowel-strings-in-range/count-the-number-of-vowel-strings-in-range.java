class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
           if(check(words[i])){
            c++;
           } 
        }
        return c;
    }
    public static boolean check(String s){
        int n=s.length();
        char c1=s.charAt(0);
        char c2=s.charAt(n-1);
        boolean f1=false;
        boolean f2=false;
        if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'){
            f1=true;
        }
        if(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u'){
            f2=true;
        }
        return (f1&&f2);
    }
}