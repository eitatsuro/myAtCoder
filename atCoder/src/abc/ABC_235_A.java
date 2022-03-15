package abc;

import java.util.Scanner;

public class ABC_235_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			
			int abc = sc.nextInt();
			int c = abc % 10;
			int b = (abc % 100 - c )/10;
			int a = (abc % 1000 - 10*b -c)/100;
			
			System.out.println( (a+b+c)*111 );

		}
	}

}