package abc;

import java.util.Arrays;
import java.util.Scanner;


public class ABC_229_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt(); 
			long w = sc.nextInt();	
			long[] a = new long[n];  // measurement of delicious / [g] 
			long[] b = new long[n];  // available weight [g]

			for (int i=0; i<n; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}

			long[] a2 = Arrays.copyOf(a, a.length);
			// sort by descending order
			Arrays.sort(a2);
			for (int f = 0, l = a2.length - 1; f < l; f++, l--){
				long temp = a2[f];
				a2[f]  = a2[l];
				a2[l] = temp;
			}
			
			long[] b2 = new long[a.length];
			for (int i = 0; i < a.length; i++) {
			    int index = -1;
			    for (int j = 0; j < a.length; j++) {
			        if (a2[i] == a[j]) {
			            index = j;
			            break;
			        }
			    }
			    b2[i] = b[index];
			}

			

			long weightOfCheese = 0;
			long deliciousAmount = 0;
			for ( int i=0; i<n; i++) {
			    // i番目のチーズをすべて使える場合
				if ( weightOfCheese + b2[i] <= w ) {
					deliciousAmount += a2[i]*b2[i];
					weightOfCheese += b2[i];
			    // 重量制限ですべては使えない場合
				} else {
					deliciousAmount += a2[i]*(w - weightOfCheese);
					weightOfCheese = w;
					break;
				}
			}
			System.out.println(deliciousAmount);
		}
	
	}

}


