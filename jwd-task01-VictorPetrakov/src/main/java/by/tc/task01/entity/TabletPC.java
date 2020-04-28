package by.tc.task01.entity;

public class TabletPC extends Appliance{
	private String batteryCapacity;
	private String displayInches;
	private String memoryRom;
	private String flashMemoryCapacity;
	private  String color;
	
	public TabletPC() {
		
	}
	
	
	public TabletPC(String name, String batteryCapacity, String displayInches, String memoryRom, String flashMemoryCapacity, String color) {
		super(name);
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}


	public String getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(String batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public String getDisplayInches() {
		return displayInches;
	}
	public void setDisplayInches(String displayInches) {
		this.displayInches = displayInches;
	}
	public String getMemoryRom() {
		return memoryRom;
	}
	public void setMemoryRom(String memoryRom) {
		this.memoryRom = memoryRom;
	}
	public String getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}
	public void setFlashMemoryCapacity(String flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((batteryCapacity == null) ? 0 : batteryCapacity.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((displayInches == null) ? 0 : displayInches.hashCode());
		result = prime * result + ((flashMemoryCapacity == null) ? 0 : flashMemoryCapacity.hashCode());
		result = prime * result + ((memoryRom == null) ? 0 : memoryRom.hashCode());
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
		TabletPC other = (TabletPC) obj;
		if (batteryCapacity == null) {
			if (other.batteryCapacity != null)
				return false;
		} else if (!batteryCapacity.equals(other.batteryCapacity))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (displayInches == null) {
			if (other.displayInches != null)
				return false;
		} else if (!displayInches.equals(other.displayInches))
			return false;
		if (flashMemoryCapacity == null) {
			if (other.flashMemoryCapacity != null)
				return false;
		} else if (!flashMemoryCapacity.equals(other.flashMemoryCapacity))
			return false;
		if (memoryRom == null) {
			if (other.memoryRom != null)
				return false;
		} else if (!memoryRom.equals(other.memoryRom))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return getName() + "[batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRom="
				+ memoryRom + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}
	
	
	
}
