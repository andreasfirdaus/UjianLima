package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {
    WebDriver driver;
    LoginPage loginPage;
    AddPage addPage;

    ChartPage chartPage;

    CheckOutPage checkOutPage;

    BiodataPage biodataPage;

    FinishPage finishPage;

    LogOutPage logOutPage;

    @BeforeClass // sblm mulai test case, apa yang mau dilakuin?
    public void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage= new LoginPage();
        addPage = new AddPage();
        chartPage = new ChartPage();
        checkOutPage = new CheckOutPage();
        biodataPage = new BiodataPage();
        finishPage = new FinishPage();
        logOutPage = new LogOutPage();
    }


    @AfterClass
    public void finish(){
        DriverSingleton.delay(11);
        DriverSingleton.closeObjectInstance();
    }

    @Test(priority = 1)
    public void LoginTest(){
        loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(loginPage.getTxtDashboard(),"Products");
        System.out.println("get username text");
    }
    @Test(priority = 2)
    public void TestAddPage(){
        addPage.add();
        Assert.assertEquals(addPage.getTxtAdd(),"Remove");
        System.out.println("get text add ");

    }

    @Test(priority = 3)
    public void TestChartPage(){
        chartPage.chartPage();
        Assert.assertEquals(chartPage.getTextChart(),"Your Cart");
        System.out.println("get text chart ");

    }

    @Test(priority = 4)
    public void TestCheckOut(){
        checkOutPage.checkOut();
        Assert.assertEquals(checkOutPage.getTxtCheckOut(),"Checkout: Your Information");
        System.out.println("get text check out ");

    }

    @Test(priority = 5)
    public void TestCheckBiodata(){
        biodataPage.biodata("andreas","firdaus","28884");
        Assert.assertEquals(biodataPage.getTextBiodata(),"Checkout: Overview");
        System.out.println("get text biodata ");

    }

    @Test(priority = 6)
    public void TestCheckFinish(){
        finishPage.finish();
        Assert.assertEquals(finishPage.getTxtFinish(),"Checkout: Complete!");
        System.out.println("get text finish ");

    }

    @Test(priority = 7)
    public void TestCheckLogOut(){
        logOutPage.logOut();
        System.out.println("logout berhasil");

    }

    @Test(priority = 8)
    public void TestNegativeLogin(){
        loginPage.login("papa","lololo");
        Assert.assertEquals(loginPage.negativeLogin(),"Epic sadface: Username and password do not match any user in this service");
        System.out.println("negative test case");

    }

}
