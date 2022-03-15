package abc;

import java.util.Scanner;


public class ABC_210_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// Takahashi = sente
			// Aoki      = gote

			int n = sc.nextInt(); // 文字列長
			String s = sc.next(); // 文字列

			for (int i = 0; i < n; i++) {
				char c = s.charAt(i);
				int c_int = Character.getNumericValue(c);
				// 勝敗の決定
				if ( c_int == 1) {
					if (i%2 == 0 ) {
						// 負けた人の名前を表示
						System.out.println("Takahashi");
						break;
					} else {
						System.out.println("Aoki");
						break;
					}

				}
			}

		}
	}
}