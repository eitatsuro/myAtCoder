package abc;

import java.util.Scanner;

public class ABC_205_D {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int n = sc.nextInt();
			int[] a = new int[n+1];

			// 整数の入力
			int q = sc.nextInt();
			int[] k = new int[n+1];			
			
			// 数列の取得
			for (int i=1; i<=n; i++) {
				a[i] = sc.nextInt();
			}

			// 数列の取得
			for (int i=1; i<=q; i++) {
				k[i] = sc.nextInt();
			}
			
			//　a[]の配列（数列）が、1,2,3...Nの並び替えによって得られるかどうか判定
			int count=0;
			boolean isAnswered = false;
			for (int j=1; j<=n; j++) {
				count=0;
				for (int tmp: a) {
					if (j==tmp) count++;
				}
				if (count > 1) { 
					System.out.println("No");
					isAnswered = true;
					break;
				}
			}
			if (!isAnswered) {
				System.out.println("Yes");
			}	
		}
	}
}
