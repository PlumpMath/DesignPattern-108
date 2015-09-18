package com.demo.designpattern.singleton;

public class PageCounter {

	private static final PageCounter instance = new PageCounter();

	private long count = 0L;

	private PageCounter() {

	}

	public static PageCounter getInstance() {
		return instance;
	}

	public synchronized long add() {
		return count = count + 1;
	}

	public long get() {
		return count;
	}

}
