package dev.bandana;
/*
Given an array of N integers, find the majority element.

The majority element is the element that occurs more than n/2 times where n is size of the array.
A[ ] = { 3, 4, 3, 2, 4, 4, 4, 4}
Ans = 4
 */


public class MajorityElem {
    public static void main(String[] args) {

        int [] arr ={ 3, 4, 3, 2, 4, 4, 4, 4};

        findmajorElem(arr);
        majorElembyMoore(arr);

    }

    //Brute Force approach
    public static void findmajorElem(int[] arr) {
        int n = arr.length;
        int maxCount = 0;
        int count = 0;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j =0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                index = i;

            }

        }

        if(maxCount > n/2){
            System.out.println(arr[index]);
        }
        else
            System.out.println("No Major Element Found");
    }

    //Optimized approach
    public static void majorElembyMoore(int[] arr) {
        int n = arr.length;
        int maj_index = 0;
        int count = 1;

        for(int i = 0; i < n; i++){
            if(count ==0){
                maj_index = i;
                count = 1;
            }
            else {
                if(arr[maj_index] == arr[i]){
                    count++;
                }
                else
                    count--;
            }
        }

        //check if the candidate occurs more than n/2

        int count_1 =0;
        for(int i = 0; i < n; i++){
            if(arr[i] == arr[maj_index]){
                count_1++;
            }
        }

        if(count_1 > n/2){
            System.out.println("Majority element: " + arr[maj_index]);
        }
        else
            System.out.println("No Major Element Found");



    }
}
