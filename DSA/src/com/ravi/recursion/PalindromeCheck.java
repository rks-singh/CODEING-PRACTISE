package com.ravi.recursion;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String string, int low, int high) {
        if (low >= high) {
            return  true;
        }
        return (string.charAt(low) == string.charAt(high)) && isPalindrome(string,++low,--high);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to check Palindrome");
        String string = scanner.next();
        System.out.println("Is "+string+" is Palindrome :"+isPalindrome(string,0,string.length()-1));
    }
    // Time Complexity ==> O(N)
    // Space Complexity ==> O(N)
}
