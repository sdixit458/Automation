package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.pages.actitime.ActitimeLoginPage;

public class ActitimeLogin extends BaseTest {
	@Test
	public void login() throws IOException {
		ActitimeLoginPage login=new ActitimeLoginPage(driver);
		login.loginMethod();
	}

}
