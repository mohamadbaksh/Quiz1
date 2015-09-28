package Quiz1;
import java.util.Scanner;

public class Rate {
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Number of passing attempts: ");
		double Attempts = input.nextDouble();
		System.out.println("Nmber of completions :");
		double Completions =input.nextDouble();
		System.out.println("Number of passing yeards: ");
		double Yeards = input.nextDouble();
		System.out.println("Number of touchdown passes: ");
		double Touchdown = input.nextDouble();
		System.out.println("Number of Interceptions: ");
		double Interceptions = input.nextDouble();
		double a =(Completions/Attempts -0.3) * 5;
		double b = (Yeards/Attempts - 3)*.25;
		double c =(Touchdown/Attempts)*20;
		double d = 2.375-(Interceptions/Attempts) * 25;
		double Rate = (a+b+c+d)/6* 100;
		System.out.printf("The player's rating is %4.1f",Rate);
		
	}
}
