package Maths;

public class Seive {
    public static void main(String[] args) {
        int n = 37;
        boolean[] primes = new boolean[n+1];
        seive(n, primes);

    }

    static void seive(int n, boolean[] primes){
        for (int i = 2; i <= n; i++){
            if(!primes[i]){
                for (int j = i*i; j <= n; j+=i){
                    primes[j] = true;
                }
            }

        }

        for (int i = 2; i<= n; i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
