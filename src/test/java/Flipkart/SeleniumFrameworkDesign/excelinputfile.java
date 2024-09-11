package Flipkart.SeleniumFrameworkDesign;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelinputfile {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file= new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\excel file\\inputdata.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("sheet1");
		
		int totalrow=sheet.getLastRowNum();
		int cell= sheet.getRow(1).getLastCellNum();
		
		for(int i=0;i<=totalrow;i++) {
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<cell;j++) {
				XSSFCell cell1=sheet.getRow(i).getCell(j);
				System.out.print(cell1.toString()   +"\t");
			}
			
		}
	System.out.println(" ");
	
	workbook.close();
	file.close();
	}

}
