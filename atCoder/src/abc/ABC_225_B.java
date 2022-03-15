package abc;

import java.util.Scanner;


public class ABC_225_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int[] a = new int[n-1];
			int[] b = new int[n-1];

			for (int i=0; i<n-1; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}

			if (isStar(a, b, n-1)) {
				System.out.println("Yes");
			} else {
				System.out.println("No"); 
			}
		}

	}
	
	private static boolean isStar(int[] a, int[] b, int n) {
		
		//Å‰‚Ì‚Q•Ó‚ð‚Ý‚Ä‹¤’Ê‚Ì’¸“_‚ð’T‚·
		int common = 0;
		if(a[0] == a[1] || a[0] == b[1]) {
			common = a[0];
		} else if ( b[0] == a[1] || b[0] == b[1]) {
			common = b[0];
		} else {
			return false;
		}
		
		
		for (int i=0; i<n; i++) {
			if ( a[i] != common && b[i] != common) {
				break;
			}
			if (i==n-1) return true;
		}
		
		return false;
	}
}