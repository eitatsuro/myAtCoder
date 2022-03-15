package abc;

import java.util.Scanner;


public class ABC_218_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {


			char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
			int[] p = new int[26];
			
			for (int i=0; i<26; i++) {
				p[i] = sc.nextInt();
			}
			
			StringBuilder sb = new StringBuilder();
			for (int temp : p ) {
				sb.append(alphabet[temp-1]);
			}
			
			System.out.println(sb.toString());
			
		}
	}
}