package com.javaex.ex07;

public class WrapperApp {

	public static void main(String[] args) {
		
		Integer n01 = new Integer(23);
		Integer n02 = new Integer(100);
		
		Integer sum = n01+n02;
		System.out.println(sum);
		
		Integer sum2 = new Integer(50) + new Integer(51);
		System.out.println(sum2);
		
		
		int num = 23;
		
		Integer i01 = 23; //박싱
		
		int no = n02; //언박싱
		
		
		//메소드 사용 (Integer 예제)
		//문자열--> 정수로 변경하는 법
		
		int result = i01.parseInt("12345");
		System.out.println(result);
		
		//이상한 점
		//"13579" -->13579 숫자로 변경
		Integer no03  = 11111;  //이렇게 메모리에 올리기 위해 굳이 쓸필요 없음
		int result01 = no03.parseInt("13579");
		
		int result02 = Integer.parseInt("13579"); //이렇게 쓰면 저절로 올라가짐
		
		
		//정수를 문자열로 바꾸는 법
		//12345 --> "12345"
		//방법1
		String result03 = String.valueOf(12345);
		System.out.println(result03);
		//방법2
		String result04 = "" + 12345;  //이렇게 써도 정수가 문자열로 바뀜.
		System.out.println(result04);
		
		

	}

}
