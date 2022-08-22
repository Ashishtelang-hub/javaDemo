package Org.ExcelDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Programe Start***");
		FileInputStream files = new FileInputStream("F:\\Selenium Self Notes\\ExcelSheet Programe\\Ex1Demo.xlsx");
		Workbook wb = WorkbookFactory.create(files);
		int totalSheets = wb.getNumberOfSheets(); // it gives a int values
		System.out.println("Number of sheets " + totalSheets);
//		String sheetName = wb.getSheetName(0);
//		System.out.println("Sheet Name is " + sheetName);
		
		for(int i=0; i<totalSheets; i++) {
			System.out.println("Sheet Name ("+i+")" + wb.getSheetName(i)); // We got all the sheet name
			
		}
        	System.out.println("Index No is " + wb.getSheetIndex("AllStringType"));
		Sheet s1 =  wb.getSheet("AllStringType");
		System.out.println("*** End Programe ***");


	}

}
