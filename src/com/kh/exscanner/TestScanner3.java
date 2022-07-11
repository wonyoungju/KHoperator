package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner3 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("이름을 입려하세요:");
		String Str = sc.next();
		System.out.print("태어난 월을 입력하세요:");
		int month = sc.nextInt();
		System.out.print("키를 입력하세요:");
		int num  = sc.nextInt();
		System.out.print("성별을 입력하새요:");
		char ch =sc.next().charAt(0);
		System.out.print("주소를 입력해주세요:");
		sc.nextLine();//엔터를 공백으로 받아들여서 넘어감=>한번 더 써서 받아줌
		String adress = sc.nextLine();//공백을 입력받음
				
		System.out.println("이름은"+Str+"입니다.");
		System.out.println("태어난 월은"+month+"입니다");
		System.out.println("키는"+num+"입니다");
		System.out.println("성별은"+ch+"입니다");
		System.out.println("주소는"+adress+"입니다");
		
				
	
	}
}
