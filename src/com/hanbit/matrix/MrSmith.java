package com.hanbit.matrix;

public class MrSmith {
	public static void main(String[] args) {
		String[][] name={
				{"Good Morning. ","Good Afternoon. ","Good Evening. ","Good bye. "},
				{"Mr.","Mrs.","Miss"},
				{"Smith","Alex","Johnson"}};
		String people="";
		people=name[0][2];
		people+=name[1][0];
		people+=name[2][0];
		System.out.printf("Hello, %s",people);
		}
	}
