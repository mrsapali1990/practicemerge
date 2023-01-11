package com.ZP.pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.ZP.commons.BaseClass;

public class HomePage extends BaseClass{
	BaseClass b=new BaseClass();

	@FindBy(xpath="//input[@id=\"headerSearch\"]")
	WebElement search;

	@FindBy(xpath="//span[@class='h-s-v1 h-srh-i abs i-b c-p']")
	WebElement searchBtn;

	@FindBy(xpath="//div[@title='Honda SP 125 Ex-Showroom Price']")
	WebElement hondaprize;
	
	@FindBy(xpath="//div[@id=\"alternate-login-close\"]")
	WebElement popup;

	public HomePage()
	{
		PageFactory.initElements(b.driver, this);
	}

	public void search(String Manufacturer) throws Exception
	{
		String ActualTitle = driver.getTitle();
		String expTitle = "New Cars & Bikes, Prices, News, Reviews, Buy & Sell Used Cars - ZigWheels.com";
		Assert.assertEquals(ActualTitle, expTitle, "HomePage Open successfully!!");
		System.out.println("First Assertion passed........");
		System.out.println("I have done changes");
		
		search.sendKeys(Manufacturer);
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOf(popup));
		popup.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
	    wait1.until(ExpectedConditions.visibilityOf(searchBtn));
		searchBtn.click();
		//changes done
		
		//Logic lists of all Bikes and prize 

				List<WebElement> prize = driver.findElements(By.xpath("//div[@class=\"clr-bl\"]"));
				List<WebElement> Productlist = driver.findElements(By.xpath("//span[@class=\"lnk-hvr fnt-16 b block of-hid h-height\"]"));
				System.out.println("                                              ");
				//System.out.println("Total products on page is :"+Productlist.size());
				System.out.println("                                              ");
				System.out.println("done changes");
				System.out.println("changes 2");
				System.out.println("changes3");
				System.out.println("changes 4");
				System.out.println("changes 5");
				System.out.println("merge checkin1");


				for(int j=0;j<Productlist.size();j++) 
				{

				//	System.out.println(Productlist.get(j).getText()+":"+prize.get(j).getText());

				}

				//Logic for price below 4 lakhs

				System.out.println("                                              ");
				System.out.println("only Price 4 lakhs Below Bikes Selected ");
				System.out.println("                                              ");

				for(int i=0;i<Productlist.size();i++)
				{
					String str =prize.get(i).getText();

					//String str1=str.replaceAll("[^ 0-9 ]","");
					String str1=str.replaceAll("[^0-9]","");


					if (str1.length() == 10) {
						String lastfive = str1.substring(str1.length()-5);


						int foo;
						try {
							foo = Integer.parseInt(lastfive);
							//System.out.println(Productlist.get(i).getText()+":"+prize.get(i).getText());
							 if(foo<=400000){
								 System.out.println(Productlist.get(i).getText()+":"+prize.get(i).getText());
							}
//							 else {
//								 Assert.fail("Expected requirement not matching1");
//							 }
						}
						catch (NumberFormatException e) {
							foo = 0;

						}

					}
					else if (str1.length() == 8)
					{
						String lastfive = str1.substring(str1.length()-4);


						int foo;
						try {
							foo = Integer.parseInt(lastfive);

							String numberString = Integer.toString(foo);
							String firstLetterChar = numberString.substring(0,2);
							foo = Integer.parseInt(firstLetterChar);


							if(foo==4) {

								System.out.println(Productlist.get(i).getText()+":"+prize.get(i).getText());
							}
//							else {
//								 Assert.fail("Expected requirement not matching2");
//							 }
						}
						catch (NumberFormatException e) {
							foo = 0;

						}
					}
					else if (str1.length() == 6) 
					{
						String lastfive = str1.substring(str1.length()-3);

						int foo;
						try {
							foo = Integer.parseInt(lastfive);

							String numberString = Integer.toString(foo);
							String firstLetterChar = numberString.substring(0,1);
							foo = Integer.parseInt(firstLetterChar);

							if(foo<4) {

								System.out.println(Productlist.get(i).getText()+":"+prize.get(i).getText());
							}
//							else {
//								 Assert.fail("Expected requirement not matching3");
//							 }

						}
						catch (NumberFormatException e) {
							foo = 0;

						}
					}
					else if (str1.length() == 5) 
					{
						String lastfive = str1.substring(str1.length()-5);

						int foo;
						try {
							foo = Integer.parseInt(lastfive);

							String numberString = Integer.toString(foo);
							String firstLetterChar = numberString.substring(0,1);
							foo = Integer.parseInt(firstLetterChar);

							if(foo<4) {

								System.out.println(Productlist.get(i).getText()+":"+prize.get(i).getText());
							}
//							else {
//								 Assert.fail("Expected requirement not matching4");
//							 }

						}
						catch (NumberFormatException e) {
							foo = 0;

						}
					}
					else if (str1.length() == 4) 
					{
						String lastfive = str1.substring(str1.length()-4);

						int foo;
						try {
							foo = Integer.parseInt(lastfive);

							String numberString = Integer.toString(foo);
							String firstLetterChar = numberString.substring(0);
							foo = Integer.parseInt(firstLetterChar);


							if(foo<4) {

								System.out.println(Productlist.get(i).getText()+":"+prize.get(i).getText());
							}
//							else {
//								 Assert.fail("Expected requrment not matching5");
//							 }

						}
						catch (NumberFormatException e) {
							foo = 0;

						}

					}
					else if (str1.length() == 3) 
					{
						String lastfive = str1.substring(str1.length()-3);


						int foo;
						try {
							foo = Integer.parseInt(lastfive);

							String numberString = Integer.toString(foo);
							String firstLetterChar = numberString.substring(0,1);
							foo = Integer.parseInt(firstLetterChar);

							if(foo<4) {

								System.out.println(Productlist.get(i).getText()+":"+prize.get(i).getText());
							}
//							else {
//								 Assert.fail("Expected requrment not matching6");
//							 }

						}
						catch (NumberFormatException e) {
							foo = 0;

						}

					}

				}

			}
		}

