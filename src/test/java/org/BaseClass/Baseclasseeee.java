package org.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.SimpleFileVisitor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.apache.poi.ss.formula.CollaboratingWorkbooksEnvironment.WorkbookNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclasseeee {
	public static WebDriver driver;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	}
	public static void launchurl(String e) {
		driver.get(e);
	}
	public static String pageurl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public static String pagetitle() {
		String title = driver.getTitle();
		return title;
	}
	public static void filltxt(WebElement a,String e) {
		a.sendKeys(e);
	}
	public static void btnclick(WebElement a) {
		a.click();
	}
	public static void datetime() {
		Date d=new Date();
	}
	public static String Datadriven(String Sheet,int row,int cell) throws IOException {
		File f=new File("C:\\Users\\ASUS\\eclipse-workspace\\MavenCodfisTechnology\\excel\\exam.xlsx");
		FileInputStream fh=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fh);
		Sheet sh = book.getSheet(Sheet);
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		int type = c.getCellType();
		String name="";
		if (type==1) {
			 name = c.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(c)) {
			Date da = c.getDateCellValue();
			SimpleDateFormat s=new SimpleDateFormat();
		     name = s.format(da);
		}else {
			double d = c.getNumericCellValue();
			long lo=(long)d;
			 name = String.valueOf(lo);
			
			
		}
		return name;
		
		
		

	}

}
