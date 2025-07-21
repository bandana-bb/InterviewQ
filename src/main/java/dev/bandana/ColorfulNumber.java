package dev.bandana;

/*
Given a number A, find if it is COLORFUL number or not.

If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:

A number can be broken into different consecutive sequence of digits.
The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245.
This number is a COLORFUL number, since the product of every consecutive sequence of digits is different
 */
public class ColorfulNumber {
    public static void main(String[] args) {

        int a = 236;

        int res=checkColourful(a);
        System.out.println(res);

    }
    public static int checkColourful(int a) {
        int n =String.valueOf(a).length();
        int [] B = new int[n];
        int [] C = new int[n*(n+1)/2];

        //get all the digits from input
        int r = 0;
        for(int i=0;i<n;i++){
            r = a%10;
            B[i] =r;
            a = a/10;
        }

        //check for multiplies
         int index_k =0;
        for(int i=0;i<n;i++){
            int p =1;
            for(int j=i;j<n;j++){
                p = p*B[j];
                for(int k=0;k<index_k;k++){
                    if(C[k]==p){
                        return 0;
                    }
                    }
                C[index_k++]=p;

            }
        }
        return 1;

    }
}
