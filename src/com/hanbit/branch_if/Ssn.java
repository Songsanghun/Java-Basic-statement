package com.hanbit.branch_if;

import java.util.Scanner;

public class Ssn {
	public static void main(String[] agrs) {
		Scanner s = new Scanner(System.in);
		System.out.println("주민번호 : ");
		String ssn = s.next();
		char ch = ssn.charAt(7);
		if (ch == '0' || ch == '7' || ch == '8' || ch == '9') {
			System.out.println("다시 입력하세요.");
			return;
		}
		if (ch == '1' || ch == '3') {
			System.out.println("남자");
		} else if (ch == '2' || ch == '4') {
			System.out.println("여자");
		} else if(ch == '5' || ch == '6'){
			System.out.println("외국인");
		} else {
			System.out.println("올바른숫자가 아닙니다.");
		}
	}
}