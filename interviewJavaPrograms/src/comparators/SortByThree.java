package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class EmployeeData11{
	
	String empName;
	double empSalary;
	Integer empRoll;
	
// constructor for initializing global variables //	
	EmployeeData11(Integer empRoll, String empName, double empSalary)
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

class Mycomparator11 implements Comparator<EmployeeData11> {

	@Override
	public int compare(EmployeeData11 e1, EmployeeData11 e2) {
		
		int rollNo = e1.getEmpRoll().compareTo(e2.getEmpRoll());
		int name = e1.getEmpName().compareTo(e2.getEmpName());
		int salary = e1.getEmpSalary().compareTo(e2.getEmpSalary());
		
		if (rollNo == 0) {
			
			if(name == 0) {
				return ((salary == 0)?  name:salary);
			}
			else {
				return name;
			}
		}
		else
		{
			return rollNo;
		}
	}
}

public class SortByThree {

	public static void main(String[] args) {
		
		ArrayList<EmployeeData11> list = new ArrayList<EmployeeData11>();
		list.add(new EmployeeData11(0001, "sujith", 22000.00));
		list.add(new EmployeeData11(0004, "bhatta", 70000.00));
		list.add(new EmployeeData11(0002, "shreyas", 35000.00));
		list.add(new EmployeeData11(0003, "anil", 10000.00));
		list.add(new EmployeeData11(0003, "anil", 50000.00));
		list.add(new EmployeeData11(0003, "anil", 40000.00));
		list.add(new EmployeeData11(0003, "banu", 50000.00));
		list.add(new EmployeeData11(0003, "charan", 60000.00));
		list.add(new EmployeeData11(0005, "zebra", 40000.00));
		list.add(new EmployeeData11(0005, "anilk", 10000.00));
		list.add(new EmployeeData11(0005, "anilk", 20000.00));
		list.add(new EmployeeData11(0005, "anilk", 30000.00));
		
		Iterator<EmployeeData11> itr = list.iterator();
		
		System.out.println("before sorting:- ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------------------------------------------");
		
		Collections.sort(list, new Mycomparator11());
		
		System.out.println("after sorting:- ");
		for(EmployeeData11 ed : list) {
			System.out.println(ed);
		}
	}
}
