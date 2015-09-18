package com.demo.designpattern.singleton;

public class PageCounter3 {

	private static PageCounter3 instance;

	private PageCounter3() {

	}

	public static PageCounter3 getInstance() {
		synchronized (PageCounter3.class) {
			if (instance == null) {
				instance = new PageCounter3();
			}
		}

		return instance;
	}

}
