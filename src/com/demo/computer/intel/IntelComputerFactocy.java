package com.demo.computer.intel;

import com.demo.computer.ComputerFactocy;
import com.demo.computer.Computer;
import com.demo.computer.Cpu;
import com.demo.computer.Mainboard;

public class IntelComputerFactocy implements ComputerFactocy {

	@Override
	public Computer createComputer() {
		Cpu intelCpu = createCpu();
		Mainboard intelMainboard = createMainboard();
		Computer intelComputer = new IntelComputer(intelCpu, intelMainboard);
		return intelComputer;
	}

	@Override
	public Cpu createCpu() {
		return new IntelCpu();
	}

	@Override
	public Mainboard createMainboard() {
		return new IntelMainboard();
	}

}
