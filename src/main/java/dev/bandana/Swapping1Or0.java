package dev.bandana;

/*
Given an array of 1's and 0's, find the maximum number of consecutive 1's that can be obtained by SWAPPING at most one 0 with 1(already present in the string).

Example :-
Input: [1, 0, 1, 1, 0, 1]
Output: 5
 */

public class Swapping1Or0 {
    public static void main(String[] args) {
        int A[] = {1, 1, 0, 1, 1, 1};

        int res = MaxCons1s(A);
        System.out.println("total swap for consective 1's nd 0's : " + res);
    }

    public static int MaxCons1s(int[] A) {
        int n = A.length;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] == 1) {
                count++;
            }
        }

        if (count == n) {
            return n;
        }
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                int l = 0;
                int r = 0;
                int ans = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (A[j] == 1) {
                        l++;
                    } else {
                        break;
                    }
                }
                for (int j = i + 1; j < n; j++) {
                    if (A[j] == 1) {
                        r++;
                    } else {
                        break;
                    }
                }
                if (l + r == count) {
                    ans = l + r;
                } else {
                    ans = l + r + 1;
                }
                maxCount = Math.max(maxCount, ans);

            }
        }
        return maxCount;
    }
}
