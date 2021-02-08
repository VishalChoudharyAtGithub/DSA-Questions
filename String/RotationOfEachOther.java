// Problem link - https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/

class Solution {
    public boolean areRotations(String str1, String str2) 
    {   
        return (str1.length() == str2.length()) && 
               ((str1 + str1).indexOf(str2) != -1); 
    }    
}

// There length should be same
// If we concatenate s1 with itself then s2 must be its substring
// eg : s1 = hello
//      s2 = lohel
// s1 + s2 = hellohello
//              |||||
//              lohel  <- this is s2 in s1 

