package abc;

import java.util.Scanner;


public class ABC_210_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// Takahashi = sente
			// Aoki      = gote

			int n = sc.nextInt(); // •¶Žš—ñ’·
			String s = sc.next(); // •¶Žš—ñ

			for (int i = 0; i < n; i++) {
				char c = s.charAt(i);
				int c_int = Character.getNumericValue(c);
				// Ÿ”s‚ÌŒˆ’è
				if ( c_int == 1) {
					if (i%2 == 0 ) {
						// •‰‚¯‚½l‚Ì–¼‘O‚ð•\Ž¦
						System.out.println("Takahashi");
						break;
					} else {
						System.out.println("Aoki");
						break;
					}

				}
			}

		}
	}
}