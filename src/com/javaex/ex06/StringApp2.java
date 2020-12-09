package com.javaex.ex06;

public class StringApp2 {

	public static void main(String[] args) {
		//String 메소드
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//concat() 테스트
		System.out.println(a.concat(b)); //문자를 합칠 때 사용.
		System.out.println(a); // a 값은 변하지 않음
		
		
		a = a.concat(b);
		System.out.println(a);
		
		
		//trim()
		a = a.trim(); //앞 뒤 공백을 없애줌
		System.out.println(a);
		System.out.println("__" + a + "--"); //뒤 공백 확인용
		
		a = a.replace("ab", "12"); // 앞에 값을 뒤에 값으로 바꿔라
		System.out.println(a);
		
		System.out.println("====================");
		
		String[] sArr = a.split(","); //"," 값 을 기준으로 나눠라
		
		for(int i = 0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		String str = "Hello java";
		
		String result = str.substring(2); //n번 부터 값을 표현 해라.
		System.out.println(result);
		System.out.println(str);//원본을 바꾸진 않음
		
		
		String result02 = str.substring(3, 7); //3부터 7 전 까지만 나타내라
		System.out.println(result02);
		
		char c = str.charAt(1);
		System.out.println(c);
		
		String c2 = str.substring(1,2);
		System.out.println(c2);
		
		
		
	}

}
