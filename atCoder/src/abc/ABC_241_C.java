package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_241_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // n x n 行列
			List<String> s = new ArrayList<String>();
			
			for (int i=0; i<n; i++) {
				s.add(sc.next());
			}
			
			// 2次元配列に変換
			char[][] a  = new char[n][];	
			for (int i=0; i<n; i++) {
				a[i] = new char[n];
			}
			
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					a[i][j] = s.get(i).charAt(j);					
				}
			}

			boolean finalAnswer = false;
			
			// 横に6個ならんでいるか調べて結果を返す
			if (is6BlackInConsequence(s)) {
				finalAnswer = true;
			}
			
			
			
			
		}
	}
	
	private static boolean is6BlackInConsequence ( char[][] input, int n ) {
		boolean finalAnswer = false;
		List<String> list = new ArrayList<String>();
		
		// 横に6個ならんでいるか調べる
		for (int i=0; i<n; i++) {
			list.add(String.valueOf(input[i]));
		}
		finalAnswer = is6BlackInConsequence(list); // 横6個の結果
		
		// 縦に6個ならんでいるか調べる
		
		// 2次元配列に変換するので変換後の配列を生成
		char[][] b  = new char[n][];	
		for (int i=0; i<n; i++) {
			b[i] = new char[n];
		}

		// 転置
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				b[i][j] = input[j][i];					
			}
		}

		for (int i=0; i<n; i++) {
			list.add(String.valueOf(b[i]));
		}
		finalAnswer = is6BlackInConsequence(list); // 縦6個の結果
		
		
		
		return finalAnswer;
		
		
		
		
		
	}
	
	
	private static boolean is6BlackInConsequence ( List<String> input ) {
		
		boolean ans = false;
		for (String temp : input) {
			if (temp.contains("######")) {
				ans = true;
			}
		}
		
		return ans;
	}

}