package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_272_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			@SuppressWarnings("rawtypes")
			List<List> k = new ArrayList<List>();
			for (int i=0; i<M; i++) {
				List<Integer> x = new ArrayList<Integer>();
				int len = sc.nextInt();
				for (int j=0; j<len; j++) {
					x.add(sc.nextInt());
				}
				k.add(x);
			}

			for ( int i=1; i<=N; i++) {
				for ( int j=i+1; j<=N; j++) {

					boolean x_hit = false;
					boolean y_hit = false;
					for (List<Integer> temp_list : k) {
						x_hit = false;
						y_hit = false;
						for ( Integer temp_int : temp_list ) {
							if (temp_int.intValue() == i) x_hit = true;
							if (temp_int.intValue() == j) y_hit = true;
						}
						if (x_hit && y_hit) {
							break;
						} 
					}

					if ( !(x_hit && y_hit ) ) {
						System.out.println("No");
						System.exit(0);
					}

				}
			}
			System.out.println("Yes");
		}
	}
}