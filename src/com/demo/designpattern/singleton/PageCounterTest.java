package com.demo.designpattern.singleton;

public class PageCounterTest {

	public static void main(String[] args) {
//		PageCounter1 pageCounter1 = new PageCounter1();

		PageCounter1 pageCounter1 = PageCounter1.getInstance();
		PageCounter2 pageCounter2 = PageCounter2.getInstance();
		PageCounter3 pageCounter3 = PageCounter3.getInstance();
		PageCounter4 pageCounter4 = PageCounter4.getInstance();

		PageCounter pageCounter = PageCounter.getInstance();
		pageCounter.add();
		long count = pageCounter.get();
		
		// ...
	}

}
