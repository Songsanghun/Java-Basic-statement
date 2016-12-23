package com.hanbit.basic;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		// Variable Declation
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마에요?");
		int price=0, count=0, total=0, rate=0, last=0;
		// Value Assignment
		price = scanner.nextInt();
		System.out.println(price + "원 입니다.");
		System.out.println("몇 개 드릴까요?");
		count = scanner.nextInt();
		System.out.println(count + "개 주세요.");
		total = price * count;
		System.out.println("총금액은" + total + "원 입니다.");
		System.out.println("비싸요. 깎아주세요.");
		System.out.println("얼마나 깎아드릴까요?");
		rate = scanner.nextInt();
		System.out.println(rate + "% 깎아주세요.");
		// operation
		if (rate > 10) {
			System.out.println("안남아요. 안팔아요.");
		} else {
			last = total-(total/rate);
			System.out.println(last + "원 주세요.");
		}
	}
}
