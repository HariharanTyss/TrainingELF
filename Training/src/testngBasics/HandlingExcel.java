package testngBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcel {

	public static void main(String[] args) throws Exception 
	{
		//readexcel();
		//readmultiple("login");
		 readexe();
		
	}

	public static String[][] readmultiple(String sht) throws EncryptedDocumentException, IOException 
	{
		File file=new File("./testdata/testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(sht);
		
		int count_rw=sheet.getPhysicalNumberOfRows();
		int count_clm=sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("row :"+count_rw);
		System.out.println("colm"+count_clm);
		
		//to create 2D array
		String[][] data=new String[count_rw-1][count_clm];
		
		//To enter data in 2D array from Excel
		for (int i = 1; i < count_rw; i++) //<--Row iteration
		{
			for (int j = 0; j < count_clm; j++)//<--Column iteration
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}

		//To print data in 2D array
		for (int i = 0; i < count_rw-1; i++) //<--Row iteration
		{
			for (int j = 0; j < count_clm; j++)//<--Column iteration
			{
				System.out.println(data[i][j]);
			}
		}
		return data;
	}
		

	public static void readexcel() throws EncryptedDocumentException, IOException 
	{
		File file=new File("./testdata/testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("login");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		System.out.println(cell.toString());
	}
	public static void numericReturn() throws EncryptedDocumentException, IOException 
	{
		File file=new File("./testdata/testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		//Sheet sheet=wb.getSheet(sheetname);
		
	}
	public static void readexe() throws Exception 
	{
		FileInputStream fis=new FileInputStream("./testdata/testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int count = wb.getSheet("login").getLastRowNum();
		int row=wb.getSheet("login").getPhysicalNumberOfRows();
		int colum=wb.getSheet("login").getRow(0).getPhysicalNumberOfCells();
		System.out.println("COUNT:"+count);
		System.out.println("row :"+row);
		System.out.println("colm :"+colum);
		
		//to create 2D array
		String[][] data=new String[row-1][colum];
		
		//To enter data in 2D array from Excel
		for (int i = 1; i<row; i++) //<--Row iteration
		{
			for (int j = 0; j < colum; j++)//<--Column iteration
			{
				data[i][j]=wb.getSheet("login").getRow(i).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}

		
		
	}
	
	

}
