package chapter1;

import java.util.Arrays;

public class checkPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "racecar";
		String s2 = "carrace";
		boolean ret = checkStrPermutation(s1, s2);
		System.out.println("string permutation: " + ret);

	}

	public static boolean checkStrPermutation (String str1, String str2) {
		int length1 = str1.length();
		int length2 = str2.length();

		if (length1 != length2) {
			return false;
		} else {
			char[] s1Arr = str1.toCharArray(); 
			char[] s2Arr = str2.toCharArray();
			Arrays.sort(s1Arr);
			Arrays.sort(s2Arr);

			for (int i=0; i<length1; i++) {
				if ( s1Arr[i] != s2Arr[i] ) {
					return false;
				}				
			}

			return true;
			//return true;

			/* 1. examine each character of both strings
			 * 2. compare if they have the same types of characters & count of them 
			 * 
			 * Options:
			 * 1. alphabetize strs
			 * 2. do they match?
			 * 		if not at any point, no match, not permutation
			 * 
			 */}
	}


}
