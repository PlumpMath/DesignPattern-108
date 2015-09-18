package com.demo.designpattern.singleton;

public class PageCounter1 {

	private static final PageCounter1 instance = new PageCounter1();

	private PageCounter1() {

	}

	public static PageCounter1 getInstance() {
		return instance;
	}

}
