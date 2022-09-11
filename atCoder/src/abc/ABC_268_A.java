package abc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC_268_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			int E = sc.nextInt();
			
			Set<Integer> kindOfInput = new HashSet<>();
			kindOfInput.add(Integer.valueOf(A));
			kindOfInput.add(Integer.valueOf(B));
			kindOfInput.add(Integer.valueOf(C));
			kindOfInput.add(Integer.valueOf(D));
			kindOfInput.add(Integer.valueOf(E));
			
			System.out.println(kindOfInput.size());
		
		}
	}

}