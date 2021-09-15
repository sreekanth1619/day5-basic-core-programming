package day5;
import java.util.Scanner;
public class LeapYear {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the year");
	
	int num = sc.nextInt();
		sc.close();
	if((num%4==0) || (num%100)==0 && (num%400)==0){

     System.out.println("leap year");
	}else {
		System.out.println("not an leap year");
	
	}
}
}
