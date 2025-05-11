package com.swaglabproject.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.swaglabproject.base.BaseClass;

public class obj_DynamicID extends BaseClass {
	
	public obj_DynamicID(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

	@FindBy(xpath = "(//section[@id='overview']//div[@class='col-sm'])")
	public List<WebElement> selectOptions;
	
	public By dynamicIDButton = By.xpath("//button[@class='btn btn-primary']");
	/*
	 * @FindBy(xpath = "//button[@class='btn btn-primary']") public WebElement
	 * dynamicIDButton;
	 */
	
}
