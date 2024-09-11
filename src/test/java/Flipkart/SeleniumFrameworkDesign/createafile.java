package Flipkart.SeleniumFrameworkDesign;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class createafile {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file= new FileOutputStream("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\excel file\\outputdata.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook	();
	XSSFSheet sheet=      workbook.createSheet("newSheet");
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter total row");
	int totalrow= sc.nextInt();
	System.out.println("enter total column");
	int clm=sc.nextInt();
	
	
	for(int i=0;i<=totalrow;i++) {
		
		XSSFRow row= sheet.createRow(i);
		for(int j=0;j<clm;j++) {
			XSSFCell cell=row.createCell(j);
			cell.setCellValue(sc.next());
		}
	
	
	}
	workbook.write(file);
	workbook.close();
	file.close();
	
	
	}

}
