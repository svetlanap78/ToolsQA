package ToolsQAPages;

import BaseToolsQa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage extends BasePage {
    public WebDriver driver;
    WebElement addButton;
    WebElement searchInputField;
    WebElement magGlass;
    WebElement editPencil;
    WebElement trashBox;
    WebElement inputFirstName;
    WebElement inputLastName;
    WebElement closeRegForm;
    WebElement inputEmail;
    WebElement inputAge;
    WebElement inputSalary;
    WebElement inputDepartment;
    WebElement submitButton;


    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getSearchInputField() {
        return driver.findElement(By.id("searchBox"));
    }

    public WebElement getMagGlass() {
        return driver.findElement(By.id("basic-addon2"));
    }

    public WebElement getEditPencil() {
        return driver.findElement(By.id("edit-record-3"));
    }

    public WebElement getTrashBox() {
        return driver.findElement(By.id("delete-record-3"));
    }

    public WebElement getInputFirstName() {
        return inputFirstName;
    }

    public WebElement getInputLastName() {
        return inputLastName;
    }

    public WebElement getCloseRegForm() {
        return closeRegForm;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputAge() {
        return inputAge;
    }

    public WebElement getInputSalary() {
        return inputSalary;
    }

    public WebElement getInputDepartment() {
        return inputDepartment;
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

//-----------------------------------------------------------------------------

    public void clickAddButton() {
        getAddButton().click();
    }

    public void clickSubmitButton () {
        getSubmitButton().click();
    }


}
