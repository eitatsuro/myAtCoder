package abc;

import java.util.Scanner;

public class ABC_249_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			int x = sc.nextInt();

			double takahashi_d = Math.floor( x/(a+c) )*a*b;
			if ( x%(a+c) < a) {
				takahashi_d += (x%(a+c))*b;
			} else {
				takahashi_d += a*b;
			}

			double aoki_d = Math.floor( x/(d+f) )*d*e;
			if ( x%(d+f) < d) {
				aoki_d += (x%(d+f))*e;
			} else {
				aoki_d += d*e;
			}

			if ( takahashi_d < aoki_d ) {
				System.out.println("Aoki");
			} else if ( takahashi_d > aoki_d ) {
				System.out.println("Takahashi");
			} else {
				System.out.println("Draw");
			}

		}

	}



}