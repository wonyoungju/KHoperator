package com.kh.variable;

public class TestVarExam {
	public static void main(String[] args) {
		// �ڷ����� ������ ����� -> int num, char moonja,boolean result
		// �ʱ�ȭ �� ��->num=i; moonja ='A'; result=false
		// �� �� ���->System.out.println();
		int num = 100;
		long lNum = 9990000000l;
		float fNum = 486.520f;
		double dNum = 567.89123;
		char cNum = 'A';
		String sNum = "Hello World";
		boolean result = false;

		System.out.println("���� �� : " + num);// ���� ���
		System.out.println("������ ��(9999��) : " + lNum);
		System.out.println("�Ǽ��� �� : " + fNum);
		System.out.println("�Ҽ��� �� : " + dNum);
		System.out.println("������ �� : " + cNum);
		System.out.println("���ڿ��� �� : " + sNum);
		System.out.println("���� �� : "+result);
		
		System.out.println(1+1);
		System.out.println(1.1+1.1);
		System.out.println('1'+'1'); //����+���� = ���ڷ� ��ȯ(�ƽ�Ű �ڵ�ǥ)
		System.out.println("1"+"1");
		
		System.out.println(10+(20+"Hello"));
		
		
		

	}

}
