class Solution {
    int isPalindrome(String S) {
        int startIndex = 0;
        int endIndex = S.length() -1;
        while(startIndex < endIndex){
            if(S.charAt(startIndex++) != S.charAt(endIndex--)) return 0;
        }
        return 1;
    }
}
