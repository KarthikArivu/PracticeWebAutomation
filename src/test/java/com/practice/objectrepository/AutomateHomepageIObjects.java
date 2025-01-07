package com.practice.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lib.BaseClass;

public class AutomateHomepageIObjects extends BaseClass{
	
	//WebDriver driver;
	
	public AutomateHomepageIObjects(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="header")
	private WebElement PageHeader;
	
	@FindBy(xpath ="//a[text()='Sliders']")
	private WebElement SliderButton;

	public boolean validatePageHeader() {
		return PageHeader.isDisplayed();
		
		
	}
	public void ClickSliderButton() {
		SliderButton.click();
		
		
	}
	
	

}
