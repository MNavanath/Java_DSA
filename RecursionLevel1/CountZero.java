package RecursionLevel1;

public class CountZero {
    public static void main(String[] args) {
     
        int n = 1205694340;
        System.out.println(count(n));
    }

    static int count(int n){

        return helper(n, 0);
    }

    private static int helper(int n, int count){
        if (n == 0){
            return count;
        }

        int rem = n % 10;

        if (rem == 0){
            return helper(n/10, count+1);
        }

        else{
            return helper(n/10, count);
        }

        
    }
    /* static int countZero(int n){
        if (n == 0){
            return 0;
        }

        else{

            if( n % 10 == 0){
                return 1 + countZero(n/10);
            }

            else{
                return countZero(n / 10);
            }
        }
    } */
}
