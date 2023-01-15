package arc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ARC_153_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long raw = N;
			raw += 100000 - 1;
			
			List<Long> raw_list = getDigitList(raw);
			
			
			System.out.print(raw_list.get(0));
			System.out.print(raw_list.get(0));
			System.out.print(raw_list.get(1));
			System.out.print(raw_list.get(2));
			System.out.print(raw_list.get(3));
			System.out.print(raw_list.get(3));
			System.out.print(raw_list.get(4));
			System.out.print(raw_list.get(5));
			System.out.print(raw_list.get(4));

			
			
			
		}
	}

	public static List<Long> getDigitList(long i) {
		List<Long> list = new ArrayList<>();
		while (i != 0) { // 10で割った結果が0になったら終了する
			list.add(i % 10); // 1桁目を取得する
			i /= 10; // 1/10にする
		}
		// 反転しているので戻す
		Collections.reverse(list);
		return list;
	}


	//最大公約数gcd ( Greatest Common Divisor )
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}



}