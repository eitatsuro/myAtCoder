package abc;

import java.util.Scanner;


public class ABC_212_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			double a = (double) sc.nextInt(); // ���k������A
			double b = (double) sc.nextInt(); // �g��������B
			double c = (a-b)/3.0 + b; // ���ό���C
			
			System.out.println(c);
		}
	}
}