package com.hanbit.matrix;
import java.util.Scanner;
/*
  1   2   3   4   5
 10   9   8   7   6
 11  12  13  14  15
 20  19  18  17  16
 21  22  23  24  25
 * */
public class Zigzag {
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	System.out.println("길이를 입력해주세요.");
    	int length = s.nextInt(); // 배열 길이
        int i = 0; // 행
        int j = 0; // 열
        int k = 1; // 넣을 값
        int flag = 1; // 스위치변수
        
        int[][] arr = new int[length][length];
        for(i=0;i<arr.length;i++){
        	System.out.println("");
        	for(j=0;j<arr[i].length;j++){
        		
        		flag=(i%2==0)?1:-1;
        		arr[i][j]=(i%2==0)?i*length+j*flag+1:i*length+j*flag+length;
        				/*if(i%2==0){
        					flag=1;
        			arr[i][j]=i*length+j*flag+k;
        				}else{
        					flag=-1;
        			arr[i][j]=i*length+j*flag+length;		
        				}*/
    				System.out.printf("[%d]\t",arr[i][j]);
        		}
        	}
        }
    }
