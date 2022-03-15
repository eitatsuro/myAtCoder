package abc;

import java.util.Scanner;

public class ABC_085_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// –‡”
			int n = sc.nextInt();  // 1<=n<=2000
			// ‡Œv‹àŠz
			int y = sc.nextInt();  // 1000<=y<=20,000,000

			// n–‡‚Ì‚¨D‚Åæ‚è‚¤‚é‹àŠz‚ğ‚·‚×‚ÄZo
			// Œ‹‰Êo—Í 1–œ‰~A5ç‰~Aç‰~‚Ì–‡”  i, j, k‚Æ‚·‚é
			// n = i + j + k
			int candidateOfPrice = 0;
			boolean isAnswered = false;
			EXIT_ALL_LOOPS:
				for (int i=0; i<=n; i++) {
					for (int j=0; j<=n-i; j++) {
						// n = i + j + k ‚æ‚èAi,j‚ªŒˆ‚Ü‚ê‚ÎAk‚àŒˆ‚Ü‚é
						candidateOfPrice = 10000*i + 5000*j + 1000*(n-i-j);
						if (candidateOfPrice == y) {
							System.out.print(i + " ");
							System.out.print(j + " ");
							System.out.println(n-i-j);
							isAnswered = true;
							break EXIT_ALL_LOOPS;
						}
					}
				}

			if(!isAnswered) {
				// –¢‰ñ“š‚Ìê‡‚ÍA‚ ‚è“¾‚È‚¢‚Æ‚¢‚¤‚±‚Æ‚È‚Ì‚ÅA-1 -1 -1‚ğo—Í
				System.out.print("-1 ");
				System.out.print("-1 ");
				System.out.println("-1");
			}
		}

	}
}
