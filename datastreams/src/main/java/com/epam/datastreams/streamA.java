package com.epam.datastreams;
import java.util.*;
import java.util.stream.Collectors;
public class streamA {
	public static List<String> search(ArrayList<String> arr) {
		return arr.parallelStream().filter(s->s.startsWith("a")).filter(s->s.length() == 3).collect(Collectors.toList());
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of words:");
		int n = scanner.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("Enter words:");
		for(int i = 0;i<n;i++) {
			arr.add(scanner.next());
		}
		System.out.println(search(arr));
	}
}
