package com.hanbit.matrix;

public class ArrayDemo {
public static void main(String[] args) {
	/*String[]a={"father","mon","son","daughter"}; (여기서 String 경우는 {}의 안에는 문자가 들어가고,int 경우는 숫자)
	  결론은 Array는 
	for(int i=0;i<a.length;i++){
		System.out.printf("%d\t",a[i]);
	}*/
	int[]a={105,136,54,71,9};
	/*System.out.printf("array length:%d\n",a.length); Array의 갯수 (length:길이)
	System.out.printf("array 3번째 값:%d\n",a[2]);*/
	/*for(int i=0;i<5;i++){ 여기서 i<5에서 5를 a.length를 기입해주는데 이것은 algebra(대수학)이라고 한다.
		System.out.printf("%d\t",a[i]);
	}*/
	for(int i=0;i<a.length;i++){
		System.out.printf("%d\t",a[i]);
	}
}
}
