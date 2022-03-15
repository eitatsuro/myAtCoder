package abc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ABC_208_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt(); // �����̐�
			long k = sc.nextLong(); // ���َq�̐�
			long remains = k; // �z�邨�َq�̎c��
			final int[] a = new int[n]; // �����ԍ�

			long geta = 0;
			// ���َq�̐��������ꍇ�͉��ʂ��͂�����
			if (n < k) {
				geta = (long) Math.floor(k/n);
				remains = k%n; 
			}

			// �����ԍ� - ����������َq�̐�
			Map<Integer,Long> map = new HashMap<Integer, Long>();

			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
				map.put(a[i], geta);
			}


			// �����ԍ��Ń\�[�g
			Object[] mapKey =  map.keySet().toArray();
			Arrays.sort(mapKey);

			while (remains > 0) {
				for (Object key : mapKey ) {
					if ( remains > 0) {
						map.replace((Integer) key, map.get(key) + 1);
						remains--;
					} else {
						break;
					}
				}
			}

			for (int temp : a) {
				System.out.println(map.get(temp));
			}
		}
	}
}