package TestPageQA;

import BaseToolsQa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(HomeUrl);
    }

    @Test (priority = 10)
    public void ElementCardIsClickableAndOpeningElemntsPage() throws InterruptedException {
        homePgList.clickElementCard();

        //assertujem da je element card otvoren i ide na Elements stranicu
        //prvo preko URL-a
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("URL", 1,1);
        Assert.assertEquals(actualUrl, expectedUrl);

        //proveravam da li je otvorio stranicu i  da je Elements tekst prikazan na stranici
        String expectedTitle = "Elements";
        /*WebElement title = driver.findElement(By.linkText("Elements"));
        title.getText();*/
        String actualTitle = driver.findElement(By.className("main-header")).getText();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Test (priority = 20)
    public void FormCardIsOpening() throws InterruptedException {
        homePgList.clickFormCard();
        //assertujem da je element card otvoren i ide na Elements stranicu
        //prvo preko URL-a
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("URL",2,1);
        Assert.assertEquals(actualUrl,expectedUrl);

        //proveravam da li je otvorio Forms stranicu i  da je Forms tekst prikazan na stranici
        String expectedTitle = "Forms";
        String actualTitle = driver.findElement(By.className("main-header")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test (priority = 30)
    public void AlertsCardIsOpening() throws InterruptedException {
        homePgList.clickAlertsCard();
        //assertujem da je element card otvoren i ide na Elements stranicu
        //prvo preko URL-a
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("URL", 3,1);
        Assert.assertEquals(actualUrl,expectedUrl);

        //proveravam da li je otvorio Allerts stranicu i  da je Allerts tekst prikazan na stranici
        String expectedTitle = "Alerts, Frame & Windows";
        String actualTitle = driver.findElement(By.className("main-header")).getText();
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test (priority = 40)
    public void WidgetsCardIsOpening() throws InterruptedException {
        homePgList.clickWidgestsCard();
        //assertujem da je element card otvoren i ide na Elements stranicu
        //prvo preko URL-a
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("URL", 4,1);
        Assert.assertEquals(actualUrl,expectedUrl);

        //proveravam da li je otvorio Widgets stranicu i  da je Widgets tekst prikazan na stranici
        String expectedTitle = "Widgets";
        String actualTitle = driver.findElement(By.className("main-header")).getText();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @Test (priority = 50)
    public void InteractionsCardIsOpening() throws InterruptedException {
        homePgList.clickInteractionsCard();
        //assertujem da je element card otvoren i ide na Elements stranicu
        //prvo preko URL-a
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("URL", 5,1);
        Assert.assertEquals(actualUrl,expectedUrl);

        //proveravam da li je otvorio Widgets stranicu i  da je Widgets tekst prikazan na stranici
        String expectedTitle = "Interactions";
        String actualTitle = driver.findElement(By.className("main-header")).getText();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    @Test (priority = 60)
    public void BookStoreCardIsOpening() throws InterruptedException {
        homePgList.clickBookStoreCard();
        //assertujem da je element card otvoren i ide na Elements stranicu
        //prvo preko URL-a
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("URL", 6,1);
        Assert.assertEquals(actualUrl,expectedUrl);

        //proveravam da li je otvorio Widgets stranicu i  da je Widgets tekst prikazan na stranici
        String expectedTitle = "Book Store";
        String actualTitle = driver.findElement(By.className("main-header")).getText();
        Assert.assertEquals(actualTitle,expectedTitle);
    }






}
