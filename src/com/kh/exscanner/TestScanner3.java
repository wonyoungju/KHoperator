package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner3 {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���:");
		String Str = sc.next();
		System.out.print("�¾ ���� �Է��ϼ���:");
		int month = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���:");
		int num  = sc.nextInt();
		System.out.print("������ �Է��ϻ���:");
		char ch =sc.next().charAt(0);
		System.out.print("�ּҸ� �Է����ּ���:");
		sc.nextLine();//���͸� �������� �޾Ƶ鿩�� �Ѿ=>�ѹ� �� �Ἥ �޾���
		String adress = sc.nextLine();//������ �Է¹���
				
		System.out.println("�̸���"+Str+"�Դϴ�.");
		System.out.println("�¾ ����"+month+"�Դϴ�");
		System.out.println("Ű��"+num+"�Դϴ�");
		System.out.println("������"+ch+"�Դϴ�");
		System.out.println("�ּҴ�"+adress+"�Դϴ�");
		
				
	
	}
}
