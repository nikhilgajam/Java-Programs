import java.util.*;

public class Jp{

    public static void main(String[] args){

        primeSieveOfEratosthenes(100);
        System.out.println();
        primefactorizationSieveOfEratosthenes(42);
        System.out.println();
        primefactorization(1000);

    }

    public static void primeSieveOfEratosthenes(int n){
        
        int[] primes = new int[n+1];   // In java default array values are 0 in other languages need to initialize the elements with 0

        for(int i=2; i<=n; i++){
            if(primes[i] == 0){
                for(int j=i*i; j<=n; j+=i){
                    primes[j] = 1;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(primes[i] == 0)
                System.out.print(i + " ");
        }

    }

    public static void primefactorizationSieveOfEratosthenes(int n){

        int[] spf = new int[n+1];    // Smallest prime factor

        for(int i=2; i<=n; i++)
            spf[i] = i;

        for(int i=2; i<=n; i++){
            if(spf[i] == i){
                for(int j=i*i; j<=n; j+=i){
                    if(spf[j] == j){
                        spf[j] = i;
                    }
                }
            }
        }

        while(n != 1){
            System.out.print(spf[n] + " ");
            n = n/spf[n];
        }

    }

    public static void primefactorization(int n){

        // Composite numbers will give less time complexity for this program
        int c = 2;
        while(n > 1){
            if(n%c == 0){
                System.out.print(c + " ");
                n /= c;
            }else{
                c++;
            }
        }

    }

}
