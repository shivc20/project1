package pom_ddf_testng_withmandetoryclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityclass 
{

	public static String fetchdata(int rowIndex, int cellIndex) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Shiv\\Desktop\\parameterization\\XL SHEET.xlsx");
        XSSFWorkbook book=new  XSSFWorkbook(file);
        XSSFSheet sh=book.getSheet("Sheet3");
//        String user=sh.getRow(0).getCell(1).getStringCellValue();
//        String passwdor=sh.getRow(0).getCell(1).getStringCellValue();
        String data=sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return data;


	}
	public static void screenshot(WebDriver driver, String second ) throws IOException
	{
		TakesScreenshot screen=(TakesScreenshot)driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Shiv\\Desktop\\screenshot\\second.jpg");
		FileHandler.copy(src,dest);
		
	}
}
