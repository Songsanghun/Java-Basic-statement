package com.hanbit.matrix;
import java.util.Scanner;
public class SumOfArray {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("덧셈하려는 숫자를 입력하세요. 단,5개까지만 가능");
	//int[]arr={1,2,3,4,5};
	int sum=0, i=0;
	String str="";
	int[]arr=new int[5];
/*	arr[0]=s.nextInt();
	arr[1]=s.nextInt();
	arr[2]=s.nextInt();
	arr[3]=s.nextInt();
	arr[4]=s.nextInt();*/
	for(i=0;i<arr.length;i++){
		arr[i]=s.nextInt();
	}
	for(i=0;i<arr.length;i++){
		sum+=arr[i];
		str+=(i<4)?arr[i]+"+":arr[i]+"=";
		/*if(i<4){
			System.out.printf("%d %s",arr[i],"+");
		}else{
			System.out.printf("%d %s",arr[i],"=");
		}*/
		/*String result =(i<4)?arr[i]+a:arr[i]+b;
		System.out.printf(result);
		*/
		//System.out.printf("%s",(i<4)?arr[i]+"+":arr[i]+"=");
	}
	System.out.printf("%s %d",str,sum);
	
}
}
