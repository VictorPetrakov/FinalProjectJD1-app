package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.ArrayList;
import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.exception.ServiceException;

public class Main {

	public static void main(String[] args) {
		List<Appliance> applianceList = new ArrayList<Appliance>();

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////
		
		  Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		  criteriaOven.add(Oven.CAPACITY.toString(), 33);
		  try {
			  
			  applianceList = service.find(criteriaOven);
			  
		  } catch (ServiceException e){
			  
			  System.out.println(e.getMessage());
		  }
		  PrintApplianceInfo.print(applianceList);
		  
		  System.out.println();
		  
		  //////////////////////////////////////////////////////////////////
		  
		  criteriaOven = new Criteria(Oven.class.getSimpleName());
		  criteriaOven.add(Oven.DEPTH.toString(), 60);
		  criteriaOven.add(Oven.HEIGHT.toString(), 40);
		  try {
			  
			  applianceList = service.find(criteriaOven);
			  
		  }catch (ServiceException e) {
			  
		  	System.out.println(e.getMessage());
		  }
		  
		  PrintApplianceInfo.print(applianceList);
		  
		  System.out.println();
		 

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);
		try {
			
			applianceList = service.find(criteriaTabletPC);
			
		}catch (ServiceException e){
			
			System.out.println(e.getMessage());
		}
		PrintApplianceInfo.print(applianceList);
		
	}

}
