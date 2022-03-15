package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC_238_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int [] a = new int[n];
			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			
			// 切り込みを入れたときの回転角度（累積）
			int [] angles = new int[n+2];

			for (int i=0; i<n+1; i++) {
				for (int j=0; j<i; j++) {
					angles[i] += a[j];					
				}
			}

			int [] absolute_angles = new int[n+1];
			// 切り込みを入れる場所（0度～359度）
			for (int i=0; i<n+1; i++) {
				absolute_angles[i] = angles[i]%360;
			}
			Arrays.sort(absolute_angles);

			int [] ans = new int[n+1];
			for (int i=1; i<n+1; i++) {
				ans[i-1] = absolute_angles[i] - absolute_angles[i-1];;
			}
			ans[n] = 360 - absolute_angles[n];

			Arrays.sort(ans);
			System.out.println(ans[n]);

		}
	}

}