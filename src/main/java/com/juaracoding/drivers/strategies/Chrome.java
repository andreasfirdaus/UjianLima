package com.juaracoding.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {

        String path = "D:\\mytools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

        ChromeOptions options = new ChromeOptions(); //set up chromenya , mau ngapain dia

        options.setExperimentalOption("useAutomationExtension",false);
        options.addArguments("--no-sandbox");
        return new ChromeDriver(options);
    }
}