package Org.ExcelDemo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println("*** Programe Start***");
		FileInputStream files = new FileInputStream("F:\\Selenium Self Notes\\ExcelSheet Programe\\Ex1Demo.xlsx");
		Workbook wb = WorkbookFactory.create(files);
		
		Sheet s1 =  wb.getSheet("AllStringType");
		int lastRowNum = s1.getLastRowNum(); // This method give 1-rows
		System.out.println("lastRowNum : " + lastRowNum);
		int physicalRowNum = s1.getPhysicalNumberOfRows(); //
		System.out.println("physicalRowNum : " + physicalRowNum);
		
		Row r1 = s1.getRow(1); //Row 2
		int lastCellNum = r1.getLastCellNum();
		int physcialCellNum = r1.getPhysicalNumberOfCells();
		System.out.println("lastCellNum : " + lastCellNum);
		System.out.println("physcialCellNum : " + physcialCellNum);
		
		System.out.println("*** End Programe ***");


	}

}
