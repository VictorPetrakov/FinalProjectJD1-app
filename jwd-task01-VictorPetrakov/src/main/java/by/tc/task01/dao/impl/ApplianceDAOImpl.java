package by.tc.task01.dao.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	// @Override
	public List<Appliance> find(Criteria criteria) throws DAOException {
		
		List<Appliance> listAppliance = new ArrayList<Appliance>();
		
		List<String> applianceData = new ArrayList<String>();
		
		ApplianceReader reader = new ApplianceReader(criteria);

		try {
			applianceData = reader.find();
		
		}catch(FileNotFoundException e){
			
			throw new DAOException("File not found", e);
			
		}catch(IOException e) {
			
			throw new DAOException("Reader field to close", e);
		}

		ApplianceCreator create = new ApplianceCreator();
		
		listAppliance = create.create(applianceData);

		return listAppliance;
	}

}
