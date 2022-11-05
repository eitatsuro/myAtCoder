package abc;

import java.util.Scanner;

public class ABC_275_B {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long A = sc.nextLong();
			long B = sc.nextLong();
			long C = sc.nextLong();
			long D = sc.nextLong();
			long E = sc.nextLong();
			long F = sc.nextLong();

			long term1 =  (((A%PRIME)*(B%PRIME)%PRIME)*(C%PRIME)) % PRIME;
			long term2 =  (((D%PRIME)*(E%PRIME)%PRIME)*(F%PRIME)) % PRIME;

			long ans = mod_minus(term1 - term2, PRIME);
			System.out.println(ans);

		}
	}

	private static final long PRIME=998244353;
	/**
	 * マイナス値にも対応したmod演算
	 * @param target
	 * @param mod
	 * @return
	 */
	private static long mod_minus(long target, long mod) {
		long ans = target % mod;
		if ( ans < 0) {
			ans += mod;
		}

		return ans;

	}

}