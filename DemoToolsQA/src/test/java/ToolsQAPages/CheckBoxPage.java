package ToolsQAPages;

import BaseToolsQa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxPage extends BasePage {
    public WebDriver driver;

    WebElement arrowHome;
    WebElement homeCheckBox;
    WebElement arrowDesktop;
    WebElement desktopCheckBox;
    WebElement plusIcon;
    WebElement notes;
    WebElement succeedNote;


    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

     public WebElement getArrowHome() {
        return driver.findElement(By.cssSelector("button[title=Toggle]"));
    }

    public WebElement getHomeCheckBox() {
        return driver.findElement(By.className("rct-checkbox"));
    }

    public WebElement getArrowDesktop() {
        return driver.findElement(By.cssSelector(".rct-collapse.rct-collapse-btn"));
    }

    public WebElement getDesktopCheckBox() {
        return driver.findElement(By.cssSelector("[for=tree-node-desktop]"));
    }

    public WebElement getPlusIcon() {
        return  driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-all"));
    }

    /*public WebElement getNotes() {
        return driver.findElement(By.id("tree-node-notes"));
    }*/
    //imam problem lokatora

    public WebElement getSucceedNote() {
        return driver.findElement(By.cssSelector(".display-result.mt-4"));
    }

    //---------------------------------------------------------------------

    public void clickHomeArrow() {
        getArrowHome().click();
    }
    public void selectHomeCheckBox() {
        getHomeCheckBox().click();
    }
    public void clickDesctopArrow() {
        getArrowDesktop().click();
    }
    public void selectDesktopCheckBox() {
        getDesktopCheckBox().click();
    }

   /* public void selectNotesCheckBox(){
        getNotes().click();
    }*/
    public void clickPlusIcon() {
        getPlusIcon().click();
    }

    public String succeedNote(){
        return getSucceedNote().getText();
    }








}
