package TestPageQA;

import BaseToolsQa.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestElements extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(HomeUrl);
    }

    public void goToElementsPage() {
        String elementsPage = excelReader.getStringData("URL",1,1);
        driver.navigate().to(elementsPage);
    }

    public void openCheckBoxPage() {
        goToElementsPage();
        elementsPage.clickCheckBox();

    }

    public void openRadioButtonPage() {
        goToElementsPage();
        elementsPage.clickRadioButton();
    }

    public void openWebTablePage() {
        goToElementsPage();
        elementsPage.clickWebTables();
    }

    @Test (priority = 10)
    public void verifyUserCanOpenTextBox () throws InterruptedException {
        //ide na elements page
        goToElementsPage();
        //otvara textBox stranicu
        elementsPage.clickTextBox();

        //proveravam da li je na textBox stranici
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("ElementsURL",0,1);
        Assert.assertEquals(actualUrl,expectedUrl);
        //proveravam da li je submitButton prisutan
        Assert.assertTrue(textBoxPage.getSubmitButton().isDisplayed());
    }

    @Test (priority = 20)
    public void verifyUserCanOpenCheckBox(){
        goToElementsPage();
        elementsPage.clickCheckBox();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("ElementsURL", 1,1);
        Assert.assertEquals(actualUrl,expectedUrl);

    }

    @Test (priority = 30)
    public void verifyUserCanOpenRadioButton() {
        goToElementsPage();
        elementsPage.clickRadioButton();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("ElementsURL",2,1);
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test (priority = 40)
    public void verifyUserCanOpenWebTables () {
        goToElementsPage();
        elementsPage.clickWebTables();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("ElementsURL", 3,1);
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test (priority = 50)
    public void verifyUserCanOpenButtons () {
        goToElementsPage();
        elementsPage.clickButtons();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("ElementsURL",4,1);
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test (priority = 60)
    public void  verifyUserCanOpenLinks() {
        goToElementsPage();
        elementsPage.clickLinks();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("ElementsURL",5,1);
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test (priority = 70)
    public void  verifyUserCanOpenBrokenLinksAndImages() {
        goToElementsPage();
        elementsPage.clickBrokenLinks();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("ElementsURL",6,1);
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test (priority = 80)
    public void  verifyUserCanOpenUploadAndDownload() {
        goToElementsPage();
        elementsPage.clickUploadAndDownload();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = excelReader.getStringData("ElementsURL", 7,1);
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Test (priority = 90)
    public void verifyThatUserCanInputTextBoxFieldsAndSubmit() {
        goToElementsPage();
        elementsPage.clickTextBox();
        // pravim promeljivu - ubacujem iz Excela
        String fullName = excelReader.getStringData("TextBox",0,1);
        //ubacujem fullName
        textBoxPage.inputFullName(fullName);
        //ubacujem email
        String email = excelReader.getStringData("TextBox", 1,1);
        textBoxPage.inputEmail(email);
        //ubacujem prvu adresu
        String currentAddress = excelReader.getStringData("TextBox",2,1);
        textBoxPage.inputCurrenAdr(currentAddress);
        //ubacujem drugu adresu
        String permanentAdr = excelReader.getStringData("TextBox",3,1);
        textBoxPage.inputPermanentAdr(permanentAdr);
        //submitujem
        textBoxPage.clickSubmitButton();

        //asertujem da je sabmit uspeo tako sto proveravam da li se otput pojavio
        WebElement textOutput = driver.findElement(By.id("output"));
        System.out.println(textOutput.getText());
        Assert.assertTrue(textOutput.isDisplayed());
        //Assert.assertFalse(textOutput.isDisplayed());

    }

///-------------TEST CHECKBOX

    @Test (priority = 100)
    public void verifyThatArrowOnHomeIsOpeningDropDownMenu () {
        openCheckBoxPage();
        checkBoxPage.clickHomeArrow();
        // ne umem da asertujem ?

    }

    @Test (priority = 110)
    public void verifyThatUserCanClickHomeCheckbox () {
        openCheckBoxPage();
        //checkBoxPage.clickHomeArrow();

        checkBoxPage.selectHomeCheckBox();
        Assert.assertTrue(checkBoxPage.getSucceedNote().isDisplayed());
    }

    @Test (priority = 120)
    public void verifyThatUserCanChackDesktopChackbox (){
        openCheckBoxPage();
        checkBoxPage.clickHomeArrow();

        checkBoxPage.selectDesktopCheckBox();
        //proveravam da li je poruka koja se prikazuje kada se selektuje ChackBox prikazana
        Assert.assertTrue(checkBoxPage.getSucceedNote().isDisplayed());
    }

    ///////---------------TEST RADIO BUTTON


    @Test (priority = 130)
    public void verifyUserCanSelectYesRadioButton () {
        openRadioButtonPage();
        radioButtonPage.clickYesRadioButton();
        //uporedjujem prikazane poruke kada se klikne na YesButton
        String actualYesText = radioButtonPage.yesMessageText();
        String expectedYesText = excelReader.getStringData("RadioButton",0,1);
        Assert.assertEquals(actualYesText,expectedYesText);
    }

    @Test (priority = 140)
    public void verifyUserCanSelectImpressiveButton () {
        openRadioButtonPage();
        radioButtonPage.clickImpressiveRadioButton();

        String actualImpressiveText = radioButtonPage.impresiveMessText();
        String expectedImpressiveText = excelReader.getStringData("RadioButton", 1,1);
        Assert.assertEquals(actualImpressiveText,expectedImpressiveText);
    }

    @Test (priority = 150)
    public void verifyUserCanSelectNoButton(){
        openRadioButtonPage();
        radioButtonPage.clickNoRadioButton();

        //ovde test pada jer no Button nije klikabilan
    }

///////---- TEST WEB TABLES

    @Test
    public void verifyThatWhenUserClickAddButtonRegistrationFormIsOpen() {
        openWebTablePage();
        webTablesPage.clickAddButton();

        // proveravam da li se otvara registration form
        WebElement registrationText = driver.findElement(By.id("registration-form-modal"));
        String actualRegText = registrationText.getText();
        String expectedRegText = excelReader.getStringData("regForm",0,1);

        Assert.assertEquals(actualRegText,expectedRegText);
        Assert.assertTrue(registrationText.isDisplayed());
        Assert.assertTrue(webTablesPage.getSubmitButton().isDisplayed());
    }












}
