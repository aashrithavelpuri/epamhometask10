package epamhometask10;

import java.util.*;
import java.util.stream.Collectors;
public class Letters {
	interface letters
	{
		public List<String> search();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
			letters letter=()->{
				System.out.print("Enter the no.of strings to be entered:");
				int sizeOfList = scanner.nextInt();
				System.out.println("Enter "+sizeOfList+" strings:");
				List<String> listOfStrings = new ArrayList<>();
				for(int element = 0; element < sizeOfList; element++)
					listOfStrings.add(scanner.next());
				return listOfStrings.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).collect(Collectors.toList());
	};
	  System.out.println("Strings having size 3 and starting with a(lowercase):"+letter.search());
	  scanner.close();
	}

}