package com.hanbit.matrix;

/**
 * @FILE : LottoDraw2.java
 * @DATE : 2016. 12. 28.
 * @AUTHOR: Song Sang Hun
 * @STORY : 로또 중복허용
 */
public class LottoDraw2 {
	public static void main(String[] args) {
		int i = 0;
		int[] balls = new int[6];
		String str = "";
		for (; i < balls.length; i++) {
			balls[i] = (int) (Math.random() * 45 + 1);
			str += (i < 5) ? balls[i] + "," : balls[i];
		}
		System.out.printf("%s\t", "[" + str + "]");
	}
}
