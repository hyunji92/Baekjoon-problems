package com.planb.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean [] map = {true, false, true, false, true, false, true, false};
		
		int count = 0;
		
		for(int i = 0; i < 8; i++) {
			String state = scanner.nextLine();
			// วัมู
			for(int j = 0; j < 8; j++) {
				if(state.charAt(j) == 'F' && map[j]) {
					count++;
				}
			}
			map = reverse(map);
		}
		
		scanner.close();
		System.out.println(count);
	}
	
	private static boolean[] reverse(boolean[] target) {
		boolean[] tempArray = new boolean[8];
		for(int i = 0; i < 8; i++) {
			tempArray[7 - i] = target[i];
		}
		
		return tempArray;
	}
}
