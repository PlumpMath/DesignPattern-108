package com.demo.computer.intel;

import com.demo.computer.AbstractComputer;
import com.demo.computer.Cpu;
import com.demo.computer.Mainboard;

class IntelComputer extends AbstractComputer {

	protected IntelComputer(Cpu cpu, Mainboard mainboard) {
		super(cpu, mainboard);
	}

	@Override
	public void start() {
		// ...
	}

}
