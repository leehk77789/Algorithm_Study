package backJoon;


import java.util.Scanner;

public class Bronze1297 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int diagonal= sc.nextInt();
		int height = sc.nextInt(); 
		int width = sc.nextInt(); 
		
		double result = Math.sqrt(Math.pow(diagonal,2)/(Math.pow(height, 2)+Math.pow(width, 2)));
		System.out.print((int)Math.floor(result*height));
		System.out.print(" ");
		System.out.println((int)Math.floor(result*width));
	}
}	
