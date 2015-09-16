package com.demo.computer;

public class ComputerStore {

	public Computer createComputer(ComputerFactocy computerFactocy) {
		Cpu cpu = computerFactocy.createCpu();
		Mainboard mainboard = computerFactocy.createMainboard();
		cpu.calculate();
		mainboard.installCpu();

		// ...

		return computerFactocy.createComputer();
	}

}
