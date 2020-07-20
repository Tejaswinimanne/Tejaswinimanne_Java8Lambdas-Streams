package com.epam.datastreams;
import java.util.*;
import java.util.function.Function;


	public class streamsPalindrome {
		public static ArrayList<String> palindromeCheck(ArrayList<String> l){
			ArrayList<String> palindromes=new ArrayList<>();
			for(String str:l){
				int i=0,j=str.length()-1,f=0;
				while(i<j){
					if(str.charAt(i)!=str.charAt(j)){
						f=1;
						break;
					}
					i++;j--;
				}
				if(f==0) palindromes.add(str);
			}
			return palindromes;
		}
	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter number of strings:");
			int size=scanner.nextInt();
			ArrayList<String> listOfStrings=new ArrayList<>();
			System.out.println("Enter strings :");
			for(int i=0;i<size;i++)
				listOfStrings.add(scanner.next());
			Function<ArrayList<String> , ArrayList<String>> palindromes=streamsPalindrome::palindromeCheck;
			ArrayList<String> listOfPalindromeStrings=palindromes.apply(listOfStrings);
			System.out.println(listOfPalindromeStrings);
	}
}
