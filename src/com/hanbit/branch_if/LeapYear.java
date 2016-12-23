package com.hanbit.branch_if;
/*
To. 개발자님
연도를 4로 나눈값이 0 이라면 윤년일 수 있다.
그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.
2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
다시 이 값이 100으로 나눠 떨어지면 평년이다.
평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.
 * */
import java.util.Scanner;
public class LeapYear {
      public static void main(String[] agrs){
            Scanner s = new Scanner(System.in);
            System.out.println("년도 : ");
            int year = s.nextInt();
            if(year%4==0){
                  if(year%100==0){
                        if(year%400==0){
                              System.out.println("윤년입니다.");
                        }else{
                              System.out.println("평년입니다.");
                        }
                  }else{
                        System.out.println("윤년입니다.");
                  }
            }else{
                  System.out.println("평년입니다.");
            }
      }
}
