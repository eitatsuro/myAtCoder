package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ABC_285_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long A = sc.nextLong();
			long B = sc.nextLong();
			String S = sc.next();
			
			List<Long> costList = new ArrayList<Long>();
			StringBuilder sb = new StringBuilder();
			sb.append(S);
			
			for (int i=0; i<(N-1)/2; i++) {
				sb.append(S.substring(i));
				sb.append(S.substring(0, i));
				costList.add(getCost_B(sb.toString(), B) + i*A);
				sb.delete(0, sb.length());
			}
			
			Collections.sort(costList);
			System.out.print(costList.get(0));
			
			

		}
	}
	
	private static Long getCost_B(String s, long b) {
		int length = s.length();
		long cost = 0;
		for(int i=0; i<(length-1)/2; i++) {
			if(s.charAt(i) == s.charAt(length-1-i)) {
				//do nothing
			} else {
				cost = cost + b;
			}
		}
		return cost;
	}
}
