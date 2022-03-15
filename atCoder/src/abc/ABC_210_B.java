package abc;

import java.util.Scanner;


public class ABC_210_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			// Takahashi = sente
			// Aoki      = gote

			int n = sc.nextInt(); // ������
			String s = sc.next(); // ������

			for (int i = 0; i < n; i++) {
				char c = s.charAt(i);
				int c_int = Character.getNumericValue(c);
				// ���s�̌���
				if ( c_int == 1) {
					if (i%2 == 0 ) {
						// �������l�̖��O��\��
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