class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch=letters[0];
        int n=letters.length;
        for(int i=0;i<n;i++){
            if(letters[i]>target){

            ch=letters[i];
            break;
            }
        }
        return ch;
    }
}