package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.Loginpage;
import util.Browserfactory;
import util.ExcelReader;

public class Logintest {
	WebDriver driver;
	//Logindata
ExcelReader exlReader=new ExcelReader("C:\\Users\\vanga\\eclipse-workspace\\Exl_project\\src\\main\\java\\testdata\\Book1.xlsx");
	String username=exlReader.getCellData("Logininfo", "Username", 2);
	String password=exlReader.getCellData("Logininfo", "Password",2);
	@Test
	public void usershouldbeabletologin() {
		
	driver=Browserfactory.init();
	Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
	//Dashboardpage dp=PageFactory.initElements(driver, Dashboardpage.class);
	lp.enterusername(username);
	lp.enterpassword(password);
	lp.clicksubmit();
	//dp.dashboardcheck();
	//Browserfactory.teardown();
	

	}

}
