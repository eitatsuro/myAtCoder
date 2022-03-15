package abc;

import java.util.Scanner;

public class ABC_239_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int [] p1 = new int[8];
			int [] q1 = new int[8];
			

			p1[0] = 1; q1[0] = 2;
			p1[1] = 2; q1[1] = 1;
			p1[2] = 2; q1[2] = -1;
			p1[3] = 1; q1[3] = -2;
			p1[4] = -1; q1[4] = -2;
			p1[5] = -2; q1[5] = -1;
			p1[6] = -2; q1[6] = 1;
			p1[7] = -1; q1[7] = 2;

			int [] p2 = new int[8];
			int [] q2 = new int[8];

			// Œ´“_ˆÚ“® x1 -> 0, y1 -> 0
			for (int i=0; i<8; i++) {
				p2[i] = p1[i] + x2 - x1;
				q2[i] = q1[i] + y2 - y1;
			}
		
			boolean isExist = false;
			for (int i=0; i<8; i++) {
				for ( int j=0; j<8; j++ ) {
					if ( p1[i] == p2[j] && q1[i] == q2[j]) {
						isExist = true;
					}
				}
			}
			
			if (isExist) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			
			
		}
	}

}