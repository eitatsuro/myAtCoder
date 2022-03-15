package abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ABC_210_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // キャンディの個数
			int k = sc.nextInt(); // もらうことができるキャンディの個数
			int [] c = new int[n]; // キャンディの色

			for (int i = 0; i < n; i++ ) {
				c[i] = sc.nextInt();
			}
			
			// キャンディの個数が1個だけの時
			if ( n == 1 ) {
				System.out.println(1);
				System.exit(0);
			}

			// 左端からK個取得した場合のマップを生成しておく
			Map<Integer,Integer> color = new HashMap<Integer,Integer>();
			for (int i = 0; i < k; i++ ) {
				if ( color.containsKey(c[i])) {
					color.put(c[i], color.get(c[i])+1);
				} else {
					color.put(c[i], 0);
				}
			}

			// もらうキャンディに含まれる色の最大値
			int max_color = color.size();
			
			// n == kの時
			if (n==k) {
				System.out.println(max_color);
				System.exit(0);
			}

			// k個のキャンディの取得開始位置i
			for (int i = 1; i < n-k+1; i++) {

				// 左端の1個の飴の色を削除
				if ( color.containsKey(c[i-1]) ) {
					if (color.get(c[i-1]) > 0) {
						color.put(c[i-1], color.get(c[i-1])-1);
					} else {
						color.remove(c[i-1]);
					}
				}

				// 右端の1個の飴の色を追加
				if ( color.containsKey(c[i+k-1])) {
					color.put(c[i+k-1], color.get(c[i+k-1])+1);
				} else {
					color.put(c[i+k-1], 0);
				}

				int color_size = color.size();
				if (max_color < color_size) max_color = color_size;
			}

			System.out.println(max_color);

		}
	}
}