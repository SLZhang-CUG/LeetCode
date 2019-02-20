/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (41.76%)
 * Total Accepted:    504.8K
 * Total Submissions: 1.2M
 * Testcase Example:  '121'
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 *
 * Example 1:
 *
 *
 * Input: 121
 * Output: true
 *
 *
 * Example 2:
 *
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 *
 *
 * Example 3:
 *
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 *
 *
 * Follow up:
 *
 * Coud you solve it without converting the integer to a string?
 *
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x == 0){
            return true;
        }
        long y = 0;
        int xTemp = x;
        do{
            y *= 10;
            y += x%10;
            if(y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) return false;
            x /= 10;
        }while(x != 0);
        if((int)y == xTemp)return true;
        return false;
    }
}
