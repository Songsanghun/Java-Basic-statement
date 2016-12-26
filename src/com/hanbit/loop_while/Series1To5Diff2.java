package com.hanbit.loop_while;

/**
 * @FILE : SeriesOneToFive.java
 * @DATE : 2016. 12. 23.
 * @AUTHOR: Song Sang Hun
 * @STORY : Get the series 1 to 5(diff=1)
 */
public class Series1To5Diff2 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		while (num<=20) {
			//System.out.println("num: "+num); (디버깅용도)
			sum+=num;
			num+=2;
		}
		System.out.println("합은 " + sum + "입니다.");
	}
}
