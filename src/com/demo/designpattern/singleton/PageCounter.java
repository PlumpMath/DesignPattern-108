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
		count = count + 1;
		return count;
	}

	public long add(long number) {
		synchronized (PageCounter.class) {
			count = count + number;
		}

		return count;
	}

	public long get() {
		return count;
	}

}
