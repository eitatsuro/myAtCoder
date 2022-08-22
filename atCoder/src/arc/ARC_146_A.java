package arc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ARC_146_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] A = new int[n];
			for (int i=0; i<n; i++) {
				A[i] = sc.nextInt();
			}
			Arrays.sort(A);
			
			// 使いカードに記載の３つの数値を取得する
			int card1 = A[n-1];
			int card2 = A[n-2];
			int card3 = A[n-3];
			
			List<String> list = new ArrayList<String>();
			list.add(String.valueOf(card1));
			list.add(String.valueOf(card2));
			list.add(String.valueOf(card3));
			
			Collections.sort(list);
			
			StringBuilder sb = new StringBuilder();
			sb.append(list.get(2));
			sb.append(list.get(1));
			sb.append(list.get(0));

			String ans = sb.toString();

			System.out.print(ans);
		
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