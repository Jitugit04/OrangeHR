package Helper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.DataFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ExcelRead {
	
	
	//private WebDriver driver;



	//public ExcelRead(WebDriver driver) {
		
	//	this.driver=driver;
		// TODO Auto-generated constructor stub
	//}



	public ExcelRead(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}



	public List<Map<String,String>> getData(String excelFilePath, String sheetName)throws DataFormatException,IOException
	{
		Sheet sheet=getSheetByName(excelFilePath,sheetName);
				return readSheet(sheet);
		
	}



	public List<Map<String,String>> getData(String excelFilePath, int sheetNumber)throws DataFormatException,IOException
			{
		Sheet sheet=getSheetByIndex(excelFilePath,sheetNumber);
						return readSheet(sheet);
				
			}


	private List<Map<String, String>> readSheet(Sheet sheet) {
		
		
		
	Row row;
	int totalRow= sheet.getPhysicalNumberOfRows();
	List<Map<String,String>> excelRows=new ArrayList<Map<String,String>>();
	int headerRowNumber=getHeaderRowNumber(sheet);
	if(headerRowNumber !=-1) {
		int totalColumn=sheet.getRow(headerRowNumber).getLastCellNum();
		int setCurrentRow=1;
		for(int CurrentRow=setCurrentRow; CurrentRow <= totalRow; CurrentRow++)
		{
	
		row=getRow(sheet,sheet.getFirstRowNum()+ CurrentRow);
		LinkedHashMap<String,String> ColunMapdata=new LinkedHashMap<String,String>();
		
		for(int CurrentColumn=0;CurrentColumn<totalColumn; CurrentColumn++ )
		
			ColunMapdata.putAll(getCellValue(sheet,row,CurrentColumn));
			
		
	
		}	
	}
	return excelRows;
	}


	private Row getRow(Sheet sheet, int i) {
		// TODO Auto-generated method stub
		return null;
	}



	private Map<? extends String, ? extends String> getCellValue(Sheet sheet, Row row, int currentColumn) {
		// TODO Auto-generated method stub
		return null;
	}



	private int getHeaderRowNumber(Sheet sheet) {
		// TODO Auto-generated method stub
		return 0;
	}



	private Sheet getSheetByIndex(String excelFilePath, int sheetNumber) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		Sheet sheet=((Workbook) getWorkBook(excelFilePath)).getSheetAt(sheetNumber);
		return sheet;
	}



	private Object getWorkBook(String excelFilePath) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		return WorkbookFactory.create(new File(excelFilePath));
	}



	private Sheet getSheetByName(String excelFilePath, String sheetName) throws DataFormatException,IOException
	{
	Sheet sheet=((Workbook) getWorkBook(excelFilePath)).getSheet(sheetName);
	return sheet;
	}
	
	}
