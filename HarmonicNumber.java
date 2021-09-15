package day5;
import java .util.Scanner;
public class HarmonicNumber {
	
	 public static void main(String[] args) { 
		 
		 		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		
		 double sum= 0;
		 for (float i = 1; i<=n;i++){
		 sum+=(1/i)*Math.pow(-1,i+1);

		 }
		 System.out.println(sum);
		 s.close();
	 }
		 }
		 
		 
	    
	



