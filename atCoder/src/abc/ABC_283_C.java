package abc;

import java.util.Scanner;

public class ABC_283_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			
			int length = S.length();
			int ans=0;
			for ( int i=0; i<length; i++) {
				char temp = S.charAt(i);
				char tempNext='x';
				if (i < length -1)  tempNext = S.charAt(i+1);
				if ( temp == '0') {
					if ( tempNext == '0') {
						ans++;
						i++;
						continue;
					}
					ans++;
				} else {
					ans++;
				}
			}
			System.out.println(ans);

		}
	}
}
