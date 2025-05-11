package com.swaglabproject.actiondriver;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swaglabproject.base.BaseClass;

public class Actions extends BaseClass {

	public void EnterText(By ele, String text) {
		driver.findElement(ele).sendKeys(text);
	}
	
	public void Click(By ele) {
		driver.findElement(ele).click();
	}
	
	public void SelectOption(List<WebElement> elements, String expectedText, String tagName) {
	    for (WebElement element : elements) {
	        try {
	            WebElement childTag = element.findElement(By.tagName(tagName));
	            if (childTag.getText().trim().equalsIgnoreCase(expectedText)) {
	                childTag.click();
	                System.out.println("Clicked on element with text: " + expectedText);
	                return;
	            }
	        } catch (NoSuchElementException e) {
	            // Tag not found inside this element — continue to next
	        }
	    }
	    System.out.println("No matching element with text '" + expectedText + "' found.");
	}
	
	public boolean isElementDisplayed(By locator) throws TimeoutException {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	        return element.isDisplayed();
	    } catch (NoSuchElementException | StaleElementReferenceException e) {
	        return false;
	    }
	}
}
