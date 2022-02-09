package ToolsQAPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {
    public WebDriver driver;
    WebElement TextBox;
    WebElement CheckBox;
    WebElement RadioButton;
    WebElement WebTables;
    WebElement Buttons;
    WebElement Links;
    WebElement BrokenLinksImages;
    WebElement UploadAndDownload;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getTextBox() {
        return driver.findElement(By.id("item-0"));
    }

    public WebElement getCheckBox() {
        return driver.findElement(By.id("item-1"));
    }

    public WebElement getRadioButton() {
        return driver.findElement(By.id("item-2"));
    }

    public WebElement getWebTables() {
        return driver.findElement(By.id("item-3"));
    }

    public WebElement getButtons() {
        return driver.findElement(By.id("item-4"));
    }

    public WebElement getLinks() {
        return driver.findElement(By.id("item-5"));
    }

    public WebElement getBrokenLinksImages() {
        return driver.findElement(By.id("item-6"));
    }

    public WebElement getUploadAndDownload() {
        return driver.findElement(By.id("item-7"));
    }

    //-------------------------------------------------------------
    //ubacujem scroll metodu
    public void scroll(WebElement element){
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickTextBox () {
        getTextBox().click();
    }
    public void clickCheckBox () {
        getCheckBox().click();
    }
    public void clickRadioButton () {
        //scroll(getRadioButton().click());
        scroll(getRadioButton());
        getRadioButton().click();
    }
    public void clickWebTables () {
        scroll(getWebTables());
        getWebTables().click();
    }
    public void clickButtons () {
        scroll(getButtons());
        getButtons().click();
    }
    public void clickLinks () {
        scroll(getLinks());
        getLinks().click();
    }
    public void clickBrokenLinks () {
        scroll(getBrokenLinksImages());
        getBrokenLinksImages().click();
    }
    public void clickUploadAndDownload() {
        scroll(getUploadAndDownload());
        getUploadAndDownload().click();
    }

}
