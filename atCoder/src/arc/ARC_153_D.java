package arc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ARC_153_D {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			long[] A = new long[N];
			Set<Long> xWhereMinCandidates = new HashSet<Long>();

			for (int i=0; i<N; i++) {
				A[i]=sc.nextLong();
				long candidate = getCompliment(A[i]);
				xWhereMinCandidates.add( candidate );
				for(int j=-100; j<101; j++) {
					if( candidate + j > 0) {
						xWhereMinCandidates.add(candidate+j);
					}
				}
				long candidate2 = getAlmostCompliment(A[i]);
				xWhereMinCandidates.add(candidate2);
				for(int j=-100; j<101; j++) {
					if( candidate2 + j > 0) {
						xWhereMinCandidates.add(candidate2+j);
					}
				}
			}

			long min = Long.MAX_VALUE;
			for (Long temp : xWhereMinCandidates) {
				long fxsum = getFxSum(N, A, temp);
				if ( fxsum < min) min=fxsum;
			}
			System.out.println(min);

		}
	}

	public static long getFxSum(int N, long[] A, long x) {
		long ret = 0;
		for(int i=0; i<N; i++) {
			ret+=getFx(A[i]+x);
		}
		return ret;
	}

	public static long getFx(long i) {
		long ret = 0;
		while (i != 0) { // 10で割った結果が0になったら終了する
			ret += i % 10; // 1桁目を取得する
			i /= 10; // 1/10にする
		}
		// 反転しているので戻す
		return ret;
	}


	public static List<Long> getDigitList(long i) {
		List<Long> list = new ArrayList<>();
		while (i != 0) { // 10で割った結果が0になったら終了する
			list.add(i % 10); // 1桁目を取得する
			i /= 10; // 1/10にする
		}
		// 反転しているので戻す
		Collections.reverse(list);
		return list;
	}

	public static long getCompliment(long i) {
		long ketasu = getKetasu(i);
		return (long)Math.pow(10,ketasu) - i; 
	}

	public static long getAlmostCompliment(long i) {
		long ketasu = getKetasu(i);
		return i%((long)Math.pow(10,ketasu-1)); 
	}

	public static long getKetasu(long i) {
		long ans=0;
		while (i != 0) { // 10で割った結果が0になったら終了する
			i /= 10; // 1/10にする
			ans++;
		}
		return ans;
	}

	//最大公約数gcd ( Greatest Common Divisor )
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}



}