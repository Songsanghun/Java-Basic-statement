package com.hanbit.branch_switch;

import java.util.Scanner;

public class ShowMonth {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Year");
		int year = s.nextInt();
		System.out.println("Month");
		int month = s.nextInt();
		String day = "";
		
		switch(month){
		case 1: 	case 3: 	case 5:	case 7:	case 8:	case 10: 	case 12: 
		day="31"; break;
		case 4:	case 6:	case 9:	case 11:
			day="30"; break;
		case 2:if (year % 400 == 0) {
					day= "29";
		} else if (year % 100 == 0) {
			 day= "28";
		} else if (year % 4 == 0) {
			day = "29";
		} else {
			day = "28";
			}break;
			default:
				System.out.println("정확한 달을 입력하세요.");
				return;		
		}
		System.out.println(year+"년은 " + month+"달은 " + day+"입니다.");
	}
}