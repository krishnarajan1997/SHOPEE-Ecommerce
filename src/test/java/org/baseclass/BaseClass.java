package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Select s;
	public static JavascriptExecutor js;	
	public static int n;
	public static int j;
	public static Date d;
	public static String time() {
		d=new Date();
		String s = d.toString();
		return s;
	}
	
	public static void brokenLink(List<WebElement> hh) throws Exception {
		// TODO Auto-generated method stub
		int count = 0;
		for (WebElement x : hh) {
			String attribute = x.getAttribute("href");
			URL u = new URL(attribute);
			URLConnection open = u.openConnection();
			HttpURLConnection h = (HttpURLConnection) open;
			int c = h.getResponseCode();
			if (c != 200) {

				count++;
			}

		}
		System.out.println("Broken link count= " + count);
	}
	
	
	
	
	
	
	public static String excel(String s1,int i,int j) throws IOException {
		// TODO Auto-generated method stub
	File f=new File("C:\\Users\\DELL\\eclipse-workspace\\SHOPEE\\Excel\\Book2.xlsx");
	FileInputStream fs=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fs);
	Sheet s = w.getSheet(s1);
	Row r = s.getRow(i);
	Cell c = r.getCell(j);
	DataFormatter d=new DataFormatter();
	String val = d.formatCellValue(c);
	return val;
	}
	
	public static void excelWrite(int i,int j,String set) throws Exception {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\SHOPEE\\Excel\\Book1.xlsx");
		FileOutputStream fs=new FileOutputStream(f);
		Workbook w=new XSSFWorkbook();
		Sheet s = w.getSheet("sheet1");
		Row r = s.createRow(i);
		Cell c = r.createCell(j);
		c.setCellValue(set);
		w.write(fs);
	}
	
	
	
	
	public static void takesScreenshot(String s1) throws Exception {
		// TODO Auto-generated method stub
	TakesScreenshot t=(TakesScreenshot) driver;
	File as = t.getScreenshotAs(OutputType.FILE);
	File f=new File("C:\\Users\\DELL\\eclipse-workspace\\SHOPEE\\SCREEN\\"+s1+".png");
	FileUtils.copyFile(as, f);
	
	}
		public static void launchBrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\UtilityClass\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		public static void launchUrl(String x) {
			// TODO Auto-generated method stub
			driver.get(x);
		}
		public static String pageTitle() {
			// TODO Auto-generated method stub
			String title = driver.getTitle();
			return title;
		}
		public static void pageUrl() {
			// TODO Auto-generated method stub
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}
		public static void winMaximize() {
			// TODO Auto-generated method stub
			driver.manage().window().maximize();
		}
		public static void pageClose() {
			// TODO Auto-generated method stub
			driver.close();
		}
		public static void pageQuit() {
			// TODO Auto-generated method stub
			driver.quit();
		}
		public static void sendKey(WebElement e,String x) {
			// TODO Auto-generated method stub
			e.sendKeys(x);
		}
		public static void elementClick(WebElement e) {
			// TODO Auto-generated method stub
			e.click();
		}
		public static WebElement findId(String x) {
			// TODO Auto-generated method stub
			WebElement element = driver.findElement(By.id(x));
			return element;
		}
		public static WebElement findname(String x) {
			// TODO Auto-generated method stub
			WebElement element = driver.findElement(By.name(x));
			return element;
		}
		public static WebElement findXpath(String x) {
			// TODO Auto-generated method stub
			WebElement element = driver.findElement(By.xpath(x));
			return element;
		}
		public static WebElement findClassName(String x) {
			// TODO Auto-generated method stub
			WebElement element = driver.findElement(By.className(x));
			return element;
		} 
		public static List<WebElement> findTagName(String x) {
			// TODO Auto-generated method stub
			 List <WebElement> element = driver.findElements(By.tagName(x));
			return element;
		}
		public static String getTheText(WebElement e) {
			// TODO Auto-generated method stub
			String text = e.getText();
			
			return text;
		}
		public static void getTheAttribute(WebElement e) {
			// TODO Auto-generated method stub
				String attribute = e.getAttribute("value");
				System.out.println(attribute);
		}
		public static void sleep(int x) throws InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(x);
		}
		public static void navigate(String x) {
			// TODO Auto-generated method stub
			driver.navigate().to(x);
		}
		public static void navigateBack() {
			// TODO Auto-generated method stub
			driver.navigate().back();
		}
		public static void navigateForward(String x) {
			// TODO Auto-generated method stub
			driver.navigate().forward();
		}
		public static void refresh() {
			// TODO Auto-generated method stub
			driver.navigate().refresh();
		}
		public static void elementDisplayed(WebElement e) {
			// TODO Auto-generated method stub
				boolean displayed = e.isDisplayed();
					System.out.println(displayed);
			
				}
		public static void elementEnabled(WebElement e) {
			// TODO Auto-generated method stub
				boolean enabled = e.isEnabled();
					System.out.println(enabled);
				
				}	
		public static void elementSelected(WebElement e) {
					// TODO Auto-generated method stub
					boolean selected = e.isSelected();
						System.out.println(selected);
					
					}
		public static void moveToTheElement(WebElement x) {
			// TODO Auto-generated method stub
			a=new Actions(driver);
			a.moveToElement(x).perform();
		}
		public static void dragAndTheDrop(WebElement x,WebElement y) {
			// TODO Auto-generated method stub
			a.dragAndDrop(x, y).perform();
		}
		public static void rightClick(WebElement x) {
			// TODO Auto-generated method stub
			a.contextClick(x).perform();
		}
		public static void doubleeClick(WebElement x) {
			// TODO Auto-generated method stub
			a.doubleClick(x).perform();
		}
		public static void down() throws AWTException {
			// TODO Auto-generated method stub
			r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		public static void up() throws AWTException {
			// TODO Auto-generated method stub
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		public static void enter() throws AWTException {
			// TODO Auto-generated method stub
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void tab() throws AWTException {
			// TODO Auto-generated method stub
			r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		public static void isTheMultiple(WebElement x) {
			// TODO Auto-generated method stub
			s=new Select(x);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		}
		public static void getTheOptions() {
			// TODO Auto-generated method stub
			List<WebElement> options = s.getOptions();
			for (WebElement webElement : options) {
				String text = webElement.getText();
				System.out.println(text);
			}
		}
		public static void getTheSelectedOptions() {
			// TODO Auto-generated method stub
			List<WebElement> options = s.getAllSelectedOptions();
			for (WebElement webElement : options) {
				System.out.println(webElement.getText());
			}
		}
			public static void getTheFirstSelectedOption() {
			WebElement option = s.getFirstSelectedOption();
			System.out.println(option.getText());
			}
			public static void selectedByValue(WebElement e, String s) {
				// TODO Auto-generated method stub
				new Select(e).selectByValue(s);
			}
			public static void selectedByVisibleText(WebElement e, String s) {
			new Select(e).selectByVisibleText(s);
			}

			public static void selectedByIndex(WebElement e) {
			new Select(e).deselectAll();
			}
			public static void deselectedByIndex(WebElement e,int t) {
				new Select(e).deselectByIndex(t);
				}
			public static void deselectedByvalue(WebElement e,String s) {
				new Select(e).deselectByValue(s);
				}
			public static void deselectedByVisibleText(WebElement e,String s) {
				new Select(e).deselectByVisibleText(s);
				}

			public static void deselectedAll(WebElement e, String s) {
			new Select(e).deselectByVisibleText(s);
			}
		public static void switchFrameId(String x) {
		driver.switchTo().frame(x);
		}
		public static void switchFrameName(String x) {
			driver.switchTo().frame(x);
			}
		public static void switchFrameIndexx(String x) {
			driver.switchTo().frame(x);
			}
		public static void frameCount() {
			// TODO Auto-generated method stub
			List<WebElement> list = driver.findElements(By.tagName("iframe"));
			int size = list.size();
			System.out.println(size);
		}
		public static void frameOut() {
			// TODO Auto-generated method stub
			driver.switchTo().defaultContent();
		}
		public static void parentWindow() {
			// TODO Auto-generated method stub
			String handle = driver.getWindowHandle();
			driver.switchTo().window(handle);
		}
		public static void parentTosecWindow() {
			// TODO Auto-generated method stub
			String handle = driver.getWindowHandle();
			driver.switchTo().window(handle);
			Set<String> handles = driver.getWindowHandles();
			for(String x:handles)
			{if(!handle.equals(x))
			{driver.switchTo().window(handle);
			}}}
		public static void parentTomultiWindow(int x) {
			Set<String> handles = driver.getWindowHandles();
			List<String>l=new ArrayList<String>();
			l.addAll(handles);
			driver.switchTo().window(l.get(x));
			}
		public static void scrolUp(WebElement e) {
			// TODO Auto-generated method stub
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)",e);
		}
		public static void scrolDown(WebElement e) {
			// TODO Auto-generated method stub
			js.executeScript("arguments[0].scrollIntoView(true)",e);
		}
		public static void getAttribute(WebElement e) {
			// TODO Auto-generated method stub
			String script = (String) js.executeScript("return arguments[0].getAttribute('value')",e);
		System.out.println(script);
		}



}
