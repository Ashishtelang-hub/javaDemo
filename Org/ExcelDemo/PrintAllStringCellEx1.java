package Org.ExcelDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllStringCellEx1 {

	private static final int Row = 0;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Programe Start***");
		FileInputStream files = new FileInputStream("F:\\Selenium Self Notes\\ExcelSheet Programe\\Ex1Demo.xlsx");
		Workbook wb = WorkbookFactory.create(files);
		
		Sheet s1 =  wb.getSheet("AllStringType");
		int lastRowNum = s1.getLastRowNum(); // This method give 1-rows
//		System.out.println("lastRowNum : " + lastRowNum);
		
//		
     	//Row r1 = s1.getRow(1); //Row 2
    	//int lastCellNum = r1.getLastCellNum();
     	//System.out.println("lastCellNum : " + lastCellNum);
//		
		
		//Cell c1 = r1.getCell(0);
		//System.out.println("R2,C1 :"+ r1.getCell(0).getStringCellValue());
		
//		for(int i=0; i<lastCellNum; i++) {                              // For perticular row
//			System.out.println(r1.getCell(i).getStringCellValue());
//		}
		for(int k=0; k<lastRowNum+1; k++) {
			Row r1 = s1.getRow(k);
			for(int i=0 ; i<r1.getLastCellNum(); i++) {
				System.out.println(r1.getCell(i).getStringCellValue());
		}
		System.out.println();
		}
		
		System.out.println("*** End Programe ***");


	}
 public ArrayList<String> getAllStringCellValues(String fileName ,String sheetName) {
       ArrayList<String>  ar= new ArrayList<String>();
	try {
		FileInputStream files = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(files);	
		Sheet s1 =  wb.getSheet(sheetName);
		int lastRowNum = s1.getLastRowNum();
		for(int k=0; k<lastRowNum+1; k++) {
			Row r1 = s1.getRow(k);
			for(int i=0 ; i<r1.getLastCellNum(); i++) {
				ar.add(r1.getCell(i).getStringCellValue());
				
		}
		
		}

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return ar;
 }
 public ArrayList<String> getAllStringCellValuesForRow(String fileName ,String sheetName, int rowNum) {
     ArrayList<String>  ar= new ArrayList<String>();
	try {
		FileInputStream files = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(files);	
		Sheet s1 =  wb.getSheet(sheetName);
		int lastRowNum = s1.getLastRowNum();	
			Row r1 = s1.getRow(rowNum);
			for(int i=0 ; i<r1.getLastCellNum(); i++) {
				ar.add(r1.getCell(i).getStringCellValue());		
		}
	} catch (IOException e) {	
		e.printStackTrace();
	}
		return ar;
}
 public String getAllStringCellValues(String fileName ,String sheetName, int rowNum, int cellNum) {
  String value = " ";
	try {
		FileInputStream files = new FileInputStream(fileName);
		Workbook wb = WorkbookFactory.create(files);	
		//Sheet s1 =  wb.getSheet(sheetName);
		//int lastRowNum = s1.getLastRowNum();	
			//Row r1 = s1.getRow(rowNum);	
			//	value = (s1.getRow(rowNum).getCell(cellNum).getStringCellValue());
		//		 OR
				value = (wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue());
		
	} catch (IOException e) {	
		e.printStackTrace();
	}
		return value;
}
}
