package com.planb.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CustomStack stack = new CustomStack();
		
		int numOfOperators = scanner.nextInt();
		String[] operators = new String[numOfOperators];
		scanner.nextLine(); // flush
		
		for(int i = 0; i < operators.length; i++) {
			operators[i] = scanner.nextLine();
		}
		scanner.close();
		
		for(int i = 0; i < operators.length; i++) {
			if(operators[i].contains(" ")) {
				stack.push(Integer.parseInt(operators[i].split(" ")[1]));
			} else {
				switch(operators[i]) {
				case "pop":
					System.out.println(stack.pop());
					break;
				case "size":
					System.out.println(stack.getSize());
					break;
				case "empty":
					System.out.println(stack.isEmpty());
					break;
				case "top":
					System.out.println(stack.getTop());
				}
			}
		}
	}	
}
