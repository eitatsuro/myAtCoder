package abc;

import java.util.Scanner;

public class ABC_250_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int R = sc.nextInt();
			int C = sc.nextInt();

			// 隣接するマスは最大4
			int answer = 4;
			if ( R+1 > H) answer --;
			if ( R-1 <= 0) answer --;
			if ( C+1 > W) answer --;
			if ( C-1 <= 0) answer --;

			System.out.println(answer);

		}

	}




}