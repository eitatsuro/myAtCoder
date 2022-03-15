package abc;

import java.util.Scanner;

public class ABC_049_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 文字列Sの取得
			String s = sc.next();  // 1<=|s|<=100,000
			// 文字列Tの作成要素
			// リプレース順序を考慮する必要あり！！
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

// 性能が悪い（LTE）ためNG....
//public class ABC_049_C {
//	public static void main(String[] args) {
//		try (Scanner sc = new Scanner(System.in)) {
//			// 文字列Sの取得
//			String s = sc.next();  // 1<=|s|<=100,000
//			// 文字列Tの作成要素
//			final String[] words = {"dream", "dreamer", "erase", "eraser"};
//
//			boolean isContinue = true;
//			boolean isMached = false;
//			while (isContinue) {
//				// 文字列の後ろから確認していく
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