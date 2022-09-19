package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ABC_269_C {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			long N = sc.nextLong();
			String N_str = Long.toBinaryString(N);

			// 1が入っている箇所を保管
			int[] a = new int[N_str.length()];

			List<Long> result = new ArrayList<Long>();

			int bit_count=0;//ビットが立っている数をカウント
			int j=0;
			for (int i=0; i<N_str.length(); i++) {
				if (N_str.charAt(i) == '1') {
					bit_count++;
					a[j] = i;
					j++;
				}
			}

			StringBuilder sb = new StringBuilder();
			for (int k=0; k<= Math.pow(2, bit_count)-1; k++) {
				String temp_str = String.format("%"+(bit_count == 0 ? 1 :bit_count)+"s", Integer.toBinaryString(k)).replace(" ", "0");
				int m=0;
				for (int i=0; i<N_str.length(); i++) {
					if (N_str.charAt(i) == '1') {
						sb.append(temp_str.charAt(m));
						m++;
					} else {
						sb.append(N_str.charAt(i));
					}
				}
				result.add(Long.valueOf(sb.toString(), 2));
				sb.delete(0, sb.length());
			}

			for (Long temp : result) {
				System.out.println(temp.longValue());
			}

		}

		//			if ( Long.MAX_VALUE > Math.pow(2, 60)) {
		//				System.out.print("OK");		
		//			}


	}

}