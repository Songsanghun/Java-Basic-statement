package com.hanbit.basic;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		// Variable Declation
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s\n","얼마에요?");
		int price=0, count=0, total=0, rate=0, last=0;
		// Value Assignment
		price = scanner.nextInt();
		System.out.printf("%d 원 입니다.\n",price);
		System.out.printf("%s\n","몇 개 드릴까요?");
		count = scanner.nextInt();
		System.out.printf("%d 개 주세요.\n",count);
		total = price * count;
		System.out.printf("총금액은 %d 원 입니다.\n",total);
		System.out.printf("%s","비싸요. 깎아주세요.\n");
		System.out.printf("%s","얼마나 깎아드릴까요?");
		rate = scanner.nextInt();
		System.out.printf("%d, %s",rate ,"% 깎아주세요.\n");
		// operation
		if (rate > 10) {
			System.out.printf("%s","안남아요. 안팔아요.\n");
		} else {
			last = total-(total/rate);
			System.out.println(last + "원 주세요.");
		}
	}
}
