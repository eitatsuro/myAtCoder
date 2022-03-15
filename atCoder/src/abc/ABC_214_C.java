package abc;

import java.util.Scanner;


public class ABC_214_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // ぬすけ君の数
			int[] s = new int[n]; // i番目の人が次の人に宝石を渡すのにかかる時間
			int[] t = new int[n]; // i番目の人が宝石をもらう時刻

			int[] shortestCandidate = new int[n];
			
			for ( int i = 0; i < n; i++) {
				shortestCandidate[i] = t[i];
			}
			
			
		}
	}
}