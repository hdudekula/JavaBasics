package org.hazi.Composition;

public class PC {
	private MotherBoard motherBoard;
	private Monitor monitor;
	private Cpu cpu;
	public PC(MotherBoard motherBoard, Monitor monitor, Cpu cpu) {
		super();
		this.motherBoard = motherBoard;
		this.monitor = monitor;
		this.cpu = cpu;
	}
	public MotherBoard getMotherBoard() {
		return motherBoard;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public Cpu getCpu() {
		return cpu;
	}
	

}
