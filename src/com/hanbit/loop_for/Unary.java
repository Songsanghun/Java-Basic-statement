package com.hanbit.loop_for;

/**
 * @FILE : SeriesOneToFive.java
 * @DATE : 2016. 12. 23.
 * @AUTHOR: Song Sang Hun
 * @STORY : 1부터 5까지의 합 구하기(diff=1)
 */
public class Unary {
	public static void main(String[] args) {
		int sum = 0;
		for(int num = 0;num<5;num++){
			//int num = init ; num<5 = limit ; num++ = step
			
			System.out.println("Num: "+num);
			sum+=num;
		}
		System.out.println("합은 " + sum + "입니다.");
	}
}
