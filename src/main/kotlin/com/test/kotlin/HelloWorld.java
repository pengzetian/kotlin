package com.test.kotlin;

/**
 * Created by Intellij IDEA
 * Author: xionggao
 * Desc:
 * Date: 2017/9/30
 * Email: xionggao@terminus.io
 */
public class HelloWorld {
	public static void main(String ... args) {
		System.out.println("hello world");
		
		Student student = new Student(2, "xionggao");
		System.out.println("student= " + student);
	}
	
	
}
