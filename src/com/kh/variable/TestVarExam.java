package com.kh.variable;

public class TestVarExam {
	public static void main(String[] args) {
		// 자료형별 변수를 만들고 -> int num, char moonja,boolean result
		// 초기화 한 후->num=i; moonja ='A'; result=false
		// 그 값 출력->System.out.println();
		int num = 100;
		long lNum = 9990000000l;
		float fNum = 486.520f;
		double dNum = 567.89123;
		char cNum = 'A';
		String sNum = "Hello World";
		boolean result = false;

		System.out.println("정수 값 : " + num);// 변수 사용
		System.out.println("정수의 값(9999억) : " + lNum);
		System.out.println("실수의 값 : " + fNum);
		System.out.println("소수의 값 : " + dNum);
		System.out.println("문자의 값 : " + cNum);
		System.out.println("문자열의 값 : " + sNum);
		System.out.println("논리의 값 : "+result);
		
		System.out.println(1+1);
		System.out.println(1.1+1.1);
		System.out.println('1'+'1'); //문자+문자 = 숫자로 변환(아스키 코드표)
		System.out.println("1"+"1");
		
		System.out.println(10+(20+"Hello"));
		
		
		

	}

}
