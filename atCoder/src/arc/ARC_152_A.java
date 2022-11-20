package arc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ARC_152_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int L = sc.nextInt();
			int[] a = new int[N];
			for (int i=0; i<N; i++) {
				a[i] = sc.nextInt();
			}

			List<Integer> seats = new ArrayList<Integer>();

			for(int i=0; i<L; i++) {
				seats.add(0);
			}

			for (int j=0; j<N;) {
				for(int i=0; i<L;) {
					i++;
					if (a[j] == 1) {
						if (i+1 < L) {
							seats.set(i, 1);
							i++;
						} else {
							break;
						}
					} else {
						if (i+2 < L) {
							seats.set(i, 1);
							i++;
							seats.set(i, 1);
							i++;
						} else {
							break;
						}
					}
					j++;
				}

				if( a[j] == 1) {
					System.out.println("Yes");
					System.exit(0);
				} else {
					System.out.println("No");
					System.exit(0);
				}


			}			





		}
	}

	public static List<Integer> getDigitList(int i) {
		List<Integer> list = new ArrayList<>();
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