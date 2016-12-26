package com.hanbit.loop_while;
import java.util.Scanner;
public class ReportCard {
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("name : ");
            String name = s.next();
            System.out.println("If you want to stop, Type -1");
            System.out.println("If the number of subject is 6, Auto quit!!");
            int total = 0; int count = 0;
            while(count<=5){
                  System.out.println("score : ");
                  int score = s.nextInt();
                  total+=score;
                  //total=total+score;
                  count++;
                  //count=count+1;
            }
            int average = total / count;
            char grade = 0;
            if(average >=90){
                  grade = 'A';                  
            }else if(average >=80){
                  grade = 'B';
            }else if(average >=70){
                  grade = 'C';
            }else{
                  grade = 'D';
            }
            System.out.printf("%s %s","name : ",name);
            System.out.println("Total : "+total);
            System.out.println("Average : "+average);
            System.out.println("Grade :"+grade);
      }
}
