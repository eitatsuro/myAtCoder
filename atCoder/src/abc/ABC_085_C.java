package abc;

import java.util.Scanner;

public class ABC_085_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 枚数
			int n = sc.nextInt();  // 1<=n<=2000
			// 合計金額
			int y = sc.nextInt();  // 1000<=y<=20,000,000

			// n枚のお札で取りうる金額をすべて算出
			// 結果出力 1万円、5千円、千円の枚数  i, j, kとする
			// n = i + j + k
			int candidateOfPrice = 0;
			boolean isAnswered = false;
			EXIT_ALL_LOOPS:
				for (int i=0; i<=n; i++) {
					for (int j=0; j<=n-i; j++) {
						// n = i + j + k より、i,jが決まれば、kも決まる
						candidateOfPrice = 10000*i + 5000*j + 1000*(n-i-j);
						if (candidateOfPrice == y) {
							System.out.print(i + " ");
							System.out.print(j + " ");
							System.out.println(n-i-j);
							isAnswered = true;
							break EXIT_ALL_LOOPS;
						}
					}
				}

			if(!isAnswered) {
				// 未回答の場合は、あり得ないということなので、-1 -1 -1を出力
				System.out.print("-1 ");
				System.out.print("-1 ");
				System.out.println("-1");
			}
		}

	}
}
