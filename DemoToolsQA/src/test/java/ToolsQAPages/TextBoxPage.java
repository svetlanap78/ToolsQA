package ToolsQAPages;

import BaseToolsQa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage extends BasePage {
    public WebDriver driver;
    WebElement FullName;
    WebElement Email;
    WebElement CurrentAddress;
    WebElement PermanentAddress;
    WebElement submitButton;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    //--------------------------------

    //ubacujem scroll metodu
    public void scroll(WebElement element){
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

  /*  public void clickOnFullNameBox () {
    getFullName().click();
    }*/
    public void inputFullName(String name) {
        getFullName().click();
        this.getFullName().clear();
        getFullName().sendKeys(name);
    }

    public void inputEmail(String email){
        getEmail().click();
        this.getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void inputCurrenAdr(String adr1) {
        getCurrentAddress().click();
        this.getCurrentAddress().clear();
        getCurrentAddress().sendKeys(adr1);
    }

    public void inputPermanentAdr(String adr2) {
        scroll(getPermanentAddress());
        getPermanentAddress().click();
        getPermanentAddress().clear();
        getPermanentAddress().sendKeys(adr2);
    }

    public void clickSubmitButton() {
        scroll(getSubmitButton());
        getSubmitButton().click();
    }
}
