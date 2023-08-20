package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static com.juaracoding.drivers.DriverSingleton.delay;

public class AddPage {
    private WebDriver driver;

    public AddPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")

    WebElement btnAddProdukSatu;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")

    WebElement txtRemoveProdukSatu;

    @FindBy(xpath = " //button[@id='add-to-cart-sauce-labs-bike-light']")

    WebElement btnAddProdukDua;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")

    WebElement txtRemoveProdukDua;


    public void add(){
        btnAddProdukSatu.click();
        btnAddProdukDua.click();
    }

    public String getTxtAdd (){
        return txtRemoveProdukSatu.getText();
    }

}
