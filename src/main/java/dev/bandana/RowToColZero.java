package dev.bandana;

/*
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.

Example
Input:
[1,2,3,4]
[5,6,7,0]
[9,2,0,4]

Output:
[1,2,0,0]
[0,0,0,0]
[0,0,0,0]
 */
public class RowToColZero {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,0},{9,2,0,4}};

        makeZero(arr);
    }
    public static void makeZero(int [][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        //Iterate via row wise
        for(int i=0;i<row;i++){
            boolean flag = false;
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    flag = true;
                }
            }
            if(flag){
                for(int j=0;j<col;j++){
                    if(arr[i][j]!=0){
                        arr[i][j]=-1;
                    }
                }
            }
        }

        //Iterate via col

        for(int i = 0; i<col; i++){
            boolean flag = false;
            for(int j=0;j<row;j++){
                if(arr[j][i]==0){
                    flag = true;
                }
            }
            if(flag){
                for(int j=0;j<row;j++){
                    if(arr[j][i]!=0){
                        arr[j][i]=-1;
                    }
                }
            }

        }

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }

        for(int i =0 ;i<row;i++){
            for(int j =0 ;j<col;j++){
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }
}
