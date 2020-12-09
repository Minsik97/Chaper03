package com.javaex.ex06;

public class StringApp {

	public static void main(String[] args) {
		
		
		String str = new String("안녕하세요");
		System.out.println(str); //println 은 주소값을 파라미터로 사용하면 toString을 실행한다.
		
		String str01 = "안녕!!"; //표현식2
		System.out.println(str01);
		
		String s01 = new String("하이");
		String s02 = new String("하이");
		
		System.out.println(s01 == s02);
		System.out.println(s01.hashCode() == s02.hashCode()); // hashCode값이 같다.
		
		if(s01 == s02) {
			//주소값이 같은 경우
		}
		
		if(s01.equals("하이")) { //널포인트가 되는 경우가 발생
			//문자열이 같은 경우
		}
		
		if("하이".equals(s01)) { //널포인트가 발생하지 않음
			//문자열이 같은 경우
		}
		
		
		System.out.println("특이케이스=================");
		
		String s03 = "hello";
		String s04 = "hello"; //같은 내용을 찾아서 기존것을 사용한다.
		
		System.out.println(s03 == s04); //같은 주소를 가르킨다.
		System.out.println(s03.hashCode() == s04.hashCode());
		
		
		s03 = "hello!!!!!!!!"; //약식으로 썼을 때 글자를 변경하면 메모리를 새로 만든다.
		
		System.out.println(s03);
		System.out.println(s04); //이상함
		
		System.out.println(s03 == s04); // 주소값이 다른걸로 확인 
		
		
		
		
	}

}
