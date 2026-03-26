class Solution {
    public boolean isPrefixString(String s, String[] words) {
      StringBuilder sb=new StringBuilder();
      int n=words.length;
      for(int i=0;i<n;i++){
        sb.append(words[i]);
        if(s.equals(sb.toString())){
            return true;
        }
      }  
      return false;
    }
}