package abc;

import java.util.Scanner;

public class ABC_049_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// ������S�̎擾
			String s = sc.next();  // 1<=|s|<=100,000
			// ������T�̍쐬�v�f
			// ���v���[�X�������l������K�v����I�I
			final String[] words = { "eraser", "erase", "dreamer", "dream",  };

			for (String word:words) {
				s = s.replace(word, "");
			}
			if (s.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");	
			}	
		}
	}
}

// ���\�������iLTE�j����NG....
//public class ABC_049_C {
//	public static void main(String[] args) {
//		try (Scanner sc = new Scanner(System.in)) {
//			// ������S�̎擾
//			String s = sc.next();  // 1<=|s|<=100,000
//			// ������T�̍쐬�v�f
//			final String[] words = {"dream", "dreamer", "erase", "eraser"};
//
//			boolean isContinue = true;
//			boolean isMached = false;
//			while (isContinue) {
//				// ������̌�납��m�F���Ă���
//				for (String word:words) {
//					if (s.endsWith(word)) {
//						isMached = true;
//						s = s.substring(0, s.length() - word.length());
//						if (s.length() == 0) {
//							System.out.println("YES");
//							isContinue = false;
//						}
//					}
//				}	
//			}
//			if (!isMached) {
//				System.out.println("NO");
//				isContinue = false;
//			}
//
//		}
//
//	}
//}