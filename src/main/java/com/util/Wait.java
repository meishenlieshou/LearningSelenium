package com.util;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	private WebDriver driver = null;
	private int timeout = 10;
	
	public Wait( WebDriver driver){
     
		this.driver = driver;	
    }
	
	public void WaitElementPresent(String element){
		long startTime=System.currentTimeMillis(); //计时器开始计时
		
		(new WebDriverWait(driver,timeout)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
		
		long endTime=System.currentTimeMillis();//计时器结束计时
		
		System.out.println("element can be located  in"+(endTime-startTime)+"ms");
	}
	public void WaitElementenable(String element){
		long startTime=System.currentTimeMillis(); 
		
		(new WebDriverWait(driver,timeout)).until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
		
		long endTime=System.currentTimeMillis();
		
		System.out.println("element can be clicked  in"+(endTime-startTime)+"ms");
	}
	public void Wait(long timeout){
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
