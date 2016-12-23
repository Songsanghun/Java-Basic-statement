package com.hanbit.branch_if;
/*
[1]연도를 4로 나눈값이 0 이고,
   해당 연수가 100으로 나누어 떨어지지 않으면 윤년이다.
[2]연도를 4로 나눈값이 0 이고,
   해당 연수가 100으로 나누어 떨어지는데,
   400으로 나눠 떨어지면 윤년
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
