package com.example;

import java.lang.module.FindException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com");
//		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("problem_user");
//		driver.findElement(By.cssSelector("#user-name")).sendKeys("performance_glitch_user");
//		driver.findElement(By.className("form_input")).sendKeys("locked_out_user");
//		driver.findElement(By.tagName("input")).sendKeys("error_user");
		driver.findElement(By.name("user-name")).sendKeys("visual_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//driver.findElement(By.id("login-button")).submit();
		
		//driver.get("https://www.selenium.dev/documentation/");
		//driver.findElement(By.linkText("Overview")).click();
		//driver.findElement(By.partialLinkText("Manager")).click();
		
		//if element has same tag name
//		WebElement pass = driver.findElement(By.id("password"));
//		By un = RelativeLocator.with(By.tagName("input")).above(pass);
//		driver.findElement(un).sendKeys("error_user");
		
		driver.findElement(By.id("login-button")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
//		loginButton.click();
		//Thread.sleep(5000);
		
		//driver.findElement(By.id("item_4_title_link")).click();
//		
		Actions actions = new Actions(driver);
		WebElement firstItem = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]"));
		actions.moveToElement(firstItem).perform();
		
		firstItem.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
//		
//		firstItem.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
//		Thread.sleep(3000);
		
		WebElement sortDropDown = driver.findElement(By.className("product_sort_container"));
		Select select = new Select(sortDropDown);
		select.selectByVisibleText("Price (low to high)");
		Thread.sleep(4000);
		
		
		WebElement item2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]"));
		actions.moveToElement(item2).perform();
		item2.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		Thread.sleep(4000);

		
		WebElement cartButton = driver.findElement(By.className("shopping_cart_badge"));
		cartButton.click();
		Thread.sleep(4000);

		
		WebElement checkoutBtn = driver.findElement(By.id("checkout"));
		checkoutBtn.click();
		Thread.sleep(4000);

		
		WebElement firstName = driver.findElement(By.id("first-name"));
		WebElement lastName = driver.findElement(By.id("last-name"));
		WebElement postalCode = driver.findElement(By.id("postal-code"));
		
		firstName.sendKeys("Milo");
		lastName.sendKeys("McQueen");
		postalCode.sendKeys("123456");
		Thread.sleep(4000);

		
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		Thread.sleep(4000);

				
		WebElement finishBtn = driver.findElement(By.id("finish"));
		finishBtn.click();
		Thread.sleep(4000);

		
		WebElement orderConfirm = driver.findElement(By.className("complete-header"));
		if(orderConfirm.getText().equals("Thank you for your order!")) {
			System.out.println("Order placed successfully");
			Thread.sleep(4000);
		}
		else {
			System.out.println("order placement failed, try again");
		}
		
		List<WebElement> items = driver.findElements(By.className("inventory_item"));
		System.out.println("Number of items: "+items.size());
		Thread.sleep(5000);
		
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		Thread.sleep(1500);
//		driver.findElement(By.id("logout_sidebar_link")).click();
//		Thread.sleep(3000);
	}

}
