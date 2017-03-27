package com.planb.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		scanner.close();
		char[] charInput = input.toCharArray();
		
		int cnt = 0;
		for(char c: charInput) {
			cnt++;
			System.out.print(c);
			if(cnt == 10) {
				System.out.println();
				cnt = 0;
			}
		}
	}
}
