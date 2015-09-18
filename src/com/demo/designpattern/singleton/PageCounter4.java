package com.demo.designpattern.singleton;

public class PageCounter4 {

	private static PageCounter4 instance;

	private PageCounter4() {

	}

	public static PageCounter4 getInstance() {
		if (instance == null) {
			synchronized (PageCounter4.class) {
				if (instance == null) {
					instance = new PageCounter4();
				}
			}
		}

		return instance;
	}

}
