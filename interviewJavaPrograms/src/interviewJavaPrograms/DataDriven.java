package interviewJavaPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven {
	
	static String str;
	
	public static void main (String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
			
        FileInputStream fis = new FileInputStream("E:\\Documents\\ManageTyre.xls");	
        Workbook wb = WorkbookFactory.create(fis);
        org.apache.poi.ss.usermodel.Sheet s = wb.getSheet("Sheet2");
        
        int lastRowNum = s.getLastRowNum();
        
        for (int i = 0; i <= lastRowNum; i++) {
        	
        	int lastColumnNum = s.getRow(i).getLastCellNum();
        	
        	for (int j = 1; j <= lastColumnNum; j++) {
        		
				
        		try {
        		String str = s.getRow(i).getCell(j).toString();
        		}
        		catch (NullPointerException e) {
					System.out.println("no data");
				}
        		System.out.println("data is "+str);
			}
			
		}

	}


}