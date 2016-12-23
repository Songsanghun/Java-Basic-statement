package com.hanbit.branch_if;

import java.util.Scanner;

/*
To.개발자님께
초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 
만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
*/
public class TimeCalc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("초를 시간과 분으로 바꾸어주는 프로그램입니다.");
		System.out.println("초를 입력해주세요.");
		int sec = s.nextInt();
		int a = sec % 60;
		int min = sec / 60;
		int b = min % 60;
		int hour = sec / 60 / 60;
		if (sec < 60) {
			System.out.println("0시간 0분" + sec + "초 입니다.");
		} else if (60 <= sec && sec < 3600) {
			System.out.println("0시간" + min + "분" + a + "초 입니다.");
		} else {
			System.out.println(hour + "시간 " + b + "분 " + a + "초 입니다.");
		}

		// 나머지를 완성하세요
		// 여기에서 추가로 필요한 문법은
		// 나눗셈 기호에서 / 는 몫을 % 는 나머지를 구합니다.
		// 예를들어 63/6 = 10 이고 63%6 = 3 입니다.
	}
}
