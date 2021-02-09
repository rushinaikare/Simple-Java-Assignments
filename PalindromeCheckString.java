public class PalindromeCheckString {

	public void palindromeCheck(String str) {

		String original = str;

		StringBuilder sb = new StringBuilder(str).reverse();

		String r = sb.toString();
		if (original.equals(r)) {
			System.out.println("palindrome");
		} else
			System.out.println("not palindrome");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeCheckString p = new PalindromeCheckString();
		p.palindromeCheck("ABA");

	}

}
