//Write a program to print first N prime numbers
import java.util.Scanner;
class practical6
{
	
	static boolean isPrime(int n){
		if (n==1||n==0)return false;

		for(int i=2;i<n; i++){
			if(n%i==0)return false ;


		}
		return true;

	}
	public static void main (String[] args)
     {
     	int N=100;
     	for (int i=1;i<=N; i++){
     		if(isPrime(i)){
     			System.out.println(i+" ");

     		}
     	}
     }

}
