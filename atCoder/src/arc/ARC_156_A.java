package arc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ARC_156_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int T = sc.nextInt();
			for ( int i=0; i<T; i++) {
				int N = sc.nextInt();
				String S = sc.next();
				getAnswerOfARC_156_A(N, S);
			}

		}
	}
	
	private static void test() {
		String s="11111";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.replace(1, 2, "0");
		System.out.println(sb.toString());
	}

	private static void getAnswerOfARC_156_A(int N, String S) {

		int countOfOmote=0;
		for(int i=0; i<S.length(); i++) {
			if( S.charAt(i) == '1' ) {
				countOfOmote++;
			}
		}

		if(countOfOmote%2 == 1) {
			System.out.println("-1");
			return;
		}

		StringBuilder sb = new StringBuilder();
		sb.append(S);
		int ans=0;
		boolean isFound=false;
		for(int i=0; i<sb.length()-2; i++) {
			if( sb.charAt(i) == '1' ) {
				for(int j=i+2; j<sb.length(); j++) {
					if( sb.charAt(j) == '1' ) {
						sb.replace(i, i+1,"0");
						sb.replace(j, j+1,"0");
						ans++;
						isFound = true;
						break;
					}
				}
				if(!isFound) {
					ans=ans+2;
					break;
				}
				isFound = false;
				continue;
			}
		}
		System.out.println(ans);
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