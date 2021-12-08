//Write a program that prints all prime numbers upto n.
import java.lang.*;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n;
        int Prime;
        System.out.print("Enter any number : ");
        n = s.nextInt();
        System.out.print("Prime numbers are : ");
        for(long i = 2; i <= n; i++){
            Prime = 0;
            for(long j = 2; j <= i/2; j++){
                 if(i % j == 0){
                     Prime = 1;
                     break;
                 }
            }
               
            if(Prime==0)
                System.out.print(i + " ");
        }


    }
}
