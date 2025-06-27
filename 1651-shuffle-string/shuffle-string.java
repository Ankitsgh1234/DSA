class Solution {
    public String restoreString(String s, int[] indices) {
        char arr[]=s.toCharArray();
        char arr1[]=new char[s.length()];

        for (int i=0;i <s.length();i++){
            arr1[indices[i]]=arr[i];
        }
        StringBuilder sb1=new StringBuilder();
        for(char ch:arr1){
            sb1.append(ch);

        }
        String sb=new String(sb1);

        return sb;
        
    }
}