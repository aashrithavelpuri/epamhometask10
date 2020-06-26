package epamhometask10;

import java.util.*;
public class Average {
	interface average
	{
		public float averagemethod();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		average object = ()->{
			System.out.print("Enter the number of elements:");
			int numberOfElements = scanner.nextInt();
			ArrayList<Integer> arraylist = new ArrayList<Integer>();
			System.out.print("Enter "+numberOfElements+" elements:");
			for(int element = 0; element < numberOfElements; element++)
				arraylist.add(scanner.nextInt());
			int sum = 0;
			for(Integer element:arraylist)
				sum += element;
			float AverageOfList=(float)(sum)/arraylist.size();
			return AverageOfList;
		};
		System.out.println("Average:"+object.averagemethod());
		scanner.close();
	}

}