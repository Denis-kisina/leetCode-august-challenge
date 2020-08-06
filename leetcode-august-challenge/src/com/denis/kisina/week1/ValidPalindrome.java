package com.denis.kisina.week1;

class ValidPalindrome {
	public boolean isPalindrome(String s) {
		if (s == "") {
			return true;
		}
		if (s == null) {
			return false;
		}
		s = s.toLowerCase();
		s = s.replaceAll("[^A-Za-z0-9]", "");
		int i = 0;
		int j = s.length() - 1;

		for (; i < s.length(); i++, j--) {

			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}