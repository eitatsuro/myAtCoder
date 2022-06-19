package abc;

import java.util.Scanner;

public class ABC_256_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int[] h = new int[3];
			int[] w = new int[3];

			for (int i=0; i<3; i++) {
				h[i] = sc.nextInt();
			}

			for (int i=0; i<3; i++) {
				w[i] = sc.nextInt();
			}

			int[][] m = new int[3][3];
			int numOfPattern=0;
			
			// 1行目
			for (int i=1; i<h[0]-1; i++) {
				for (int j=1; j<h[0]-i; j++) {
					// i, j, h[0]-i-j
					m[0][0] = i;
					m[0][1] = j;
					m[0][2] = h[0]-i-j;
					// 2行目
					for (int l=1; l<h[1]-1; l++) {
						for (int n=1; n<h[1]-l; n++) {
							m[1][0] = l;
							m[1][1] = n;
							m[1][2] = h[1]-l-n;
							// 3行目
							for (int p=1; p<h[2]-1; p++) {
								for (int q=1; q<h[2]-p; q++) {
									m[2][0] = p;
									m[2][1] = q;
									m[2][2] = h[2]-p-q;
									
									//
									if (    m[0][0] + m[1][0] + m[2][0] == w[0]
										&&  m[0][1] + m[1][1] + m[2][1] == w[1] 
									    &&  m[0][2] + m[1][2] + m[2][2] == w[2] ) {
										numOfPattern++;
									}
								}
							}
						}
					}
				}
			}
			System.out.println(numOfPattern);
		}
	}
}
