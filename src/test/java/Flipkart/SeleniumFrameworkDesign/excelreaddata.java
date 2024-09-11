package Flipkart.SeleniumFrameworkDesign;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class excelreaddata {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\excel file\\inputdata.xlsx");
		//FileInputStream file=new FileInputStream(System.getProperty("user.dir")+ "\\excel file\\inputdata.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);

		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int row= sheet.getLastRowNum();
		
		int col= sheet.getRow(1).getLastCellNum();
		
		System.out.println("total row "+row);
		System.out.println("total column " +col);
		
		for(int i=0;i<=row;i++) {
			
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<col;j++) {
				
				
				XSSFCell currentcol=currentrow.getCell(j);
				System.out.print(currentcol.toString() +"\t");			
				}
		
				System.out.println();
	}
	workbook.close();
	file.close();
}
}
