//Write a Java program to check whether two strings are anagram or not?

import java.util.Arrays;

public class AnagramCheck {

	static boolean isAnagram(String a, String b) {
        // Complete the function
        String string1 = a.replaceAll("\\s", "");
        String string2 = b.replaceAll("\\s", "");
        boolean status = false;
        if(string1.length() == string2.length()){
               char [] str1 = string1.toLowerCase().toCharArray();
               char [] str2 = string2.toLowerCase().toCharArray();
               Arrays.sort(str1); 
               Arrays.sort(str2);
               status = Arrays.equals(str1, str2);
               return status;
              }else
               status = false;
               return status;
        
            }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result = AnagramCheck.isAnagram("ABcd", "abCD");
		System.out.println( result ? "Anagram" : "Not Anagram" );
		
		
	}

}
