package io4;

public class Ex1 {

	public static void main(String[] args) throws Exception{
		//클래스명이기때문에 대소문자를 꼭 가려야함.
		String name = "io4.AJob";
		//클래스를 불러오는 코드
		//jdbc는 이렇게 불러온다
		Class clz = Class.forName(name);
		
		System.out.println(clz);
		
		//0번째의 클래스를 불러온다.
		Job obj = (Job)(clz.getConstructors()[0].newInstance(null));
		
		System.out.println(obj);
		
		obj.doJob();
	}
}
