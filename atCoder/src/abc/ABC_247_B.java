package abc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// TODO: WAとなっています。サンプル問題はＯＫですが、テストケース2件で、WA。
public class ABC_247_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			List<String> s = new ArrayList<String>();
			List<String> t = new ArrayList<String>();

			for (int i=0; i<N; i++) {
				s.add(sc.next());
				t.add(sc.next());
			}
		
			// あだ名空間を定義（付与可能なあだ名一覧）
			List<String> mergedList = new ArrayList<String>();
			mergedList.addAll(s);
			mergedList.addAll(t);
			List<String> dedupedMergedList = mergedList.stream().distinct().collect(Collectors.toList());
			// さらに重複があった名前は使えないので削除する
			
			HashMap<String, Integer> map = new HashMap<>();
			for (String temp : dedupedMergedList) {
				int count = 0;
				for (String s_temp: s) {
					if (temp.equals(s_temp)) {
						count++;
					}
				}
				for (String t_temp: t) {
					if (temp.equals(t_temp)) {
						count++;
					}
				}
				map.put(temp, count);
			}
			
			for (String temp : map.keySet()) {
				if ( map.get(temp) >=2 ) {
					dedupedMergedList.remove(temp);
				}
			}
				


			List<String> a = new ArrayList<String>();
			// あだ名をつける
			for (int i=0; i<s.size(); i++) {
				if (dedupedMergedList.contains(s.get(i))) {
					dedupedMergedList.remove(s.get(i));
					a.add(s.get(i));
				} else if (dedupedMergedList.contains(t.get(i))) {
					dedupedMergedList.remove(t.get(i));
					a.add(t.get(i));
				} else {
					System.out.println("No");
					System.exit(0);
				}
			}
			System.out.println("Yes");
		}

	}

}
