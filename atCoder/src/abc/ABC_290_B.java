package abc;

import java.util.Scanner;

public class ABC_290_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			String S = sc.next();
			final char maru = 'o';
			final char batsu = 'x';


			int tsuukashasu=0;
			for( int i=0; i<S.length(); i++) {
				if(S.charAt(i) == maru) {
					if ( tsuukashasu < K) {
						System.out.print(maru);	
						tsuukashasu++;
					}else {
						System.out.print(batsu);
					}
				} else if (S.charAt(i) == batsu) {
					System.out.print(batsu);
				} else {
					// do nothing. arienai case
				}
			}


		}
	}
}
