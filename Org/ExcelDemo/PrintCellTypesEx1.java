package Org.ExcelDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintCellTypesEx1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Programe Start***");
		FileInputStream files = new FileInputStream("F:\\Selenium Self Notes\\ExcelSheet Programe\\Ex1Demo.xlsx");
		Workbook wb = WorkbookFactory.create(files);
		
		Sheet s1 =  wb.getSheet("TestData");
		int lastRowNum = s1.getLastRowNum(); // This method give 1-rows
          for(int k=0; k<lastRowNum; k++) {
			Row r1 = s1.getRow(k);
			for(int i=0 ; i<r1.getLastCellNum(); i++) {
				CellType ct = r1.getCell(i).getCellType();
			//	System.out.println(ct);
			//	System.out.println(r1.getCell(i).getCellType());
				switch(ct) {
				case STRING : System.out.println(r1.getCell(i).getStringCellValue());
				break;
				case NUMERIC : System.out.println(r1.getCell(i).getNumericCellValue());
				break;
				case BOOLEAN : System.out.println(r1.getCell(i).getBooleanCellValue());
				break;
				case FORMULA : System.out.println(r1.getCell(i).getCellFormula());
				break;
			
				default : System.out.println("Invalid Data");
				}
		}
		System.out.println();
		}	
		System.out.println("*** End Programe ***");


	}
}
