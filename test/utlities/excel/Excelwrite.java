package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.*;

public class Excelwrite {
//*************************** Not a complete code*********************************************************************************
	public List<String> dataread(String testcasename) throws IOException
	{
		List<String> excelvalue = new ArrayList<String>();
		File src=new File("Excelpath"); // Pass the excel path in the argument
		FileOutputStream fis = new FileOutputStream(src);   
		XSSFWorkbook workbook = new XSSFWorkbook(); // Get access to the excel workbook
		int sheetcount=workbook.getNumberOfSheets(); 
		for(int i=0;i<sheetcount;i++)
		{
			if(workbook.getSheetName(sheetcount).equalsIgnoreCase("sheet_name"))
			{
				XSSFSheet worksheet= workbook.getSheetAt(i);    //Get access to the worksheet
				
				//Identify the column by scanning the entire row
				Iterator<Row> rows= worksheet.iterator();
				//int rowcount= worksheet.getLastRowNum();
				 Row rowvalue=rows.next();
				 Iterator<Cell> cellvalue=rowvalue.cellIterator();
				 int  temp=0;
				 int column = 0;
				 while(cellvalue.hasNext())
				 {
					 Cell value=cellvalue.next();
					 if(value.getStringCellValue().equalsIgnoreCase("Status"))  // Passing the required column name from excel
						 column=temp;
				 }
				 temp++;

				//Once column is identified then scan entire row for the corresponding testcase
				while(rows.hasNext())
				{
					Row rvalue= rows.next();
					if(rvalue.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))// Passing the required row needed from excel
					{
						Iterator<Cell> cvalue=rvalue.cellIterator();
						while(cvalue.hasNext())
						{
							Cell c = cvalue.next();
							if(c.getCellType()==CellType.STRING)   // Condition to check if the extracted value is a String
									excelvalue.add(c.getStringCellValue());
							else                                                          // If not string then get the numeric value and change it to text
									excelvalue.add(NumberToTextConverter.toText(c.getNumericCellValue())); // NumberToTextConverter is used for changing any numeric value in the excel to text
							
							
						}
					}
					
				}
			}
		}
		return excelvalue;
	}

}
