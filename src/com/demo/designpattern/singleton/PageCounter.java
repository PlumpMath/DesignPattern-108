package com.demo.designpattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class PageCounter {

	private static final PageCounter instance = new PageCounter();

	private AtomicLong counter = new AtomicLong(0);

	private PageCounter() {

	}

	public static PageCounter getInstance() {
		return instance;
	}

	public long add() {
		return counter.addAndGet(1);
	}

	public long get() {
		return counter.get();
	}

}
