package com.demo.computer.amd;

import com.demo.computer.AbstractComputer;
import com.demo.computer.Cpu;
import com.demo.computer.Mainboard;

class AmdComputer extends AbstractComputer {

	protected AmdComputer(Cpu cpu, Mainboard mainboard) {
		super(cpu, mainboard);
	}

	@Override
	public void start() {
		Mainboard mainboard = getMainboard();
		mainboard.installCpu();
		Cpu cpu = getCpu();
		cpu.calculate();
		// ...
	}

}
