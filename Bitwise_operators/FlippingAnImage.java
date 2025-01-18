package Bitwise_operators;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };

        // Call the method to flip and invert the image
        int[][] invertedImage = findInvertImage(image);

        // Print the inverted image
        for (int[] row : invertedImage) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] findInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                // Swap and invert simultaneously
                int temp = row[i] ^ 1;
                row[i] = row[row.length - 1 - i] ^ 1;
                row[row.length - 1 - i] = temp;
            }
        }
        return image;
    }
}
