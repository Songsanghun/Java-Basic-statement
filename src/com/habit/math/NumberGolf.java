package com.habit.math;
import java.util.Scanner;
/**
@FILE  : NumberGolf.java
@DATE  : 2016. 12. 27.
@AUTHOR: Song Sang Hun
@STORY : 최단횟수로 맞추는 사람이 승리하는 게임
-1 stop
You can Integer 1~100
 */
public class NumberGolf {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int target=(int)(Math.random()*100+1);
		System.out.println("TARGET:"+target);
		int bet=0, count=0;
		while(true){
			System.out.println("Enter Integer(1~100)");
			bet=s.nextInt();
			if(target==bet){
				System.out.println("OK");
				System.out.println("count: "+count);
			}else{
				/*if(target>bet){
					System.out.println("더큰 값을 입력해주세요.");
				}else{
					System.out.println("더 작은 값을 입력해주세요.");
				} 위 두 문장은 삼항여
				String result=(target>bet)?"더큰 값을 입력해주세요.":"더 작은 값을 입력해주세요.";
				System.out.println(result)
				*/
				System.out.println((target>bet)?"더큰 값을 입력해주세요.":"더 작은 값을 입력해주세요.");
				count++;
			
			}  
		}
	}

}
