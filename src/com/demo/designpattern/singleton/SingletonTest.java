package com.demo.designpattern.singleton;

public class SingletonTest {

	public static void main(String[] args) {
//		Singleton singleton = new Singleton();
		Singleton singleton = Singleton.getInstance();
		Singleton1 singleton1 = Singleton1.getInstance();
		Singleton2 singleton2 = Singleton2.getInstance();
		Singleton3 singleton3 = Singleton3.getInstance();
		//....
	}

}
