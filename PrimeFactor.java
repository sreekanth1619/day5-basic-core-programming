package day5;

import java.util.Scanner;

public class PrimeFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int Ans = sc.nextInt();
		sc.close();
		 for(int i = 2; i< Ans; i++) {
	         while(Ans%i == 0) {
	            System.out.println(i+" ");
	            Ans = Ans/i;
	         }
	      }
	      if(Ans >2) {
	         System.out.println(Ans);
	}
	}
}
