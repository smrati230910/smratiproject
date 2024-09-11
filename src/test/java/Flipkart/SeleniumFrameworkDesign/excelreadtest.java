package Flipkart.SeleniumFrameworkDesign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelreadtest {

	public static void main(String[] args) throws IOException {
	FileInputStream file= new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\excel file\\inputdata.xlsx");
      XSSFWorkbook workbook=new XSSFWorkbook(file);
      
      XSSFSheet sheet=workbook.getSheet("Sheet1");
      int totalrow=sheet.getLastRowNum();
      int totalcol=sheet.getRow(1).getLastCellNum();
      
      System.out.println(totalrow +" "+
      totalcol);

      
	for(int i=0;i<=totalrow;i++) {
		
		XSSFRow row=sheet.getRow(i);
		
		for(int j=0;j<totalcol;j++) {
			
			
		XSSFCell cell=	sheet.getRow(i).getCell(j);
		System.out.print(cell.toString() + "\t");
		
		
			
		}
	
	System.out.println();
	
	}
	workbook.close();
	file.close();
	
	}


}
	
	
