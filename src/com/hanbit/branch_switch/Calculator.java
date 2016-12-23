package com.hanbit.branch_switch;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("===Calculator===");
		int a = 0, b = 0, result = 0;
		System.out.println("First Number:");
		a = s.nextInt();
		System.out.println("Opcode:");
		String opcode =s.next();
		//String opcode = ""; // 외부에서 값을 입력받는 식.
		//opcode = s.next();
		// if(opcode.equals("+")){
		// a + b
		// }
		System.out.println("Second Number:");
		b = s.nextInt();
		switch(opcode){
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "/":
			result = a / b;
			break;
		case "*":
			result = a * b;
			break;
		case "%":
			result = a % b;
			break;
		default :
			System.out.println("올바른 OPCODE를 입력해주세요");
			return;
			}
		System.out.println("Result = " + result);
	}
}