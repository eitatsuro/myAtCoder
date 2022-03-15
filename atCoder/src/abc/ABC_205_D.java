package abc;

import java.util.Scanner;

public class ABC_205_D {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// �����̓���
			int n = sc.nextInt();
			int[] a = new int[n+1];

			// �����̓���
			int q = sc.nextInt();
			int[] k = new int[n+1];			
			
			// ����̎擾
			for (int i=1; i<=n; i++) {
				a[i] = sc.nextInt();
			}

			// ����̎擾
			for (int i=1; i<=q; i++) {
				k[i] = sc.nextInt();
			}
			
			//�@a[]�̔z��i����j���A1,2,3...N�̕��ёւ��ɂ���ē����邩�ǂ�������
			int count=0;
			boolean isAnswered = false;
			for (int j=1; j<=n; j++) {
				count=0;
				for (int tmp: a) {
					if (j==tmp) count++;
				}
				if (count > 1) { 
					System.out.println("No");
					isAnswered = true;
					break;
				}
			}
			if (!isAnswered) {
				System.out.println("Yes");
			}	
		}
	}
}
