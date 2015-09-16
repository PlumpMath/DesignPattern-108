package com.demo.computer.amd;

import com.demo.computer.ComputerFactocy;
import com.demo.computer.Computer;
import com.demo.computer.Cpu;
import com.demo.computer.Mainboard;

public class AmdComputerFactocy implements ComputerFactocy {

	@Override
	public Computer createComputer() {
		Cpu amdCpu = createCpu();
		Mainboard amdMainboard = createMainboard();
		Computer amdComputer = new AmdComputer(amdCpu, amdMainboard);
		return amdComputer;
	}

	@Override
	public Cpu createCpu() {
		return new AmdCpu();
	}

	@Override
	public Mainboard createMainboard() {
		return new AmdMainboard();
	}

}
