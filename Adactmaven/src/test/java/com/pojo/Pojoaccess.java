package com.pojo;

public class Pojoaccess {

	public static void main(String[] args) {
		Pojoprac pojo= new Pojoprac();
		System.out.println(pojo.getvalue());
		System.out.println(pojo.getvalue1());
		pojo.setvalue("dhivya");
		pojo.setvalue1(1234);
		System.out.println(pojo.getvalue());
		System.out.println(pojo.getvalue1());
		

	}

}
