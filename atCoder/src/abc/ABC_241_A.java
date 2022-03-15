package abc;

import java.util.Scanner;

public class ABC_241_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int [] a = new int[10];
			for(int i=0; i<10; i++) {
				a[i] = sc.nextInt();
			}
		
			// 0 -> a[0] -> a[a[0]] -> a[a[a[0]]]
			System.out.println(a[a[a[0]]]);

		}
	}

}
