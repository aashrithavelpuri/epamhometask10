package epamhometask10;

import java.util.*;
public class CheckPalindrome {
	interface checkPalindrome
	{
		public List<String> wordsList();
	}
	public static boolean check(String word)
	{
		int i1 = 0;
		int i2 = word.length() - 1;
		while (i2 > i1) {
		    if (word.charAt(i1) != word.charAt(i2)) {
		        return false;
		    }
		    ++i1;
		    --i2;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		checkPalindrome palindrome = ()->{
		System.out.print("Enter the number of Strings:");
		int numberOfStrings = scanner.nextInt();
		List<String> stringList = new ArrayList<>();
		System.out.println("Enter the strings to be checked whether palindrome or not:");
		for(int string = 0;string < numberOfStrings;string++)
			stringList.add(scanner.next());
		List<String> resultList = new ArrayList<>();
		for(int i = 0;i < stringList.size();i++)
		{
			String x = stringList.get(i);
			if(check(x) == true)
				resultList.add(x);
		}
		return resultList;
	  };
	 System.out.println("Palindrome strings are:"+palindrome.wordsList());
	 scanner.close();
	}

}