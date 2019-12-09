package com.bridgelabz.factorydesign;

public abstract class Computer {

	public abstract  String getHDD();
	public abstract  String getRAM();
	public abstract  String getCPU();
	
	
	@Override
	public  String toString() {
		return "RAM = "+this.getRAM()+"GB HDD = "+this.getHDD()+"GB CPU = "+this.getCPU()+"Gz";
	}
	
}
