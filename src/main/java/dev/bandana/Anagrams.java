package dev.bandana;

/*
You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.

Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.
 */

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "secure";
        String s2 = "rescue";

        checkAnagrams(s1, s2);

    }

    public static void checkAnagrams(String s1, String s2) {
        int c1 =0;
        int c2 =0;
        int n = s1.length();
        for(int i=0;i<n;i++) {
            c1 =c1 + s1.charAt(i);
            c2 = c2 + s2.charAt(i);
        }

        if(c1 != c2) {
            System.out.println("Not Anagrams");
        }
        else {
            System.out.println("Anagrams");
        }
    }
}
