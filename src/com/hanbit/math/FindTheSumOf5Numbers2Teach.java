package com.hanbit.math;

import java.util.Scanner;
/**
@FILE  : FindTheSumOf5Numbers2Teach.java
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
public class FindTheSumOf5Numbers2Teach {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int target=0, sum=0, count=0, i=0;
	while(true){
		System.out.println("Enter Integer");
		target=s.nextInt();
		if(target<5){
			/*if(target==-1){
				System.out.println("Bye~");
			}else{
				System.out.println("please input again!");
			}
			String result=(target==-1)?"Bye~":"please input again!";
			System.out.println(result);
			*/
			System.out.println((target==-1)?"Bye~":"please input again!");
		}else{
			count=0;
			sum=0;
			//for(int i =1;i<=target;i++) int i 가 있을경우 메모리를 계속 잡아먹기 떄문에 위에 빼주는것이 좋다.
			for(i=1;i<=target;i++){
				if(i%5==0){
					count++;
					sum+=i;
				}
			}
			System.out.printf("Integer From 1 to %d\n"
					+ "The Number of Multi 5: %d\n"
					+ "The Sum: %d\n",target,count,sum);
		}
	}
}
}
