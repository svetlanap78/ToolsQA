package BaseToolsQa;

import ToolsQAPages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public String HomeUrl;
    //deklarisem svaku novu stranicu koju sam napravila
    public HomePgList homePgList;
    public ElementsPage elementsPage;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public WebTablesPage webTablesPage;


    @BeforeClass
    //postavke za stranicu
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader = new ExcelReader("C:\\Users\\korisnik\\IdeaProjects\\DemoToolsQA\\BookToolsQA.xlsx");
        HomeUrl = excelReader.getStringData("URL", 0,1);

        //svaku stranicu koju napravim ovde inicijalizujem
        homePgList = new HomePgList(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        webTablesPage = new WebTablesPage(driver);
    }

    //posebna metoda koja ceka da element bude vidljiv
    public void waiter(WebElement element) {
        wdwait.until(ExpectedConditions.visibilityOf(element));
    }
    //posebna metoda koja ceka da element bude klikabilan
    public void waiterCickable(WebElement element) {
        wdwait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @AfterClass
    public void tearDown() {
           /* driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();*/
    }




}
