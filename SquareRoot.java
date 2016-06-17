import java.util.Scanner;
import java.math.*;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number :");
		Scanner sc=new Scanner(System.in);
		double number = sc.nextInt();
		double squareroot = Math.sqrt(number);
		double cuberoot = Math.cbrt(number);
		
		
		System.out.println("Square root:" + squareroot);
		System.out.println("Cube root:" + cuberoot);
		
	}

}
