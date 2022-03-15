package abc;

import java.util.Scanner;

public class ABC_086_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt();
			int t = 0, x = 0, y = 0;
			int t_old = 0, x_old = 0, y_old = 0;

			for ( int i = 0; i < N; i++ ) {
				// 次の座標を取得
				final int t_next = sc.nextInt();
				final int x_next = sc.nextInt();
				final int y_next = sc.nextInt();

				// 座標変換（起点を0に変更
				t = t_next - t_old;
				x = x_next - x_old;
				y = y_next - y_old;

				// 移動可否判定
				// 1次元の線上での移動に問題を置き換える
				int distance = Math.abs(x) + Math.abs(y);
				// tの間に移動できる距離はtであるため、
				// distance > t ならば指定時間内に到達不可能.
				// distance = t ならば到達可能
				// distance < t の場合は到達可能性あり
				// この場合（t - distance > 0 の場合）、
				// ( t - distance ) が偶数であれば、余った時間を往復移動して指定の位置に戻れる.
				if ( t - distance >= 0 && ( t - distance )%2 == 0 ) {
					// 受け取った点については到達可能なので、次の座標を取得
					// 現在の位置を保存
					t_old = t_next;
					x_old = x_next;
					y_old = y_next;
					continue;
				} else {
					System.out.println("No");
					return;
				}
			}

			// すべての点についてNoでなければ、到達可能
			System.out.println("Yes");


		}
	}
}
