package abc;

import java.util.Scanner;

public class ABC_246_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int A = sc.nextInt();
			int B = sc.nextInt();

			double c = Math.sqrt(A*A + B*B);
			double x = A/c;
			double y = B/c;
			System.out.println(x+" "+y);

		}

	}

}
