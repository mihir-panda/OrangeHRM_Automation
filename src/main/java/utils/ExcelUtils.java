package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.AutoConstant;

public class ExcelUtils implements AutoConstant
{
	public static String excel(String sheet,int row,int cell) throws IOException
	{
	FileInputStream fs=new FileInputStream(excel_path);
	XSSFWorkbook wb=new XSSFWorkbook(fs);
	Sheet s=wb.getSheet(sheet);
	Row r=s.getRow(row);
	Cell c=r.getCell(cell);
	return c.getStringCellValue();
	}
}
