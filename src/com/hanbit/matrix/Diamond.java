package com.hanbit.matrix;
/*
0    0    1    0    0   
0    2    3    4    0   
5    6    7    8    9   
0    10    11    12    0   
0    0    13    0    0
 * */
public class Diamond {
    public static void main(String[] args) {
        int len=5, col= len, row= len, val=0, start=0, end=0; //배열에 저장할 변수
        int[][] arr = new int[ col][ row];
        start=3; //열의 시작 위치
        end=3; //열의 끝 위치
        
        for(int i=0;i<arr.length;i++){
        	System.out.println("");
        	for(int j=0;j<arr[i].length;j++){
        		switch(i){
        		case 0: 
        			if(j==2){
        				arr[i][j]=1;
        			}else{
        				arr[i][j]=0;
        			}break;
        		case 1:
        			if(j==1){
        				arr[i][j]=2;
        			}else if(j==2){
        				arr[i][j]=3;
        			}else if(j==3){
        				arr[i][j]=4;
        			}else{
        				arr[i][j]=0;
        			}break;
        		case 2:
        			if(j==0){
        				arr[i][j]=5;
        			}else if(j==1){
        				arr[i][j]=6;
        			}else if(j==2){
        				arr[i][j]=7;
        			}else if(j==3){
        				arr[i][j]=8;
        			}else{
        				arr[i][j]=9;
        			}break;
        		case 3:
        			if(j==1){
        				arr[i][j]=10;
        			}else if(j==2){
        				arr[i][j]=11;
        			}else if(j==3){
        				arr[i][j]=12;
        			}else{
        				arr[i][j]=0;
        			}break;
        		case 4:
        			if(j==2){
        				arr[i][j]=13;
        			}else{
        				arr[i][j]=0;
        			}break;
        		}
        		
        		System.out.printf("%d\t",arr[i][j]);
        	}
        	
        }
       
    
    }
}