import java.io.FileReader;
import java.io.IOException;

import au.com.bytecode.opencsv.CSVReader;

public class EmployeesTest {
	public static void main(String[] args){
		try{
			FileReader fReader = new FileReader("dati.csv");  
			CSVReader reader = new CSVReader(fReader);
			String[] lineInArray;
		    while ((lineInArray = reader.readNext()) != null) System.out.println(lineInArray[0] + " " + lineInArray[1]);
		    reader.close();
		  	}
		catch(Exception e) {System.out.println(e);}
	}
}