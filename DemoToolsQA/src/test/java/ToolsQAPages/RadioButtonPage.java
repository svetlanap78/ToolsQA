package ToolsQAPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {
    public WebDriver driver;
    WebElement yesRadioButton;
    WebElement impresiveRadioButton;
    WebElement noRadioButton;
    WebElement yesMessageText;
    WebElement impressiveMessageText;


    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getYesRadioButton() {
        return driver.findElement(By.cssSelector(".custom-control.custom-radio.custom-control-inline"));
    }

    public WebElement getImpressiveRadioButton() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
    }

    public WebElement getNoRadioButton() {
        return driver.findElement(By.xpath("//*[@id=\"noRadio\"]"));
    }

    public WebElement getYesMessageText() {
        return driver.findElement(By.className("mt-3"));
    }

    public WebElement getImpressiveMessageText() {
        return driver.findElement(By.className("mt-3"));
    }

    //----------------------------------------------------------


    public void clickYesRadioButton (){
        getYesRadioButton().click();
    }

    public void clickImpressiveRadioButton(){
        getImpressiveRadioButton().click();
    }

    public void clickNoRadioButton(){
        getNoRadioButton().click();
    }
    public String yesMessageText() {
        return this.getYesMessageText().getText();
    }

    public String impresiveMessText() {
        return this.getImpressiveMessageText().getText();
    }
}
