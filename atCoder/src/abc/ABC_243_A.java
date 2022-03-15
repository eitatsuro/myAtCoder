package abc;

import java.util.Scanner;

public class ABC_243_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int v = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int i = 1;
			for (i = 1; v >= 0; i++ ) {
				switch (i%3) {
				case 1:
					v = v - a;
					if (v<0) System.out.println("F");
					break;
				case 2:
					v = v - b;
					if (v<0) System.out.println("M");
					break;
				case 0:
					v = v - c;
					if (v<0) System.out.println("T");
					break;
					default:
						// do nothing
						break;
				}
				 
			}

		}

	}

}
