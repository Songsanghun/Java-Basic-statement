package com.hanbit.matrix;
import java.util.Scanner;
public class ReportCard {
      public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("name : ");
            String name = s.next();
            System.out.println("If the number of subject is 5, Auto quit!!");
            int total = 0, i = 0, average=0;
            int[]arr2=new int[5];
            String subjectString ="=============================================================\n";
            String[] subjects={"이름","국어","영어","수학","사회","과학","평균","학점"};
            for(i=0;i<subjects.length;i++){
            	subjectString+=subjects[i]+"\t";
            }
            subjectString+="\n-------------------------------------------------------------\n"+name;
            String temp="     ";
            for(i=0;i<arr2.length;i++){
            	arr2[i]=s.nextInt();
            	if(arr2[i]>=0&&arr2[i]<=100){
            		total+=arr2[i];
                	temp+=arr2[i]+"\t";
            	}else{
            		System.out.printf("%s\n","0에서 100사이의 숫자를 입력해주세요.");
            		i--;
            	}
            	
            }
            subjectString+=temp;
            average = total / arr2.length;
            int sw=average/10;
            char grade = 0;
            switch(sw){
            case 10: case 9: grade = 'A';break;
            case 8: grade = 'B';break;
            case 7: grade = 'C';break;
            	default: grade = 'D';break;
            }/*
            if(average >=90){
                  grade = 'A';                  
            }else if(average >=80){
                  grade = 'B';
            }else if(average >=70){
                  grade = 'C';
            }else{
                  grade = 'D';
            }
            */
            subjectString+=(average+"\t"+grade);
            subjectString+="\n=============================================================";
            
            System.out.printf(
            		"%s",subjectString);
      }
}
