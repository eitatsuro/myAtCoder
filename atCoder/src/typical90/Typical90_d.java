package typical90;

import java.util.Scanner;

public class Typical90_d {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int h = sc.nextInt();
			int w = sc.nextInt();

			int[][] a = new int[h][];
			for(int i=0; i<h; i++) {
				a[i] = new int[w];
			}

			// 行、列の総和は保存しておいて再利用 
			int[] sumOfrow = new int[w];
			int[] sumOfColumn = new int[h];

			for(int i=0; i<h; i++) {
				for (int j=0; j<w; j++) {
					a[i][j] = sc.nextInt();
					sumOfColumn[i]+= a[i][j];
				}
			}

			for (int j=0; j<w; j++) {
				for(int k=0; k<h; k++) {
					sumOfrow[j]+= a[k][j];
				}
			}


			for(int i=0; i<h; i++) {
				for (int j=0; j<w; j++) {								
					System.out.print(sumOfrow[j] + sumOfColumn[i] - a[i][j]+" ");
				}
				System.out.println();
			}

		}

	}

}
