package string;

//Given a 32-bit signed integer, reverse digits of an integer.
//
//Example 1:
//
//Input: 123
//Output: 321
//Example 2:
//
//Input: -123
//Output: -321
//Example 3:
//
//Input: 120
//Output: 21
//Note:
//Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
//For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

public class ReverseInteger {
    public int reverse(int x) {
        int temp = 0, digit =0, result=0;
        while (x!=0){
            digit = x%10;
            temp = result *10+digit;
            x/=10;
            if(temp/10!=result){
                return 0;
            }
            result = temp;
        }
        return result;
    }
}
