package Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        fac(20);
        fact2(20);
    }

    //O(n)
    static void fac(int n){
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i+" ");
            }
        }
    }


    //O(sqrt(n))
    static void fact2(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){

                if(n/i == i){
                    System.out.println(n/i+" ");
                }

                else{
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
            
        }

        
        for (int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i)+" ");
        }


    }

    
}
