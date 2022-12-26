package abc;

import java.util.Scanner;

public class ABC_270_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			// ビット演算
			// mondai 1, mondai2, mondai3
			//        1,        1,      1  (ok->1, ng->0)
			
			int ans =  A | B;
			System.out.println(ans);
			
		}
	}
}