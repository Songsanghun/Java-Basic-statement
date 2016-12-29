package com.hanbit.matrix;
/*
[0,0][0,1][0,2][0,3][0,4]
[1,0][1,1][1,2][1,3][1,4]
[2,0][2,1][2,2][2,3][2,4]
[3,0][3,1][3,2][3,3][3,4]
[4,0][4,1][4,2][4,3][4,4]
*/
public class GogudanDemo {
	public static void main(String[] args) {
		// i * j = i*j
		int[][] mtx= new int[10][10];
		int i=0,j=0;
		for(i=1;i<mtx.length;i++){
			
			System.out.println("");
			for(j=2;j<mtx[i].length;j++){
				
				System.out.printf("%dX%d=%d\t",i,j,i*j);
			}
		}
        }
}
