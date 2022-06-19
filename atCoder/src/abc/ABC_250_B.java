package abc;

import java.util.Scanner;

public class ABC_250_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int A = sc.nextInt();
			int B = sc.nextInt();

			// 文字列Sは2パターンのみ
			StringBuilder sb1 = new StringBuilder();

			int n=0;
			while (n<N) {
				for (int i=0; i<B; i++) {
					sb1.append(".");				
				}
				n++;
				if ( n>=N ) break;
				for (int i=0; i<B; i++) {
					sb1.append("#");				
				}
				n++;
				if ( n>=N ) break;
			}
			String s1 = sb1.toString();
			
			// sb1.delete(0, sb1.length());
			String s2 = s1.replace(".", "X").replace("#", ".").replace("X", "#");
			
			n=0;
			while (n<N) {
				for (int i=0; i<A; i++) {
					System.out.println(s1);				
				}
				n++;
				if ( n>=N ) break;
				for (int i=0; i<A; i++) {
					System.out.println(s2);				
				}
				n++;
				if ( n>=N ) break;
			}

		}

	}




}