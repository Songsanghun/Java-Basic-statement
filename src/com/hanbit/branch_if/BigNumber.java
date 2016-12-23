package com.hanbit.branch_if;
/*
 Class14(3) on Wed, WhatisBigNumAmong3Numbers.java
-------------------------------------------------------------------------
import java.util.Scanner;
public class BigNumber {
public static void main(String[] args) {
Scanner scan = new Scanner(System. in);
System. out.println( "A 값을 입력하세요." );
int a = scan.nextInt();
System. out.println( "B 값을 입력하세요" );
int b = scan.nextInt();
System. out.println( "C 값을 입력하세요" );
int c = scan.nextInt();
// 가장 큰 값부터 작은 순으로 나열하는 statement 를 완성하시오
// 예를 들어, a=4, b=7, c=1 을 입력했다면.. 7,4,1 이 되겠습니다

}
} 
 * */
import java.util.Scanner;
public class BigNumber {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System. in);
	int a=0, b=0, c=0;
	int n1=0,n2=0 ,n3=0;
	System. out.println( "A 값을 입력하세요." );
	 a = scan.nextInt();
	System. out.println( "B 값을 입력하세요" );
	 b = scan.nextInt();
	System. out.println( "C 값을 입력하세요" );
	 c = scan.nextInt();
	
	if(a>b&&a>c){
		n1=a;
		if(b>c){
			n2=b;
			n3=c;
			//System.out.println(a+","+b+","+c);
		}else{
			n2=c;
			n3=b;
			//System.out.println(a+","+c+","+b);
					}
	}else if(b>a&&b>c){
		n1=b;
		if(a>c){
			n2=a;
			n3=c;
			//System.out.println(b+","+a+","+c);
		}else{
			n2=c;
			n3=a;
			//System.out.println(b+","+c+","+a);
		}		
	}else{
		n1=c;
		if(a>b){
			n2=a;
			n3=b;
			//System.out.println(c+","+a+","+b);
		}else{
			n2=b;
			n3=a;
			//System.out.println(c+","+b+","+a);
		}
		System.out.println(n1+","+n2+","+n3);
	}
}
}