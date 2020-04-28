package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		String name = criteria.getGroupSearchName();
		if(name.equals("Oven") || name.equals("Laptop") || name.equals("TabletPC") || name.equals("Speakers") || name.equals("VacuumCleaner") || name.equals("Refrigerator")) {
			return true;
		}else {
			System.out.println("Вы ввели не корректное имя группы товаров");
			return false;
		}
	}

}

