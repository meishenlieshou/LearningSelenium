package com.util;



import java.io.File;

import java.io.IOException;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.firefox.FirefoxProfile;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.DesiredCapabilities;



public class Browsers {

	private WebDriver driver = null;

	FirefoxProfile profile = null;

	DesiredCapabilities cap =null;

	private String projectpath  = System.getProperty("user.dir");

	private String iedriver = "";

	private String chromedriver = "";

	//private String safaridriver = "";

	private String firebugdir = "";

	private String firxpathdir = "";

	//定义浏览器类型

  public Browsers(BrowserType browsertype){

	  switch(browsertype){

	  case IE:

		  System.setProperty("webdriver.ie.driver", iedriver);

		  cap=new DesiredCapabilities();

		  cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

		  cap.setCapability("ignoreProtectedModeSettings", true);

		  driver = new InternetExplorerDriver(cap); 

		  

		  break;

	  case FF:

		  System.out.println("start firefox browser...");

		  

		 //未安装到指定目录

//		  System.setProperty("webdriver.firefox.bin", "D:/Program Files/Mozilla Firefox/firefox.exe");

		 

		  

		 //添加插件

		  File firebug = new File(projectpath+firebugdir);

		  File firexpath = new File(projectpath+firxpathdir);

		  profile = new FirefoxProfile();

		  try {

			profile.addExtension(firebug);

			profile.addExtension(firexpath);

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

			System.out.println("the extension not found");

		}



		  profile.setPreference("extensions.firebug.currentVersion", "1.1.1");//版本确认

		  profile.setPreference("extensions.firebug.currentVersion", "1.1.1");

           driver = new FirefoxDriver(profile);

          driver.manage().window().maximize();

		  break;

	  case Chorme:

		  System.setProperty("webdriver.ie.driver", chromedriver);

		  driver = new ChromeDriver();

		  break;

	  case edge: 

		  break;

	  case safari:

		  break;

		  }

		  

  }

}



