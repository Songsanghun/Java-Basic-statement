package com.hanbit.matrix;

import java.util.Scanner;

/*=============================================================
이름	국어	영어	수학	사회	과학	평균	학점	
-------------------------------------------------------------
ssh     100	90	90	90	90	92	A
=============================================================*/
public class ReportCardDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "=============================================================\n";
		str = "이름\t";
		System.out.printf("%s\n", "이름을 입력해주세요.");
		String name = s.next();
		System.out.printf("%s\n", "입력하실 과목수를 입력해주세요.");
		int length = s.nextInt();
		int i = 0, total = 0, average = 0, sw = 0;
		String arr[] = new String[length];
		int arr2[] = new int[length];
		String temp = "";
		for (i = 0; i < arr.length; i++) {
			System.out.printf("과목을 입력해주세요.\n");
			arr[i] = s.next();
			System.out.printf("점수를 입력해주세요.\n");
			arr2[i] = s.nextInt();
			total += arr2[i];
			str += arr[i] + "\t";
			temp += arr2[i] + "\t";
		}
		str += "평균\t" + "학점\n";
		str += "-------------------------------------------------------------\n";
		str += name+ "\t" + temp;
		average = total / length;
		sw = average / 10;
		char grade = 0;
		switch (sw) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'D';
			break;
		}
		str += average + "\t" + grade+"\n";
		str += "=============================================================";
		System.out.printf("%s",str);

	}
}