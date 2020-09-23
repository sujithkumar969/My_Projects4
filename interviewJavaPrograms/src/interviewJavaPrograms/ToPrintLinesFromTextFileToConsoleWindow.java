package interviewJavaPrograms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ToPrintLinesFromTextFileToConsoleWindow {

		public static void main(String[] args)
		{
			
		//FilePath
		String sFilePath = "E:\\Documents\\TestFile.txt";
		//Creating FileReader object
		FileReader fr = null;
		//Creating BufferedReader object
		BufferedReader txtReader = null;
		//Handling Exception using Try-Catch
		
		try
		{
		String sCurrentLine;
		fr = new FileReader(sFilePath);
		txtReader = new BufferedReader(fr);
		//Reading file until file is null
		while ((sCurrentLine = txtReader.readLine()) != null) {
		System.out.println(sCurrentLine);
		}
		}
		catch (IOException e) {
		e.printStackTrace();
		}
		finally {
		try {
		if (txtReader != null)
			txtReader.close();
		} catch (IOException ex) 
		{
		ex.printStackTrace();
		}
		
	}
		}
}
