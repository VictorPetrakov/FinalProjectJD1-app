package by.tc.task01.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.exception.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.exception.ServiceException;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService{

	//@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {
	
	List<Appliance> applianceList = new ArrayList<>();
	
	if (!Validator.criteriaValidator(criteria)) {
		applianceList = null;
	}
	
	DAOFactory factory = DAOFactory.getInstance();
	ApplianceDAO applianceDAO = factory.getApplianceDAO();
	
	try {
	    
		applianceList = applianceDAO.find(criteria);
	
	} catch (DAOException e) {
	    
	    throw new ServiceException(e.getMessage(), e);
	}
			
	return applianceList;
}
}


