package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int input = sc.nextInt();
		System.out.print("2��°���� �Է��ϼ��� : ");
		int input1= sc.nextInt();
		String result;
		result = input % 2 == 0? "¦��" : "Ȧ��";
		System.out.println(result);
	
		System.out.println("����:"+input1);
		
		int sum = input+input1;
		System.out.println("�� ���� ����"+sum+"�Դϴ�.");
//		sc.close();
	}

}
