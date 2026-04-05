package GenaricLib;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baseclass {
	public static WebDriver driver;
	private static String dbUrl;
	private static String dbUsername;
	private static String dbPassword;
	public static Connection conn;
	static Propertyfiles pdata = new Propertyfiles();

	public Baseclass() throws IOException {
		dbUrl = pdata.getProperty("dbUrl");
		dbUsername = pdata.getProperty("dbUsername");
		dbPassword = pdata.getProperty("dbPassword");
	}

	@BeforeSuite
	public static void dbConnection() {
		try {

			conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		} catch (SQLException e) {
			System.out.println(e.getMessage());

		}
	}

	@Parameters({ "browser" })
	@BeforeTest
	public static void selectBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ieBrowser")) {
			driver = new InternetExplorerDriver();
		}
	}
	
	
	@AfterSuite
	public static void closeDbConnection() throws SQLException {
		conn.close();
	}

}
