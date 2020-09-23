package interviewJavaPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindRowNColumnCountFromDynamicTable {
	
	public static void main(String[] args) {
		
		double a=0;
		int columnCnt=0;
		int rowCnt=0;
		String key = "webdriver.chrome.driver";
		String value = "E:\\automation tool\\Selenium Softwares(new)\\drivers executables\\chromedriver 2.35\\chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		// table id > table  > table header > table row > th     length of columns
		List<WebElement> dynamicColumnCnt = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));
		columnCnt=dynamicColumnCnt.size();
		System.out.println("column count is = "+columnCnt);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		// table id > table > table body > tr    length of rows
		List<WebElement> dynamicRowCnt = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
		rowCnt=dynamicRowCnt.size();
		System.out.println("row count is = "+rowCnt);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		// to find all datas present in 4th row
		WebElement fourthRow = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[4]")); 		
		System.out.println(fourthRow.getText());
		System.out.println("---------------------------------------------------------------------------------------------");
		
		// another way to find all datas present in 4th row
		List<WebElement> fourthRow1 = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[4]/td")); 		
		System.out.println("Size of 4th row is  "+fourthRow1.size());
		for(WebElement e:fourthRow1) {
			String td = e.getText();
			System.out.print(td+", ");
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		
		// to find data present in 4th row and 3rd cell
		WebElement fourthRowAndThirdCell = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[4]/td[3]"));		
		System.out.println(fourthRowAndThirdCell.getText());
		System.out.println("---------------------------------------------------------------------------------------------");
		
		// to find maximum value in 4th column
		
		for(int i=1; i<=dynamicRowCnt.size(); i++) {
			String fourthCellData = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+ i +"]/td[4]")).getText();
			double data = Double.parseDouble(fourthCellData);
			if (a < data) {
				a = data;
			}
		}
		System.out.println("maximum value in 4th column is = "+ a);
		System.out.println("---------------------------------------------------------------------------------------------");
		
		// to find all data from every cell in table
		for(int jr=1; jr<=rowCnt; jr++) {
			
			// every row wise cell is counted //
			List<WebElement> c = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+ jr +"]/td"));
			int cCnt = c.size();
			
			for(int jc=1; jc<=cCnt; jc++) {
				
				String cellData = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+ jr +"]/td["+ jc +"]")).getText();
				System.out.println("data at "+ jr + ","+ jc + " = " + cellData);
			}
		}
		System.out.println("---------------------------------------------------------------------------------------------");
		
		// to find data present in last row and last cell 
		List<WebElement> c1 = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+ rowCnt +"]/td"));
		int cCnt1 = c1.size();
		String lastData = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr["+ rowCnt +"]/td[" + cCnt1 + "]")).getText();
		System.out.println("last cell Data is "+ lastData);
	}

}
