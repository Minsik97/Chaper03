package com.javaex.ex05;

public class Ractangle {
	// 필드
	private int width;
	private int height;

	// 생성자
	public Ractangle() {
		super();
	}

	public Ractangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	// 메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		return  width + height;
	}

	@Override
	public boolean equals(Object obj) {
		if(this.hashCode() == ((Ractangle)obj).hashCode()) {
			return true;
		}else {
			return false;
		}
		
		
	}

	
	
	
	
	
}
