package by.tc.task01.entity;

public class Speakers extends Appliance{
	private String powerConsumption;
	private String numberOfSpeakers;
	private String frequencyRange;
	private String cordLength;
	
	public Speakers() {
		
	}
	
	
	public Speakers(String name, String powerConsumption, String numberOfSpeakers, String frequencyRange, String cordLength) {
		super(name);
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}


	public String getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(String powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public String getNumberOfSpeakers() {
		return numberOfSpeakers;
	}
	public void setNumberOfSpeakers(String numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}
	public String getFrequencyRange() {
		return frequencyRange;
	}
	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}
	public String getCordLength() {
		return cordLength;
	}
	public void setCordLength(String cordLength) {
		this.cordLength = cordLength;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cordLength == null) ? 0 : cordLength.hashCode());
		result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
		result = prime * result + ((numberOfSpeakers == null) ? 0 : numberOfSpeakers.hashCode());
		result = prime * result + ((powerConsumption == null) ? 0 : powerConsumption.hashCode());
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
		Speakers other = (Speakers) obj;
		if (cordLength == null) {
			if (other.cordLength != null)
				return false;
		} else if (!cordLength.equals(other.cordLength))
			return false;
		if (frequencyRange == null) {
			if (other.frequencyRange != null)
				return false;
		} else if (!frequencyRange.equals(other.frequencyRange))
			return false;
		if (numberOfSpeakers == null) {
			if (other.numberOfSpeakers != null)
				return false;
		} else if (!numberOfSpeakers.equals(other.numberOfSpeakers))
			return false;
		if (powerConsumption == null) {
			if (other.powerConsumption != null)
				return false;
		} else if (!powerConsumption.equals(other.powerConsumption))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return getName() + "[powerConsumption=" + powerConsumption + ", numberOfSpeakers=" + numberOfSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}
	
	
}
