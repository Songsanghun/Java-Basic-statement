package com.hanbit.math;
import java.util.Scanner;
/**
@FILE  : LottoDraw.java
@DATE  : 2016. 12. 27.
@AUTHOR: Song Sang Hun
@STORY :
로또 볼 추첨
1~45 까지 랜덤숫자
볼갯수는 총 6개
중복 허용
출력은 [5,23,23,40,19,22]
 */
public class LottoDraw {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=0,b=0,c=0,d=0,e=0,f=0,count=0,num=0;
		while(count<6){
			/*if(count==0){
				a=(int)(Math.random()*45+1);
				}else if(count==1){
				b=(int)(Math.random()*45+1);
				}else if(count==2){
				c=(int)(Math.random()*45+1);
				}else if(count==3){
				d=(int)(Math.random()*45+1);
				}else if(count==4){
				e=(int)(Math.random()*45+1);
				}else{
				f=(int)(Math.random()*45+1);
					}*/
			num=(int)(Math.random()*45+1);
			switch(count){
			case 0: a=num; break;
			case 1: b=num; break;
			case 2: c=num; break;
			case 3: d=num; break;
			case 4: e=num; break;
			case 5: f=num; break;
			}
			count++;
		}System.out.println(a+","+b+","+c+","+d+","+e+","+f);
				
	}

}
