package abc;

import java.util.Scanner;

public class ABC_267_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();

			// 1番目のピンが立っていたらスプリットでない
			if ( S.charAt(0) == '1') {
				System.out.print("No");
				System.exit(0);
			}

			// 列にピンが1つでも立っていたら1, それ以外は0
			int [] isPinStandingByLanes = new int[7];
			for (int i=0; i<isPinStandingByLanes.length; i++) {
				isPinStandingByLanes[i] = 0;
			}

			if (S.charAt(6) == '1')	 isPinStandingByLanes[0] = 1;
			if ( S.charAt(3) == '1') isPinStandingByLanes[1] = 1;
			if ( S.charAt(1) == '1' || S.charAt(7) == '1' ) isPinStandingByLanes[2] = 1;				
			if ( S.charAt(0) == '1' || S.charAt(4) == '1' )	isPinStandingByLanes[3] = 1;
			if ( S.charAt(2) == '1' || S.charAt(8) == '1' ) isPinStandingByLanes[4] = 1;
			if ( S.charAt(5) == '1') isPinStandingByLanes[5] = 1;
			if ( S.charAt(9) == '1') isPinStandingByLanes[6] = 1;
			
			StringBuilder sb = new StringBuilder();
			for (int i=0; i<isPinStandingByLanes.length; i++) {
				sb.append(isPinStandingByLanes[i]);
			}

			if ( sb.toString().matches(".*1.*0.*1.*")) {
				System.out.print("Yes");
			} else {
				System.out.print("No");
			}
			
		}
	}

}