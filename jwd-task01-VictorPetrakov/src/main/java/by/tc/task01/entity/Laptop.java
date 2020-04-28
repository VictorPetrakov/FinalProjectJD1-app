package by.tc.task01.entity;

public class Laptop extends Appliance{
	private String batteryCapacity;
	private String os;
	private String memoryRom;
	private String systemMemory;
	private String cpu;
	private String displayInch;
	
	public Laptop() {
		
	}
	
	public Laptop(String name, String batteryCapacity, String os, String memoryRom, String systemMemory, String cpu, String displayInch) {
		super(name);
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInch = displayInch;
	}
	
	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getMemoryRom() {
		return memoryRom;
	}
	public void setMemoryRom(String memoryRom) {
		this.memoryRom = memoryRom;
	}
	public String getSystemMemory() {
		return systemMemory;
	}
	public void setSystemMemory(String systemMemory) {
		this.systemMemory = systemMemory;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getDisplayInch() {
		return displayInch;
	}
	public void setDisplayInch(String displayInch) {
		this.displayInch = displayInch;
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((batteryCapacity == null) ? 0 : batteryCapacity.hashCode());
		result = prime * result + ((cpu == null) ? 0 : cpu.hashCode());
		result = prime * result + ((displayInch == null) ? 0 : displayInch.hashCode());
		result = prime * result + ((memoryRom == null) ? 0 : memoryRom.hashCode());
		result = prime * result + ((os == null) ? 0 : os.hashCode());
		result = prime * result + ((systemMemory == null) ? 0 : systemMemory.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (batteryCapacity == null) {
			if (other.batteryCapacity != null)
				return false;
		} else if (!batteryCapacity.equals(other.batteryCapacity))
			return false;
		if (cpu == null) {
			if (other.cpu != null)
				return false;
		} else if (!cpu.equals(other.cpu))
			return false;
		if (displayInch == null) {
			if (other.displayInch != null)
				return false;
		} else if (!displayInch.equals(other.displayInch))
			return false;
		if (memoryRom == null) {
			if (other.memoryRom != null)
				return false;
		} else if (!memoryRom.equals(other.memoryRom))
			return false;
		if (os == null) {
			if (other.os != null)
				return false;
		} else if (!os.equals(other.os))
			return false;
		if (systemMemory == null) {
			if (other.systemMemory != null)
				return false;
		} else if (!systemMemory.equals(other.systemMemory))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.getName() + "[batteryCapacity=" + batteryCapacity + ", os=" + os + ", memoryRom=" + memoryRom
				+ ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInch=" + displayInch + "]";
	}
	
}
