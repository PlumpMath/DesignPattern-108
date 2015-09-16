package com.demo.computer;

public abstract class AbstractComputer implements Computer {

	private Cpu cpu;

	private Mainboard mainboard;

	protected AbstractComputer(Cpu cpu, Mainboard mainboard) {
		super();
		this.cpu = cpu;
		this.mainboard = mainboard;
	}

	protected Cpu getCpu() {
		return cpu;
	}

	protected void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	protected Mainboard getMainboard() {
		return mainboard;
	}

	protected void setMainboard(Mainboard mainboard) {
		this.mainboard = mainboard;
	}

}
