package com.ravi.recursion;

public class GenerateSubsetOfString {
    public static void generateSubset(String str, String result, int index) {

        if (index == str.length()) {
            System.out.println(result);
            return;
        }
        generateSubset(str, result, index + 1);
        generateSubset(str,result+str.charAt(index),index+1);
    }
    public static void main(String[] args) {
        generateSubset("ABC","",0);
    }
}
