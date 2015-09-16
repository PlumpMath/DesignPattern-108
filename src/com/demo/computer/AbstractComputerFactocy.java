package com.demo.computer;

public abstract class AbstractComputerFactocy implements ComputerFactocy {

	@Override
	public Computer createComputer() {
		
		Cpu cpu = createCpu();
		Mainboard mainboard = createMainboard();

		return null;
	}

}
