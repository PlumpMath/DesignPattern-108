package com.demo.designpattern.singleton;

import java.util.concurrent.atomic.AtomicLong;

public class PageCounter1 {

	private static final PageCounter1 instance = new PageCounter1();

	private AtomicLong counter = new AtomicLong(0);

	private PageCounter1() {

	}

	public static PageCounter1 getInstance() {
		return instance;
	}

	public long add() {
		return counter.addAndGet(1);
	}

	public long get() {
		return counter.get();
	}

}
