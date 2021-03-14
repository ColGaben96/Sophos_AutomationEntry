package com.sophossolutions.colombia.test;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saucedemo_Test {
    private final WebDriver driver = new ChromeDriver();
    @Given("I am on Saucedemo Webpage")
    @When("I get in webpage")
    public void navigate() {
        driver.get("https://www.saucedemo.com/");
    }

    @Then("Authenticate with {string} and {string}")
    public void authenticate(String login, String password) {
        WebElement loginElem = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        loginElem.sendKeys(login);
        WebElement passwordElem = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordElem.sendKeys(password);
        WebElement signIn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        signIn.click();
    }

    @After
    public void endOperation() {
        driver.quit();
    }
}
