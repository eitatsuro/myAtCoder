package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_241_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // n x n s—ñ
			List<String> s = new ArrayList<String>();
			
			for (int i=0; i<n; i++) {
				s.add(sc.next());
			}
			
			// 2ŸŒ³”z—ñ‚É•ÏŠ·
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
			
			// ‰¡‚É6ŒÂ‚È‚ç‚ñ‚Å‚¢‚é‚©’²‚×‚ÄŒ‹‰Ê‚ğ•Ô‚·
			if (is6BlackInConsequence(s)) {
				finalAnswer = true;
			}
			
			
			
			
		}
	}
	
	private static boolean is6BlackInConsequence ( char[][] input, int n ) {
		boolean finalAnswer = false;
		List<String> list = new ArrayList<String>();
		
		// ‰¡‚É6ŒÂ‚È‚ç‚ñ‚Å‚¢‚é‚©’²‚×‚é
		for (int i=0; i<n; i++) {
			list.add(String.valueOf(input[i]));
		}
		finalAnswer = is6BlackInConsequence(list); // ‰¡6ŒÂ‚ÌŒ‹‰Ê
		
		// c‚É6ŒÂ‚È‚ç‚ñ‚Å‚¢‚é‚©’²‚×‚é
		
		// 2ŸŒ³”z—ñ‚É•ÏŠ·‚·‚é‚Ì‚Å•ÏŠ·Œã‚Ì”z—ñ‚ğ¶¬
		char[][] b  = new char[n][];	
		for (int i=0; i<n; i++) {
			b[i] = new char[n];
		}

		// “]’u
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				b[i][j] = input[j][i];					
			}
		}

		for (int i=0; i<n; i++) {
			list.add(String.valueOf(b[i]));
		}
		finalAnswer = is6BlackInConsequence(list); // c6ŒÂ‚ÌŒ‹‰Ê
		
		
		
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