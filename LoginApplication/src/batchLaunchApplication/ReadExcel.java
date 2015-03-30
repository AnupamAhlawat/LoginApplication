package batchLaunchApplication;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {

	public String getPassword(Sheet sheet, int ROW_COUNT){
		Row row = sheet.getRow(ROW_COUNT);
		Cell pwdCell = row.getCell(3);
		String pwd = pwdCell.getStringCellValue();
		return pwd;
	}

	public String getUsername(Sheet sheet,int ROW_COUNT){
		Row row = sheet.getRow(ROW_COUNT);
		Cell userNameCell = row.getCell(2);
		String userName = userNameCell.getStringCellValue();
		return userName;


	}
	public String getLink(Sheet sheet, int ROW_COUNT){
		Row row = sheet.getRow(ROW_COUNT);
		Cell linkCell = row.getCell(1);
		String link = linkCell.getStringCellValue();
		return link;
	}
}