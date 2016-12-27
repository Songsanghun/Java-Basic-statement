package com.hanbit.series;
import java.util.Scanner;
/**
@FILE  : Fibonacci2.java
@DATE  : 2016. 12. 27.
@AUTHOR: Song Sang Hun
@STORY : 피보나치
 */
public class Fibonacci2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55 의 합
		int a=1, b=1, c=2, sum=2 ;
		System.out.print("Enter the last index of Term"
				+ " start of index is 1");
		int last=s.nextInt();
		for(int i=3;i<=last;i++){
			c=a+b;
			sum+=c;
			a=b;
			b=c;
		}
		System.out.printf("the sum to %d is %d",last,sum);
		}
	}
