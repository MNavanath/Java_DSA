package Bitwise_operators;

public class rightMostBit {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(rightmostbit(n));
    }

    static int rightmostbit(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                return count;
            }
            count++;
            n = n >> 1; // Shift the number to the right
        }
        return -1; // Return -1 if no bits are set
    }
}
