package abc;

import java.util.Arrays;
import java.util.Scanner;


public class ABC_209_C {
	static final int prime_number = 1000000007;
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();  // N 数列の長さ
			int [] c = new int[n]; // 数列 C 

			// 数列Cの入力
			for (int i=0; i<n; i++) {
				c[i] = sc.nextInt();
			}

			// 順列を計算する
			// 机上で計算すると、「数列cが昇順でならんでいるとき」下記の計算式となる
			// c[0]*(c[1]-1)*(c[2]-2)*(c[3]-3)*....
			// ソートする 
			Arrays.sort(c);

			long ans = 1;
			for (int i=0; i<n; i++) {
				if ( c[i] - i < 1) {
					ans = 0;
					break;
				}
				ans = ans * (c[i] - i);
				ans = ans % prime_number;
			}
			System.out.println(ans);
		}
	}
}