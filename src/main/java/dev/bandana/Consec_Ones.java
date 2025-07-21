package dev.bandana;

/*
Given an array of 1's and 0's, you are allowed to replace only one 0 with 1. Find the maximum number of consecutive 1's that can be obtained after making the replacement.

Example :
Input = [1, 1, 0, 1, 1, 0, 1, 1]
Output = 5
 */

public class Consec_Ones {
    public static void main(String[] args) {
        int [] A = {1, 1, 0, 1, 1, 0, 1, 1};

        int result = findConsecOnes(A);
        System.out.println("Total number of consective 1's : " + result);
    }

    public static int findConsecOnes(int[] A) {
        int n = A.length;

        //Edge case if all elements in array is 1's
        int count = 0;
        for(int i = 0; i < n; i++){
            if(A[i] == 1){
                count++;
            }
        }
        if(count == n){
            return n;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(A[i] == 0){
                //find the no. of 1's in left

                int l =0;
                int r =0;
                for(int j =i-1;j>=0;j--){
                    if(A[j] == 1){
                        l++;
                    }
                    else{
                        break;
                    }
                }

                //find the number of 1's in right
                for(int j =i+1;j<n;j++){
                    if(A[j] == 1){
                        r++;
                    }
                    else{
                        break;
                    }
                }

                //calculate the length
                ans = Math.max(ans,l+r+1);
            }

        }
        return ans;
    }
}
