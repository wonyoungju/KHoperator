package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[]args) {
		//입력받은 것 중에서 정수를 입력 받았습니다.
		//실수,문자,문자열
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요:");
		int iNum = sc.nextInt();
		
		System.out.print("실수를 입력해 주세요:");
		double dNum = sc.nextDouble();
		
		System.out.print("문자열을 입력해 주세요:");
		String Str = sc.next(); //nextLine()문자열 받는데 차이<공백을 받음>
		//next는 공백을 안받음
		
		System.out.print("문자를 입력해 주세요:");
		char Ch = sc.next().charAt(1);//nexttChar()없다.
		//charAt(0)숫자 자리수 1개만 출력
		
		System.out.println(iNum);
		System.out.println(dNum);
		System.out.println(Str);
		System.out.println(Ch);
	}

}
