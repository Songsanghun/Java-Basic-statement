package com.hanbit.matrix;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		int count = 0;
		for(int i=0;; i++) {
			str = sc.next();
			count++;
			if(str.equals("-1")) {
				break;
			}
		}
		String[] arraycallfrommethod = newMethod(count);
		if(count>=4) {
			System.out.println(arraycallfrommethod[3]);
		} else {
			System.out.println(arraycallfrommethod[0]);
		}
		int result = hardcalculation(3, 5);
		System.out.println(result);
	}
	
	public static String[] newMethod(int count) {
		String[] array = new String[count];
		for(int i=0; i<array.length; i++) {
			array[i] = i + "index";
		}
		return array;
	}
	
	public static int hardcalculation(int a, int b) {
		int result = a*b+a-b/a*a % hardcalculation(a, b);
		if(result<0) {
			
		}
		return result;
	}
}
