package dev.bandana;


/*
Given a string s, calculate the length of longest palindromic substring in s
 */
public class LongestPalindrome {
    public static void main(String[] args) {

        String str = "anamadamm";
        int result = longestPalindrome(str.toCharArray());
        System.out.println(result);

    }

    public static int longestPalindrome(char[] s) {
        int n = s.length;
        int ans = Integer.MIN_VALUE;

        //Odd length palindrome
        for(int i =0;i<n;i++) {
            int p1=i,p2=i;
            ans =Math.max(ans,expand(s,p1,p2));
        }

        //even length palindrome
        for(int i =0;i<n;i++) {
            int p1=i,p2=i+1;
            ans =Math.max(ans,expand(s,p1,p2));
        }
        return ans;
    }

    public static int expand(char [] ch,int p1, int p2){
        while (p1>=0 && p2 <ch.length && ch[p1]==ch[p2]){
            p1--;
            p2++;
        }
        return p2-p1-1;
    }
}
