package com.demo.designpattern.singleton;

public class PageCounter2 {

	private static PageCounter2 instance;

	private PageCounter2() {

	}

	public static synchronized PageCounter2 getInstance() {
		if (instance == null) {
			instance = new PageCounter2();
		}

		return instance;
	}

}
