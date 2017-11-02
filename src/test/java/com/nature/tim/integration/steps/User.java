package com.nature.tim.integration.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class User {

    WebDriver driver = null;

    @Given("^Set up a browser$")
    public void setUpBrowser() throws Throwable {
//        driver = new FirefoxDriver();
        System.out.println("set up a browser");
    }

    @When("^Search the website$")
    public void goToWebsite() throws Throwable {
//        driver.navigate().to("http://wwww.baidu.com");
        System.out.println("search the website");
    }

    @When("^Create User$")
    public void createUser() throws Throwable {
        // todo
    }
}
