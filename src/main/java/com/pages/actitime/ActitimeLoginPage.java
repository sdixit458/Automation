package com.pages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.ExcelLibrary;

public class ActitimeLoginPage implements AutoConstant {
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void loginMethod() throws IOException {
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		keepLoggedInCheckBox.click();
		loginButton.click();
	}

}
