package com.demo.designpattern.singleton;

public class Singleton2 {

	private static Singleton2 singleton;

	private Singleton2() {

	}

	public static Singleton2 getInstance() {
		synchronized (Singleton2.class) {
			if (singleton == null) {
				singleton = new Singleton2();
			}
		}

		return singleton;
	}

}
