package com.hanbit.loop_while;

public class SeriesDiffChange {
public static void main(String[] args) {
	int i = 0, d = 1, sum = 1;
	while(true){
		i++;
		d+=i;
		//i=i+d;
		sum+=d;
		//sum=sum+d;
		if(i==19){break;}
		
			}
	System.out.printf("%s\n%s\n%d\n","1+2+4+7+11+...증가하는 수열의 20번째 항까지의 합",
			"================================================",sum);
}
}
