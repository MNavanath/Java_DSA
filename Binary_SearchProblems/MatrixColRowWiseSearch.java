package Binary_SearchProblems;

import java.util.Arrays;

public class MatrixColRowWiseSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4,  5,  6,  7,  8,  9,  10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60},
                {61, 62, 63, 64, 65, 66, 67, 68, 69, 70},
                {71, 72, 73, 74, 75, 76, 77, 78, 79, 80},
                {81, 82, 83, 84, 85, 86, 87, 88, 89, 90},
                {91, 92, 93, 94, 95, 96, 97, 98, 99, 100}
        };
        int[] ans = search(matrix, 64);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length-1;

        while(r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                return new int[]{r,c};
            }
            if (matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
