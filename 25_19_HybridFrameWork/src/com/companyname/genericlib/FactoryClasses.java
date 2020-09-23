package com.companyname.genericlib;

import org.testng.annotations.Factory;

import com.companyname.scripts.FactoryTest;
import com.companyname.scripts.Login;

public class FactoryClasses {
	
	@Factory   
	public Object[] testClassObjects() {
		Object[] data = new Object[0];
		data[0] = new FactoryTest("admin","$Uj!th1&Kum@r$");
		return data;
	}

}