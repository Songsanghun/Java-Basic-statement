package com.hanbit.loop_while;

/**
 * @FILE : SeriesOneToFive.java
 * @DATE : 2016. 12. 23.
 * @AUTHOR: Song Sang Hun
 * @STORY : 1부터 5까지의 합 구하기(diff=1)
 */
public class Unary {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		while (num<5) {
			num++;
			sum+=num;
			//sum=sum+num;
			//++num;
			//num=num+1;
		}
		System.out.println("합은 " + sum + "입니다.");
	}
}
