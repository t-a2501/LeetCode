package string;

//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//Note: For the purpose of this problem, we define empty string as valid palindrome.
//
//Example 1:
//
//Input: "A man, a plan, a canal: Panama"
//Output: true
//Example 2:
//
//Input: "race a car"
//Output: false

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        if(s.length() <= 1) {
            return true;
        }

        s = s.toLowerCase();

        String[] sList = s.split("");
        StringBuilder sb = new StringBuilder();
        StringBuilder oppo = new StringBuilder();

        for(int i = 0; i < sList.length ;i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                sb.append(sList[i]);
            }
        }

        if(sb.length() == 1){
            return true;
        }

        for(int i = sList.length - 1; i >= 0 ;i--) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                oppo.append(sList[i]);
            }
        }

        if(sb.toString().equals(oppo.toString())){
            return true;
        }

        return false;
    }
}
