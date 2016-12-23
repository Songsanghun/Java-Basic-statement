package com.hanbit.branch_switch;

import java.util.Scanner;

public class Ssn {
	public static void main(String[] agrs) {
		Scanner s = new Scanner(System.in);
		System.out.println("주민번호 : ");
		String ssn = s.next();
		char ch = ssn.charAt(7);
		String result = "";
		switch(ch){
		case '1' :	case '3':
			result="남자";break;
		case '2':	case '4':
			result="여자";break;
		case '5':	case '6':
			result="남자";break;
		default :
			System.out.println("다시 입력하세요.");
			return;
		}System.out.println(result);
	}
}