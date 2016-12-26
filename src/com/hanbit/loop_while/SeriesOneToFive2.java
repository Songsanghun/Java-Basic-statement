package com.hanbit.loop_while;

/**
 * @FILE : SeriesOneToFive.java
 * @DATE : 2016. 12. 23.
 * @AUTHOR: Song Sang Hun
 * @STORY : 1부터 5까지의 합 구하기(diff=1)
 */
public class SeriesOneToFive2 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 1;
		while (num<=5) {
			sum+=num;
			//sum=sum+num;
			num+=2;
			//num=num+2;
		}
		System.out.println("합은 " + sum + "입니다.");
	}
}
