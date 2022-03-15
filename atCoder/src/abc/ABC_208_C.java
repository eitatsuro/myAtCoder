package abc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ABC_208_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt(); // 国民の数
			long k = sc.nextLong(); // お菓子の数
			long remains = k; // 配るお菓子の残数
			final int[] a = new int[n]; // 国民番号

			long geta = 0;
			// お菓子の数が多い場合は下駄をはかせる
			if (n < k) {
				geta = (long) Math.floor(k/n);
				remains = k%n; 
			}

			// 国民番号 - もらったお菓子の数
			Map<Integer,Long> map = new HashMap<Integer, Long>();

			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
				map.put(a[i], geta);
			}


			// 国民番号でソート
			Object[] mapKey =  map.keySet().toArray();
			Arrays.sort(mapKey);

			while (remains > 0) {
				for (Object key : mapKey ) {
					if ( remains > 0) {
						map.replace((Integer) key, map.get(key) + 1);
						remains--;
					} else {
						break;
					}
				}
			}

			for (int temp : a) {
				System.out.println(map.get(temp));
			}
		}
	}
}