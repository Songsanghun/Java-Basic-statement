
package com.hanbit.branch_if;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("나이 :  ");
		int age = s.nextInt();
		if (age < 2) {
			System.out.println("BMI 지수의 참고치 정보는 2세 이상부터 제공됩니다.정확한 수치를 입력해주세요.");
			return;
		}

		System.out.println("신장 :   cm");
		double height = s.nextDouble();
		System.out.println("몸무게 :   kg");
		double weight = s.nextDouble();
		double bmi = weight / (height / 100 * height / 100);
		String grade = "";
		//FM으로 표기하면 String grade = new String();

		if (bmi > 30.0) {
			grade = "고도비만";
		} else if (bmi > 25.0) {
			grade = "비만";
		} else if (bmi > 23.0) {
			grade = "과체중";
		} else if (bmi > 18.5) {
			grade = "정상";
		} else {
			grade = "저체중";
		}
		System.out.println("나의 신체 질량지수(BMI)는 " + grade);
	}
}