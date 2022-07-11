package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하세요 : ");
		int input = sc.nextInt();
		System.out.print("2번째값을 입력하세요 : ");
		int input1= sc.nextInt();
		String result;
		result = input % 2 == 0? "짝수" : "홀수";
		System.out.println(result);
	
		System.out.println("숫자:"+input1);
		
		int sum = input+input1;
		System.out.println("두 값의 합은"+sum+"입니다.");
//		sc.close();
	}

}
