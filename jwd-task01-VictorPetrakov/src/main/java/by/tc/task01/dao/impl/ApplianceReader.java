package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.tc.task01.entity.criteria.Criteria;

public class ApplianceReader {

	private Criteria criteria;

	public ApplianceReader(Criteria criteria) {
		this.criteria = criteria;
	}

	public List<String> find() throws FileNotFoundException, IOException {

		List<String> finalApplianceData = new ArrayList<String>();
		
		List<String[]> dataList = new ArrayList<>();
		
		Path fileName = Paths.get("resources/appliances_db.txt");
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName.toFile()))){
		
			while (reader.ready()) {
				dataList.add(reader.readLine().split(";"));
			}
		}
		
		for (String[] str : dataList) {
			for (String str1 : str) {
				str1.replaceAll(",", "");
				if (criteriaMatcher(str1)) {
					finalApplianceData.add(str1);
				}
			}
		}

		return finalApplianceData;
	}

	private boolean criteriaMatcher(String data) {
		List<String> listCriteria = new ArrayList<String>();

		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			listCriteria.add(entry.getKey() + "=" + entry.getValue());
		}

		boolean stringMatch = true;
		for (String str : listCriteria) {

			if (data.contains(str)) {
				stringMatch = stringMatch && true;
			} else {
				stringMatch = stringMatch && false;
			}
		}

		if (stringMatch == true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((criteria == null) ? 0 : criteria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplianceReader other = (ApplianceReader) obj;
		if (criteria == null) {
			if (other.criteria != null)
				return false;
		} else if (!criteria.equals(other.criteria))
			return false;
		return true;
	}

}
