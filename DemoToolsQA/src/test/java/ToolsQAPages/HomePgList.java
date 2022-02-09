package ToolsQAPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class HomePgList {
    //deklarisem atribute
    public WebDriver driver;
    //deklarisem listu elemenata  - kartica koje se pojavljuju na HomePageu
    public List<WebElement> cards;

    public HomePgList(WebDriver driver) {
        this.driver = driver;
    }
    //inicijalizujem
    public WebDriver getDriver() {
        return driver;
    }

    //dohvatam listu elemenata na osnovu nekog istog inspecta
    public List<WebElement> getCards() throws InterruptedException {
        //Thread.sleep(2000);
        return driver.findElements(By.className("card-body"));
    }

    // --------------------------
    // pravim scrol metodu cak iako je element vidljiv u ovom slucaju nije mogao da ga pronadje iako je vidljiv
    public void scroll(WebElement element){
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //pravim metodu za pozivanje elemenata is liste
    // ovo je u slucaju da u testu hocu da naznacim koji element pozivam
    // a pozivacu ih u testu
    /*public void clickCard(int n) throws InterruptedException {
        //scroluje do kartice koju trazim
        scroll(getCards().get(n));
        //dohvata je i klikce
        getCards().get(n).click();
    }*/
    public void clickElementCard() throws InterruptedException {
        //scroluje do kartice koju trazim
        scroll(getCards().get(0));
        //dohvata je i klikce
        getCards().get(0).click();
    }

    public void clickFormCard() throws InterruptedException {
        scroll(getCards().get(1));
        getCards().get(1).click();
    }
    public void clickAlertsCard() throws InterruptedException {
        scroll(getCards().get(2));
        getCards().get(2).click();
    }

    public void clickWidgestsCard() throws InterruptedException {
        scroll(getCards().get(3));
        getCards().get(3).click();
    }

    public void clickInteractionsCard() throws InterruptedException {
        scroll(getCards().get(4));
        getCards().get(4).click();
    }

    public void clickBookStoreCard() throws InterruptedException {
        scroll(getCards().get(5));
        getCards().get(5).click();
    }








}
