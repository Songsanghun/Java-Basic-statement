package com.hanbit.loop_for;

public class FIbonacci {
	public static void main(String[] args) {
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55 의 합
		int a=1, b=1, c=2, sum=2;
		for(int i=3;i<6;i++){
			c=a+b;
			a=b+c;
			b=c+a;
			sum+=a+b+c;
		}
		System.out.println("1, 1, 2, 3, 5, 8, 13, 21, 34, 55 의 합은 : "+(sum-b));
		}
	}
