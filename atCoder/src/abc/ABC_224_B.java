package abc;

import java.util.Scanner;


public class ABC_224_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int h = sc.nextInt(); // hçs
			int w = sc.nextInt(); // wóÒ
			int[][] a = new int[h][w];
			
			for (int i=0; i<h; i++) {
				for (int j=0; j<w; j++) {
					a[i][j]=sc.nextInt();
				}
			}
			
			for (int i1=0; i1<h-1; i1++) {
				for (int j1=0; j1<w-1; j1++) {
					for (int i2=i1+1; i2<h; i2++) {
						for (int j2=j1+1; j2<w; j2++) {
							if (a[i1][j1]+a[i2][j2] <= a[i2][j1]+a[i1][j2]) {
								continue;
							} else {
								System.out.println("No");
								System.exit(0);
							}
						}
					}
				}
			}
			System.out.println("Yes");
			
		}
	}
}