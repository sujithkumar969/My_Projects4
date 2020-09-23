package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// sort by one column //
class Student {

	int roll;
	String name, city;
	
	public Student(int roll, String name, String city) {
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	
	public String toString() {
		return roll+", "+name+", "+city;
	}
}

	// sort by roll number - ascending order //
	class MyComparator implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {	
			return s1.roll - s2.roll;                       // s2.roll - s1.roll;  - descending order //
		}
	}
	
	// sort by name - ascending order //
	class MyComparator1 implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {	
			return s1.name.compareTo(s2.name);              // s2.name.compareTo(s1.name); - descending order //
		}
	}
	
	public class SortByOne {
		public static void main(String[] args) {
			
			ArrayList<Student> list = new ArrayList<Student>();
			list.add(new Student(111,"aaa","aizu"));
			list.add(new Student(444,"ddd","bombay"));
			list.add(new Student(555,"ccc","karnataka"));
			list.add(new Student(222,"bbb","chennai"));
			
			System.out.println("Before Sorting");
			for(Student ss : list) {
				System.out.println(ss);
			}
			
			System.out.println("------------------------------------------");
			System.out.println("After Sorting by roll number");
			
			Collections.sort(list, new MyComparator());
			
			for(Student sr : list) {
				System.out.println(sr);
			}
			System.out.println("------------------------------------------");
			System.out.println("After Sorting by name");
			
			Collections.sort(list, new MyComparator1());
			
			for(Student sn : list) {
				System.out.println(sn);
			}
		}
	}