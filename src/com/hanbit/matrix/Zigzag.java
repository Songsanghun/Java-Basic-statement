package com.hanbit.matrix;
/*
  1   2   3   4   5
 10   9   8   7   6
 11  12  13  14  15
 20  19  18  17  16
 21  22  23  24  25
 * */
public class Zigzag {
    public static void main(String[] args) {
        int length = 5; // 배열 길이
        int i = 0; // 행
        int j = 0; // 열
        int k = 1; // 넣을 값
        int flag = 1; // 스위치변수
        int[][] arr = new int[5][5];
        for(i=0;i<arr.length;i++){
        	System.out.println("");
        	for(j=0;j<arr[i].length;j++){
        				if(i%2==0){
        			arr[i][j]=i*5+j+1;
        				}else{
        			arr[i][j]=i*5-j+5;		
        				}
    				System.out.printf("[%d]",arr[i][j]);
        		}
        	}
        }
    }
