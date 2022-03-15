package abc;

import java.util.Scanner;


public class ABC_209_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();  // N 商品個数
			int x = sc.nextInt();  // X 所持金
			int [] a = new int[n+1]; // 商品の値段 

			for (int i=1; i<=n; i++) {
				if ( i%2 == 0 ) {
					a[i] = sc.nextInt() - 1; // 偶数番目ならば1円引き	
				} else {
					a[i] = sc.nextInt();
				}

			}

			int total_expense = 0;
			for(int temp : a) {
				total_expense += temp;
			}

			if ( total_expense <= x ) {
				System.out.println("Yes");				
			} else {
				System.out.println("No");
			}

		}
	}
}