package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String[]args) {
		//�Է¹��� �� �߿��� ������ �Է� �޾ҽ��ϴ�.
		//�Ǽ�,����,���ڿ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��� �ּ���:");
		int iNum = sc.nextInt();
		
		System.out.print("�Ǽ��� �Է��� �ּ���:");
		double dNum = sc.nextDouble();
		
		System.out.print("���ڿ��� �Է��� �ּ���:");
		String Str = sc.next(); //nextLine()���ڿ� �޴µ� ����<������ ����>
		//next�� ������ �ȹ���
		
		System.out.print("���ڸ� �Է��� �ּ���:");
		char Ch = sc.next().charAt(1);//nexttChar()����.
		//charAt(0)���� �ڸ��� 1���� ���
		
		System.out.println(iNum);
		System.out.println(dNum);
		System.out.println(Str);
		System.out.println(Ch);
	}

}
