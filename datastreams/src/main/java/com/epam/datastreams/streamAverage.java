package com.epam.datastreams;
import java.util.*;
public class streamAverage {
	public static double average(ArrayList<Integer> arr) {
		return arr.stream().mapToInt(i->i).average().getAsDouble();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements :");
		int n = scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println("Enter numbers :");
		for(int i = 0;i<n;i++) {
			arrayList.add(scanner.nextInt());
		}
		double result = average(arrayList);
		System.out.println(result);
	}
}
