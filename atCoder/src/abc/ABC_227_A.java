package abc;

import java.util.Scanner;


public class ABC_227_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			int a = sc.nextInt();

			// a+k-1���̃J�[�h��N�l�ɔz��Ō�J�[�h�����炤�l��������΂悢
			
			if ( n == 1 ) {
				System.out.println(1);
				System.exit(0);
			}

			if ( (a+k-1)%n == 0) {
				System.out.println(n);
			} else {
				System.out.println( (a+k-1)%n );
			}

		}
	}
}