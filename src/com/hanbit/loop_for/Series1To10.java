package com.hanbit.loop_for;
/**
@FILE  : Series1To10.java
@DATE  : 2016. 12. 26.
@AUTHOR: Song Sang Hun
@STORY : 1부터 10까지 더한다.
 */
public class Series1To10 {
	public static void main(String[] args) {
		int sum=0;
		for(int num=0;num<11;num++){
			//System.out.println("num: "+num);
			sum+=num;
		}
		System.out.println("sum: "+sum);
	}
}
