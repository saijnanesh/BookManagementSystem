package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingOrderUpdate {

	WebDriver driver;
	
@Given("^User is in the OrderPage$")
public void user_is_in_the_OrderPage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\selenium software\\chromedriver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://localhost:4200/displayorder");
    driver.manage().window().maximize();
   }

@When("^User clicks on getThelist button$")
public void user_clicks_on_getThelist_button() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn-primary']")).click();

}

@When("^User clicks on UpdateOrder$")
public void user_clicks_on_UpdateOrder() throws Throwable {
	WebDriverWait myWait = new WebDriverWait(driver, 10); //explicit wait
	 myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[4]/td[9]/button[1]"))).click();  }

@When("^User will select his respected status$")
public void user_will_select_his_respected_status() throws Throwable {
	driver.findElement(By.xpath("//option[contains(text(),'Delivered')]")).click();
}

@When("^User will click on the Update button$")
public void user_will_click_on_the_Update_button() throws Throwable {
	driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
}

@Then("^User will navigate backs to the Orderpage and sees the order got updated$")
public void user_will_navigate_backs_to_the_Orderpage_and_sees_the_order_got_updated() throws Throwable {
	System.out.println("Hey Order Updated!!!");
}
}
