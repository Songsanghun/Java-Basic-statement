package com.hanbit.matrix;
/*
[0,0][0,1][0,2][0,3][0,4]
[1,0][1,1][1,2][1,3][1,4]
[2,0][2,1][2,2][2,3][2,4]
[3,0][3,1][3,2][3,3][3,4]
[4,0][4,1][4,2][4,3][4,4]
*/
public class MatrixBasic {
       public static void main(String[] args) {
		int[][]mtx=new int[5][5];
		for(int i=0;i<mtx.length;i++){
			System.out.println("");
			for(int j=0;j<mtx[i].length;j++){
				System.out.printf("[%d,%d]",i,j);
			}
		}
	}
}
