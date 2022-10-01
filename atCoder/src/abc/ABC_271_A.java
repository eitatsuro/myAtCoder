package abc;

import java.util.Scanner;

public class ABC_271_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			
			int hexadecimal_1 = N % 16;
			int hexadecimal_2 = N / 16;
			
			System.out.println( toHexString(hexadecimal_2) + toHexString(hexadecimal_1));
			
		}
	}
	
	private static String toHexString(int digit) {
		String ret_hexString;
		switch (digit) {
		case 10 : 
			ret_hexString = "A";
			break;
		case 11 : 
			ret_hexString = "B";
			break;
		case 12 : 
			ret_hexString = "C";
			break;
		case 13 : 
			ret_hexString = "D";
			break;
		case 14 : 
			ret_hexString = "E";
			break;
		case 15 : 
			ret_hexString = "F";
			break;
			default:
				ret_hexString = Integer.toString(digit);
		}
		return ret_hexString;
		
	}

}