package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver = RunnerClass.driver;

	@Given("^User Launch The Addactin Application$")
	public void user_Launch_The_Addactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^User Enter the Username In Username Field$")
	public void user_Enter_the_Username_In_Username_Field() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("RaviK1234");
	}

	@When("^User Enter the Password In Password Field$")
	public void user_Enter_the_Password_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Ravi@1996");
	}

	@Then("^User Click The Login Button And It Navigate To Searc Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigate_To_Searc_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(7000);
	}
	@When("^User Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		WebElement Locations = driver.findElement(By.id("location"));
		Select s = new Select(Locations);
		s.selectByIndex(2);
	}

	@When("^User Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Hervey");
		
	}

	@When("^User Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2 = new Select(roomType);
		s2.selectByVisibleText("Deluxe");
	}

	@When("^User Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		WebElement Adults = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(Adults);
		s3.selectByIndex(5);
	}

	@When("^User Select The Check-In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		WebElement datae_in = driver.findElement(By.id("datepick_in"));
		datae_in.clear();
		WebElement date_in1 = driver.findElement(By.id("datepick_in"));
		date_in1.sendKeys("10/05/2022");
	}

	@When("^User Select The Check-Out-Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		WebElement date_out = driver.findElement(By.id("datepick_out"));
		date_out.clear();
		WebElement date_out1 = driver.findElement(By.id("datepick_out"));
		date_out1.sendKeys("12/05/2022");
	}

	@When("^User Select Adults per Room$")
	public void user_Select_Adults_per_Room() throws Throwable {
		WebElement persons = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(persons);
		s4.selectByValue("3");
	}

	@When("^User Chilldren per Rooms$")
	public void user_Chilldren_per_Rooms() throws Throwable {
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByIndex(4);
		
	}

	@Then("^User Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	}
	@When("^User Select The Radio Button$")
	public void user_Select_The_Radio_Button() throws Throwable {
		WebElement sel = driver.findElement(By.id("radiobutton_0"));
		sel.click();	
	}

	@Then("^User Click The Continue Button And Its Navigate To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_Its_Navigate_To_Book_A_Hotel_Page() throws Throwable {
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
	}

	@When("^User Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		WebElement Fname = driver.findElement(By.xpath("//input[@id='first_name']"));
		Fname.sendKeys("Ravi");
	}

	@When("^User Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		WebElement lName = driver.findElement(By.xpath("//input[@id='last_name']"));
		lName.sendKeys("K");
	}

	@When("^User Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Gandhi Nagar,Gujarat");
	}

	@When("^User Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		WebElement card = driver.findElement(By.xpath("//input[@id='cc_num']"));
		card.sendKeys("9876373782121283");
	}

	@When("^User Enter The Credit Card Type$")
	public void user_Enter_The_Credit_Card_Type() throws Throwable {
		WebElement cardType = driver.findElement(By.xpath("//select[@class='select_combobox']"));
		Select s6 = new Select(cardType);
		s6.selectByVisibleText("VISA");
	}

	@When("^User Enter The Expiry Date$")
	public void user_Enter_The_Expiry_Date() throws Throwable {
		WebElement expairy = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s7 = new Select(expairy);
		s7.selectByIndex(4);
	}

	@When("^User Enter The Expiry Year$")
	public void user_Enter_The_Expiry_Year() throws Throwable {
		WebElement expairyyear = driver.findElement(By.xpath("//select[@class='select_combobox2'][2]"));
		Select s8 = new Select(expairyyear);
		s8.selectByVisibleText("2021");
	}

	@When("^User Enter The CVV Number$")
	public void user_Enter_The_CVV_Number() throws Throwable {
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys("074");
	}

	@Then("^User Click The Book And It Navigates To  Select Book Now$")
	public void user_Click_The_Book_And_It_Navigates_To_Select_Book_Now() throws Throwable {
		WebElement book = driver.findElement(By.xpath("//input[@id='book_now']"));
		book.click();
		Thread.sleep(8000);
	}
	@Then("^User Click Logout And Navigates To Successfully Logout Page$")
	public void user_Click_Logout_And_Navigates_To_Successfully_Logout_Page() throws Throwable {
		WebElement log = driver.findElement(By.xpath("//input[@id='logout']"));
		log.click();

	}
}
