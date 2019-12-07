package string;

//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//Example 1:
//
//Input: ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//Note:
//
//All given inputs are in lowercase letters a-z.

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }

        String result = "";
        String first = strs[0];

        if(strs.length == 1) {
            return first;
        }

        for(int i = 0;i <= first.length();i++){
            String prefix = first.substring(0,i);
            for(int j = 1;j < strs.length;j++){

                if(prefix.length() > strs[j].length()){
                    break;
                }

                String compare = strs[j].substring(0,i);

                if(compare.equals(prefix)) {

                    if(j == strs.length - 1){
                        System.out.println(prefix);
                        result = prefix;
                    }
                }else{
                    break;
                }
            }
        }
        return result;
    }

}
