package by.tc.task01.dao.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.ApplianceCreator;
import by.tc.task01.entity.criteria.ApplianceReader;
import by.tc.task01.entity.criteria.Criteria;


public class ApplianceDAOImpl implements ApplianceDAO{
	
	//@Override
	public List<Appliance> find(Criteria criteria) {
		List<String> applianceData = null;
		ApplianceReader reader = new ApplianceReader(criteria);
		
		
		try {
			applianceData = reader.find();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ApplianceCreator create = new ApplianceCreator();
		
		List<Appliance> listAppliance = new ArrayList<Appliance>();
		
		listAppliance = create.create(applianceData);
		
		return listAppliance;
	}
	
}


