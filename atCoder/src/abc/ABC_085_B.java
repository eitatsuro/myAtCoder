package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ABC_085_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// ����
			int n = sc.nextInt();  // 1<=n<=100
			// ���a
			List<Integer> inputList = new ArrayList<Integer>();
			for (int i=0 ; i<n; i++) {
				inputList.add(sc.nextInt());
			}

			// ���a���������̂�r��
			List<Integer> dedupedList = inputList.stream().distinct().collect(Collectors.toList());

			//�@�\�[�g�i�����j
			//			Collections.sort(dedupedList);

			System.out.println(dedupedList.size());
		}

	}
}
