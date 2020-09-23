package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
// Sort by two column //
class EmployeeData{
	
	String empName;
	double empSalary;
	Integer empRoll;
	
// constructor for initializing global variables //	
	EmployeeData(Integer empRoll, String empName, double empSalary)
	{	
		this.empName = empName;
		this.empSalary = empSalary;
		this.empRoll = empRoll;	
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public Double getEmpSalary() {
		return empSalary;
	}
	
	public Integer getEmpRoll() {
		return empRoll;
	}
	
// to print the data members from current class object where we define //
	@Override
	public String toString() {
		return empRoll+", "+empName+", "+empSalary;
	}	
}

class Mycomparator01 implements Comparator<EmployeeData> {

	@Override
	public int compare(EmployeeData e1, EmployeeData e2) {
		
		int rollNo = e1.getEmpRoll().compareTo(e2.getEmpRoll());
		int name = e1.getEmpName().compareTo(e2.getEmpName());
		
		if (rollNo == 0) {
			return ((name == 0)? rollNo:name);
		}
		else
		{
			return rollNo;
		}
	}
}

// Driver class //
public class SortByTwo {

	public static void main(String[] args) {
		
		ArrayList<EmployeeData> list = new ArrayList<EmployeeData>();
		list.add(new EmployeeData(0001, "sujith", 22000.00));
		list.add(new EmployeeData(0004, "bhatta", 30000.00));
		list.add(new EmployeeData(0002, "shreyas", 35000.00));
		list.add(new EmployeeData(0003, "anil", 30000.00));
		list.add(new EmployeeData(0003, "banu", 30000.00));
		list.add(new EmployeeData(0003, "charan", 30000.00));
		list.add(new EmployeeData(0003, "zebra", 30000.00));  
		
		Iterator<EmployeeData> itr = list.iterator();
		
		System.out.println("before sorting:- ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------------------------------");
		
		Collections.sort(list, new Mycomparator01());
		
		System.out.println("after sorting:- ");
		for(EmployeeData ed : list) {
			System.out.println(ed);
		}
	}
}
