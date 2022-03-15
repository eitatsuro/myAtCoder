package abc;

import java.util.Scanner;

public class ABC_085_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// ����
			int n = sc.nextInt();  // 1<=n<=2000
			// ���v���z
			int y = sc.nextInt();  // 1000<=y<=20,000,000

			// n���̂��D�Ŏ�肤����z�����ׂĎZ�o
			// ���ʏo�� 1���~�A5��~�A��~�̖���  i, j, k�Ƃ���
			// n = i + j + k
			int candidateOfPrice = 0;
			boolean isAnswered = false;
			EXIT_ALL_LOOPS:
				for (int i=0; i<=n; i++) {
					for (int j=0; j<=n-i; j++) {
						// n = i + j + k ���Ai,j�����܂�΁Ak�����܂�
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
				// ���񓚂̏ꍇ�́A���蓾�Ȃ��Ƃ������ƂȂ̂ŁA-1 -1 -1���o��
				System.out.print("-1 ");
				System.out.print("-1 ");
				System.out.println("-1");
			}
		}

	}
}
