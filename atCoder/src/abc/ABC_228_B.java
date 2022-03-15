package abc;

import java.util.Scanner;


public class ABC_228_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int x = sc.nextInt();
			int[] a = new int[n];

			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}

			// 知っているか知らないか
			// 知っている:1
			// 知っていて伝搬済み:2
			// まだ知らない:0
			int[] isKnew = new int[n];
			for (int i=0; i<n; i++) {
				isKnew[i] = 0;
			}
			isKnew[x-1] = 1;


			int i = 0;
			while(i<n) {
				if ( isKnew[i] == 1) {
					isKnew[i] = 2;
					if ( isKnew[ a[i]-1 ] == 0 ) {
						isKnew[ a[i]-1 ] =  1;
						i=a[i]-1;
						continue;
					}
				}
				i++;
			}

			int ans = 0;
			for(int temp : isKnew ) {
				if ( temp > 0) ans++; 
			}
			System.out.println(ans);


		}
	}

}