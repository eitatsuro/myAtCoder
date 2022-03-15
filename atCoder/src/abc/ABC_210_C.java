package abc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ABC_210_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); // �L�����f�B�̌�
			int k = sc.nextInt(); // ���炤���Ƃ��ł���L�����f�B�̌�
			int [] c = new int[n]; // �L�����f�B�̐F

			for (int i = 0; i < n; i++ ) {
				c[i] = sc.nextInt();
			}
			
			// �L�����f�B�̌���1�����̎�
			if ( n == 1 ) {
				System.out.println(1);
				System.exit(0);
			}

			// ���[����K�擾�����ꍇ�̃}�b�v�𐶐����Ă���
			Map<Integer,Integer> color = new HashMap<Integer,Integer>();
			for (int i = 0; i < k; i++ ) {
				if ( color.containsKey(c[i])) {
					color.put(c[i], color.get(c[i])+1);
				} else {
					color.put(c[i], 0);
				}
			}

			// ���炤�L�����f�B�Ɋ܂܂��F�̍ő�l
			int max_color = color.size();
			
			// n == k�̎�
			if (n==k) {
				System.out.println(max_color);
				System.exit(0);
			}

			// k�̃L�����f�B�̎擾�J�n�ʒui
			for (int i = 1; i < n-k+1; i++) {

				// ���[��1�̈��̐F���폜
				if ( color.containsKey(c[i-1]) ) {
					if (color.get(c[i-1]) > 0) {
						color.put(c[i-1], color.get(c[i-1])-1);
					} else {
						color.remove(c[i-1]);
					}
				}

				// �E�[��1�̈��̐F��ǉ�
				if ( color.containsKey(c[i+k-1])) {
					color.put(c[i+k-1], color.get(c[i+k-1])+1);
				} else {
					color.put(c[i+k-1], 0);
				}

				int color_size = color.size();
				if (max_color < color_size) max_color = color_size;
			}

			System.out.println(max_color);

		}
	}
}