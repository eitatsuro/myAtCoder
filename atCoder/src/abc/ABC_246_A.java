package abc;

import java.util.Scanner;

public class ABC_246_A {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int[] x = new int[4];
			int[] y = new int[4];
			
			for (int i=0; i<3; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			
			if (x[0] == x[1]) {
				x[3] = x[2];
			} else if (x[0] == x[2]){
				x[3] = x[1];
			} else {
				x[3] = x[0];
			}
			
			if (y[0] == y[1]) {
				y[3] = y[2];
			} else if (y[0] == y[2]){
				y[3] = y[1];
			} else {
				y[3] = y[0];
			}
			
			System.out.println(x[3]+" "+y[3]);
		}

	}

}
