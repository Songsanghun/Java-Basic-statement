package com.hanbit.matrix;
import java.util.Scanner;
/**
 *@author ssh
 *@STORY : 숫자 입력 받아서 다이아몬드로 숫자 출력
0    0    1    0    0  
0    2    3    4    0  
5    6    7    8    9  
0   10   11   12    0  
0    0   13    0    0
 */
public class Diamond {
public static void main(String[] args) {
             int len=5, col= len, row= len, val=0, start=0, end=0; //배열에 저장할 변수
     int[][] arr = new int[ col][ row];
     start=len/2; //열의 시작 위치
     end=len/2; //열의 끝 위치
     Scanner s = new Scanner(System.in);
     int i =0, j=0;
     for(i=0;i<arr.length;i++){
             System.out.println("");
             for(j=0;j<arr[i].length;j++){
                         if(j>=start&&j<=end){
                                     val++;
                                arr[i][j]=val;                                     
                         }else{
                                arr[i][j]=0;
                         }
                         if(i<len/2&&j==4){
                                     start--;
                                     end++;
                         }else if(i>=len/22&&j==4){
                                     start++;
                                     end--;
                         }
                         System.out.printf("%d \t",arr[i][j]);
             }
     }
}
}
