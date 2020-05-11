package by.tc.task01.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class ApplianceCreator {

	public List<Appliance> create(List<String> data) {
		
		List<Appliance> appliances = new ArrayList<Appliance>();
		
		for (String d : data) {
			Map<String, String> params = applianceDataParse(d);

			String applianceType = params.get("type").replaceAll("\\s", "");
			
			Appliance appliance = new Appliance();

			switch (applianceType) {
			case "Laptop":
				appliance = createLaptop(params);
				break;
			case "TabletPC":
				appliance = createTabletPC(params);
				break;
			case "Oven":
				appliance = createOven(params);
				break;
			case "Refrigerator":
				appliance = createRefrigerator(params);
				break;
			case "VacuumCleaner":
				appliance = createVacuumCleaner(params);
				break;

			case "Speakers":
				appliance = createSpeakers(params);
				break;
			}
		
			appliances.add(appliance);
		}
		
		return appliances;
	}

	public Map<String, String> applianceDataParse(String singleApplianceData) {

		String data = singleApplianceData;

		String[] data1 = data.split(":");

		String type = data1[0];

		String data2 = data1[1].substring(1);

		String[] dataAppliance = data2.split("\\s");

		Map<String, String> params = new HashMap<>();

		params.put("type", type);

		for (String str : dataAppliance) {
			String[] keyValue = str.split("=");
			params.put(keyValue[0], String.valueOf(keyValue[1]));

		}

		return params;
	}

	public Appliance createLaptop(Map<String, String> params) {

		Appliance laptop = new Laptop(params.get("type"), params.get("BATTERY_CAPACITY"), params.get("OS"), params.get("MEMORY_ROM"),
				params.get("SYSTEM_MEMORY"), params.get("CPU"), params.get("DISPLAY_INCHS"));

		return laptop;
	}

	public Appliance createTabletPC(Map<String, String> params) {

		TabletPC tabletPC = new TabletPC(params.get("type"), params.get("BATTERY_CAPACITY"), params.get("DISPLAY_INCHES"),
				params.get("MEMORY_ROM"), params.get("FLASH_MEMORY_CAPACITY"), params.get("COLOR"));

		return tabletPC;
	}

	public Appliance createOven(Map<String, String> params) {

		Appliance oven = new Oven(params.get("type"), params.get("POWER_CONSUMPTION"), params.get("WEIGHT"), params.get("CAPACITY"),
				params.get("DEPTH"), params.get("HEIGHT"), params.get("WIDTH"));

		return oven;
	}

	public Appliance createRefrigerator(Map<String, String> params) {

		Refrigerator refregerator = new Refrigerator(params.get("type"), params.get("POWER_CONSUMPTION"),
				params.get("WEIGHT"), params.get("FREEZER_CAPACITY"), params.get("OVERALL_CAPACITY"),
				params.get("HEIGHT"), params.get("WIDTH"));

		return refregerator;
	}

	public Appliance createSpeakers(Map<String, String> params) {

		Speakers speakers = new Speakers(params.get("type"), params.get("POWER_CONSUMPTION"), params.get("NUMBER_OF_SPEAKERS"),
				params.get("FREQUENCY_RANGE"), params.get("CORD_LENGTH"));

		return speakers;
	}

	public Appliance createVacuumCleaner(Map<String, String> params) {

		VacuumCleaner vacuumCleaner = new VacuumCleaner(params.get("type"), params.get("POWER_CONSUMPTION"),
				params.get("FILTER_TYPE"), params.get("BAG_TYPE"), params.get("WAND_TYPE"),
				params.get("MOTOR_SPEED_REGULATION"), params.get("CLEANING_WIDTH"));

		return vacuumCleaner;
	}
}
