package com.demo.designpattern.factory;

import com.demo.computer.Computer;
import com.demo.computer.ComputerStore;
import com.demo.computer.intel.IntelComputerFactocy;

public class ComputerFactocyTest {

	public static void main(String[] args) {
		ComputerStore computerStore = new ComputerStore();
		IntelComputerFactocy intelComputerFactocy = new IntelComputerFactocy();
		Computer computer = computerStore.createComputer(intelComputerFactocy);
	}

}
