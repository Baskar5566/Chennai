package org.test;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.StackWalker.Option;
import java.awt.Robot;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteAsyncScript;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SampleProject1\\driver\\chromedriver.exe");	
		driver=new ChromeDriver();
		return driver;
	}
	public static void createNewExcelSheet(String pathname,String name,int row,int cell,String text) throws IOException {
		File file=new File(pathname);
		FileOutputStream outputstream=new FileOutputStream(file);
		Workbook work=new XSSFWorkbook();
		Sheet createSheet = work.createSheet(name);
		Row createRow = createSheet.createRow(row);
		Cell createCell = createRow.createCell(cell);
       createCell.setCellValue(text);		
       work.write(outputstream);
		
	}
	public static String getDataFromExcel (String pathname,String name,int rownum,int cellnum) throws IOException {
		File file =new File(pathname);
		FileInputStream stream =new FileInputStream(file);
		Workbook work=new XSSFWorkbook(stream);
		Sheet sheet =work.getSheet(name);
		Row row=sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		int cellType = cell.getCellType();
	
		if(cellType==1) {
			 String value = cell.getStringCellValue();
			return value;	
		}
		else if(cellType==0) {
		if(DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat dateformat=new SimpleDateFormat("dd-MMM-yyyy");
			String format = dateformat.format(dateCellValue);
			return format;	
		}
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l=(long) numericCellValue;
			  String dou = String.valueOf(l);
			 return dou;	
		}}
		return name;
		
		
	}
	
	
	public void scrollDown(WebElement element) {
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		 jk.executeScript("arguments[0].scrollIntoView(true)",element );
		
	}
	public void Scrollup(WebElement element) {
		JavascriptExecutor jk1=(JavascriptExecutor)driver;
		 jk1.executeScript("arguments[0].scrollIntoView(true)",element );
				
	}
	public void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		}
	
	
	public static void loadUrl(WebDriver driver,String url) {
		driver.get(url);
		}
	public static void sendKeys(WebElement element,String data ) {
		element.sendKeys(data);
		}
	public static void btnclick(WebElement element) {
		element.click();
		
	}
	public void clearall(WebElement element) {
		element.clear();
	}
	public void getAttributevalue(WebElement  element, String Value) {
		element.getAttribute(Value);
	}
	public void getCssValue(WebElement element,String cssValue) {
		element.getCssValue(cssValue);
		}
	public void getLocation(WebElement element) {
		element.getLocation();
		}
	public void getSize(WebElement element,String size) {
		element.getSize();
		}
	public void gettagName(WebElement element,String tagname) {
		element.getTagName();
		}
	public void selectbyvisibletext(WebElement element,String text) {
		Select sel=new Select(element);
         sel.selectByVisibleText(text);
	}
	public  void getOption(WebElement element,String data) {
		Select sel=new Select(element);
		sel.getOptions();
		
	}
	public void isSelected(WebElement element,String data) {
		boolean b = element.isSelected();
	}
     public void isEnabled(WebElement element) {
    	 boolean enabled = element.isEnabled();
	}
     public void isDisplayed(WebElement element) {
    	 boolean selected = element.isSelected();
   }
     public void get(WebDriver driver,String url) {
    	 driver.get(url);
		}
     public void getCurrentDriver(WebDriver driver,String url) {
    	driver.getCurrentUrl();
		}
     public void getTitle(WebDriver driver,String title) {
    	 driver.getTitle();
		}
     public void quit(WebDriver driver) {
    	 driver.quit(); 
		}
     public void manage(WebDriver driver) {
    	 driver.manage().window().maximize();
		}
     public void moveToElement(WebElement elemnt,Actions act) {
      act.moveToElement(elemnt).perform();	 
		}
     public void draganddrop(WebElement element,Actions act) {
    	 act.dragAndDrop(element, element).perform();
		}
     public static void keyPress(Robot r ,KeyEvent key) {
    		 r.keyPress(key.VK_DOWN);
        	 r.keyRelease(key.VK_DOWN);	
        	 r.keyPress(key.VK_ENTER);		
        	 r.keyRelease(key.VK_ENTER);	
     }
     public void doubleclick(WebElement element,Actions act) {
    	 act.doubleClick(element).perform();
    }
     public void rightclick(WebElement element ,Actions act) {
    	 act.contextClick().perform();
		}
     public void switchto(WebDriver driver,Actions act) {
    	 driver.switchTo();
		}
		
	}
     
     
      
	


