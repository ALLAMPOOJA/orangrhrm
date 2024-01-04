package datadrentesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{

	public static void main(String[] args) throws IOException
	{
        XSSFWorkbook workbook=null;
		
		//TO ACCESS WORKSHEET WE USE
		
		XSSFSheet worksheet;
		
		//TO ACCESS ROW WE USE
		
		//XSSFRow row;
		
		//TO ACCESS CELL WE USE
		//XSSFCell cell;
		
		// To create an object of file class  to open file
		
		File src=new File("C:\\Users\\dell\\Downloads\\testdata1.xlsx");
		
		//To create an object of fileinputstream to read data from excel file
		
                FileInputStream fis = null;
		try 
		{
			fis=new FileInputStream(src);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//EXCEL--->WORKBOOK---->SHEET---->ROW---->CELL
		
		//CREATE OBJECT XSSFWORKBOOK TO HANDLE EXCEL FILE
		
		workbook=new XSSFWorkbook(fis);
		
		//TO ACCESS WORKBOOK SHEET
		worksheet=workbook.getSheetAt(0);
		
		//TO GET TOTAL NUMBER OF ROW
		
		int lastrow = worksheet.getLastRowNum()+1;
		
		//TO GET TOTAL NUMBER OF CELLS IN ROW
		
		int lastcell = worksheet.getRow(0).getLastCellNum();
		
		for (int currentrow = 0; currentrow < lastrow; currentrow++) 
		{
			for (int currentcell = 0; currentcell <lastcell; currentcell++)
			{
				System.out.print(worksheet.getRow(currentrow).getCell(currentcell).toString());
				
				//for printing in new tab
				
				System.out.print("\t");
				
			}
			//for printing the values in new line
			
			System.out.println();
		}


	}

}
