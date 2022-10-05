package com.cogent;

import java.util.Comparator;
import java.util.NavigableMap;

public class EmpnoComparator implements Comparator<Employee2>{

	public int compare(Employee2 o1, Employee2 o2) {
		if(o1.getEmpNo()==o2.getEmpNo())
		return 0;
		else if(o1.getEmpNo()>o2.getEmpNo())
		return 1;
		else
			return -1;
	}

	/*public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/

}
