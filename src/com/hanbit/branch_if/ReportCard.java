
package com.hanbit.branch_if;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("name : ");
		String name = s.next();
		System.out.println("Korean score : ");
		int korean = s.nextInt();
		System.out.println("English score : ");
		int english = s.nextInt();
		System.out.println("Math score : ");
		int math = s.nextInt();
		int total = korean + english + math;
		int average = total / 3;
		char grade = 0;
		if(average >=90){
			grade = 'A';			
		}else if(average >=80){
			grade = 'B';
		}else if(average >=70){
			grade = 'C';
		}else{
			grade = 'D';
		}
		
		System.out.println("name : "+name);
		System.out.println("Total : "+total);
		System.out.println("Average : "+average);
		System.out.println("Grade :"+grade);
	}
}
