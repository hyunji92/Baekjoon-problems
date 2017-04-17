package com.planb.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] number = scanner.nextLine().toCharArray();
		scanner.close();
		
		Arrays.sort(number);
		System.out.println(reverse(number));
	}
	
	private static char[] reverse(char[] target) {
		int targetLength = target.length;
		char[] reversed = new char[targetLength];
		
		for(int i = 0; i < targetLength; i++) {
			reversed[targetLength - i - 1] = target[i];
		}
		
		return reversed;
	}
}
