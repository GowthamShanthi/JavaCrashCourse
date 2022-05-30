package dataProviderTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UsingApachePoi {
	
	String columnvalues;
	
	public void readExceldata1() throws IOException {
		
		
		
		FileInputStream fileloc = new FileInputStream("C:\\Users\\V GOWTHAM\\Desktop\\Softwares\\testdata.xlsx");
		Workbook wrkbk = new XSSFWorkbook(fileloc);
		Sheet gowsheet = wrkbk.getSheetAt(0);
		 
		Iterator<Row> rowiterator =  	gowsheet.iterator();
		while (rowiterator.hasNext()) {
			
		 Row rowvalues = 	rowiterator.next();
		 
		 Iterator<Cell> columniterator = rowvalues.iterator();
		 
		 while (columniterator.hasNext()) {
			 
		  columnvalues = columniterator.next().getStringCellValue();
		
		
		
		 
			
		}
		 System.out.println(columnvalues);
		 
			
		}
		


		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		UsingApachePoi example1 = new UsingApachePoi();
		example1.readExceldata1();
		
	}
	

}
