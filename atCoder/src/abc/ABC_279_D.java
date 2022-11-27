package abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ABC_279_D {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//　方針： 対象の微分が0になる点に回りで解を探す
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			
			double ans = Math.pow( A/(2*B), 2./3. )  -1.;
			long n_ans = (long)ans;
			
			List<Double> ansCandidatesList = new ArrayList<Double>();
			
			if (n_ans > 1) ansCandidatesList.add( getFreeFallTime(A, B, n_ans-1) );
			if (n_ans > 2) ansCandidatesList.add( getFreeFallTime(A, B, n_ans-2) );
			if (n_ans > 3) ansCandidatesList.add( getFreeFallTime(A, B, n_ans-3) );
			if (n_ans > 4) ansCandidatesList.add( getFreeFallTime(A, B, n_ans-4) );
			if (n_ans > 5) ansCandidatesList.add( getFreeFallTime(A, B, n_ans-5) );
			ansCandidatesList.add( getFreeFallTime(A, B, n_ans) );
			ansCandidatesList.add( getFreeFallTime(A, B, n_ans+1) );
			ansCandidatesList.add( getFreeFallTime(A, B, n_ans+2) );
			ansCandidatesList.add( getFreeFallTime(A, B, n_ans+3) );
			ansCandidatesList.add( getFreeFallTime(A, B, n_ans+4) );
			ansCandidatesList.add( getFreeFallTime(A, B, n_ans+5) );
			
			Collections.sort(ansCandidatesList, Comparator.naturalOrder());
			
			System.out.println(ansCandidatesList.get(0));
			

		}
	}
	
	private static double getFreeFallTime(double A, double B, double n) {
		return ( B*n + A/Math.sqrt(1+n));
	
	}
}