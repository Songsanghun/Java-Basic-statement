package com.hanbit.math;

/**
@FILE  : FindTheSumOfMulti5.java
@DATE  : 2016. 12. 27.
@AUTHOR: Song Sang Hun
@STORY : 
[Console]
Integer Form 1 to [input]
The Number of Multi 5: ?
The Sum:
※If input less than 4, please input again!
※If you want to stop, enter -1
 */
import java.util.Scanner;

public class FindTheSumOfMulti5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while (true) {
			int count = 0, num = 0, sum=0, i=0;
			System.out.printf("%s\n", "Number");
			num = s.nextInt();
			System.out.printf("%s\n", "If you want to stop, enter -1");
			if (num!=-1&&num < 5) {
				System.out.printf("%s\n", "please input again!");
			} else if (num == -1) {
				System.out.printf("%s", "End");return;
			} else {
				count = num / 5;
				for(i=1;i<=count;i++){
					sum+=(5 * i);
				}
				System.out.printf("%s\n %d\n","sum",sum);
				System.out.printf("%s\n %d\n","Number of Multi",count);
			}
		}
	}
}
