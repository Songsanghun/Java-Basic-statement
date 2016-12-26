package com.hanbit.loop_for;
import java.util.Scanner;
public class FIbonacci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//1, 1, 2, 3, 5, 8, 13, 21, 34, 55 의 합
        System.out.println("어느항까지의 합을 원하는지 항을 입력해주세요.");
        int i = s.nextInt();
		int a=1, b=1, c=2, sum=2;
		for(int i=3;i<6;i++){
			c=a+b;
			a=b+c;
			b=c+a;
			sum+=a+b+c;
		}
		if(i%3==0){
			System.out.println(i+"항까지의 합은"+sum);
		}else if(i%3==1){
			System.out.println(i+"항까지의 합은"+(sum-b));
		}else{System.out.println(i+"항까지의 합은"+(sum-b-c));}
		}
	}
