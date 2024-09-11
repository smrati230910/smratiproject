package Flipkart.SeleniumFrameworkDesign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//excel--workbook---sheet---row----cell--for reading data
		
		FileInputStream file= new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\excel file\\inputdata.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		 int totalrow=sheet.getLastRowNum();
		 int totalcol= sheet.getRow(1).getLastCellNum();
		 
		 System.out.println("total row "+totalrow);
		 System.out.println("total col "+totalcol);
		 
		 for(int row=0;row<=totalrow;row++) {
			 
			XSSFRow row1= sheet.getRow(row);
			
			for(int col=0;col<totalcol;col++) {
				
				XSSFCell col1=	sheet.getRow(row).getCell(col);
				System.out.print(col1.toString() +"\t");
				
				
			}
			 
			 System.out.println();
		 }
		 workbook.close();
		 file.close();
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
