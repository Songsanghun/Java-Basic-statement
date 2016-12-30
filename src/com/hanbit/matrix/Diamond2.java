package com.hanbit.matrix;

public class Diamond2 {
	 public static void main(String[] args) {
	        /*int len=5, col= len, row= len, val=0, start=0, end=0; //배열에 저장할 변수
	        int[][] arr = new int[ col][ row];
	        start=3; //열의 시작 위치
	        end=3; //열의 끝 위치
*/
		 int i=5,j=5,s=3,e=3,k=0;
		 int[][] mtx=new int[i][j];
		 for(i=0;i<=5;i++){
			 for(j=s;j<=e;j++){
				 k++;
				 mtx[i-1][j-1]=k;
			 }
		 if(i>=3){
			 s++;
			 e--;
		 }else{
			 s--;
			 e++;
		 }
	     }
		 for(i=0;j<5;i++){
			 System.out.printf("%s","\n");
			 for(j=0;j<5;j++){
				 System.out.printf("%d",mtx[i][j]);
			 }
		 }
}
}