package com.hanbit.loop_while;

public class PrintHelloWorld10Times {
	public static void main(String[] args) {
		int count =0;
		while(true){
			count++;
			System.out.printf("%s\n","Hello World");
			if(count==10){break;}
		}
	}
}
