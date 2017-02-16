package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	//set file path and open excel file
	public static void setExcelFile(String path, String sheetName) throws Exception{
		try{
			//open excel
			FileInputStream ExcelFile = new FileInputStream(path);
			
			//access the test data
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
			
		} 
		catch (Exception e){
			throw (e);
		}
	
	}
	//get the data from the specified cell
	public static String getCellData(int rowNum, int colNum) throws Exception
	{
		try{
			Cell = ExcelWSheet.getRow(rowNum).getCell(colNum);
			
			String cellData = Cell.getStringCellValue();
			
			return cellData;
		}
		catch (Exception e){
			return "";
		}
	}

	//write in the excel file 
	public static void setCellData(String result, int rowNum, int colNum) throws Exception{
		try{
			Row = ExcelWSheet.getRow(rowNum);
			Cell = Row.getCell(colNum, Row.RETURN_BLANK_AS_NULL);
			
			if (Cell == null){
				Cell = Row.createCell(colNum);
				Cell.setCellValue(result);
			}
			else{
				Cell.setCellValue(result);
			}
			
			//Constant variable Test data path and test data file name
			FileOutputStream fileOutput = new FileOutputStream(Constants.testDataFile_path + Constants.testDataFile_name);
			ExcelWBook.write(fileOutput);
			fileOutput.flush();
			fileOutput.close();
		}
		catch (Exception e){
			throw e;
		}
	}
	
}
