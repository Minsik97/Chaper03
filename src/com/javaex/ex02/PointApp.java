package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		
		Point p = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(100,100);
		
		Point p05 = p;
		
		
		//System.out.println(p.toString());
		
		//부모로 Object를 두고 있다.
		//Object  클래스의 메소드 + Point클래스의 메소드를 사용할 수 있다.
		//겹치는 메소드 주의
		
		//테스트 Point클래스의 toString() 지운다.
		System.out.println(p.toString());
		
		//메소드 오버라이딩 (똑같이 작동한다.)
		Object op = new Point();
		System.out.println(op.toString());
		
		//println toString()을 찾아서 실행한다.
		System.out.println(p); //주소의 toString()
		
		
		//getClass()
		System.out.println("getClass()=================");
		System.out.println(p.getClass());
		
		//hashCod() 주소값임
		System.out.println("hashCode()=================");
		System.out.println(p.hashCode());
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		//equals() 같은지 비교
		System.out.println("equals================");
		System.out.println(p.equals(p01));
		//주소값이 다르면 false로 처리
		
		//주소값을 직접 비교할 때 사용
		System.out.println(p==p01);
		System.out.println(p==p05);
		
		
		String str = "안녕";
		if(str == "안녕") {
			
		}
		
		
		
	}

}
