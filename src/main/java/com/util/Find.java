package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Find {

	private WebDriver driver = null;
	
	public Find(){
		this.driver = driver;
	}
	
	public void findById(String id){
		
		
		driver.findElement(By.id(id)).click();
		
	}
	public void findByLinkText(String linkText){
		
		
		driver.findElement(By.linkText(linkText)).click();
		
	}
	
	public void findByName(String name){
		
		
		driver.findElement(By.name(name)).click();
		
	}
	
	public void findByXpth(String xpath){
		
		
		driver.findElement(By.xpath(xpath)).click();
		
	}
	
	public void SendKys(String id,String word){
		
		driver.findElement(By.id(id)).sendKeys(word);
		
	}
	
	public void findPoint(String locate){
		
		Point located = driver.findElement(By.xpath(locate)) .getLocation();
		System.out.println("loaced in"+"("+located.getX()+","+located.getY()+")");
		
	}
}
