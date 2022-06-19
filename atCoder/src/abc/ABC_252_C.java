package abc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ABC_252_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			List<String> S = new ArrayList<String>();

			for (int i=0; i<N; i++) {
				S.add(sc.next());				
			}

			// 揃える数字 i を決める
			// その数字の位置を整理する
			// A[i][j] :  文字列位置jに現れる対象数字の個数を表す
			int[][] A = new int[10][10];
			for (int i=0; i<10; i++) {
				for (int j=0; j<10; j++) {
					A[i][j] = 0;
				}
			}

			for (int i=0; i<N; i++) {
				String temp = S.get(i);
				for (int j=0; j<10; j++) {
					A[Character.getNumericValue(temp.charAt(j))][j] ++;
				}
			}

			int[] B = new int[10];
			int min = 0;
			int min_index = 0;
			// 一番ばらけているやつ（ゼロの値をもつ箇所が少ない物
			for (int i=0; i<10; i++) {
				for (int j=0; j<10; j++) {
					if (A[i][j] == 0) B[i]++;
				}
				if (i==0) min = B[0];
				if ( min > B[i] ) {
					min = B[i];
					min_index = i;
				}
			}

			int ans = 0;
//			Arrays.sort(A[min_index]);
			for (int i=0; i<10; i++) {
				if ( A[min_index][i] == 0 ) {
					ans++;
				} else if ( A[min_index][i] == 1) {
					if (i == 0) {
						continue;
					}else {
						ans++;
					}
				} else {
					ans += A[min_index][i]*10;
				}
			}

			System.out.println(ans);





		}
	}
}		
