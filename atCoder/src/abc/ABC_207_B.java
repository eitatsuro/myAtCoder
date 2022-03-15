package abc;

import java.util.Scanner;


public class ABC_207_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int a_blue = sc.nextInt(); //水色ボール（初期）
			int b_blue = sc.nextInt(); //水色ボール
			int c_red = sc.nextInt();  //赤色ボール
			int d = sc.nextInt(); //目標値 (a_blue+b_blue*n) <= d*(c_red*n)

			// 達成不能
			if ( b_blue >= c_red*d ) {
				System.out.println(-1);

			} else {

				//繰り返し回数 n >=1 
				int n = 1;
				while ( a_blue + (b_blue - d*c_red)*n > 0) {
					n++;
				}
				System.out.println(n);
			}

		}
	}
}
