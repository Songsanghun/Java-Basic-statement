package com.hanbit.math;
import java.util.Scanner;
public class FindTheSumOf5Numbers {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.printf("%s\n","The sum of 5Numbers");
	int sum=0, count=0,n=0; 
	while(count<5){
		System.out.printf("%s\n","Enter number");
		n = s.nextInt();
		sum+=n;
		count++;
	}
	 System.out.printf("%d",sum);
}
}
