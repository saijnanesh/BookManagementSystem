package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingDeleteOrder {

	WebDriver driver;
	
@Given("^User is in the Order Page$")
public void user_is_in_the_Order_Page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\selenium software\\chromedriver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://localhost:4200/displayorder");
    driver.manage().window().maximize();
}

@When("^User clicks on getList$")
public void user_clicks_on_getList() throws Throwable {
	driver.findElement(By.xpath("//button[@class='btn-primary']")).click();

}

@When("^User click on the cancel Order$")
public void user_click_on_the_cancel_Order() throws Throwable {
	WebDriverWait myWait = new WebDriverWait(driver, 10); //explicit wait
	 myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[4]/td[10]/button[1]"))).click();
//	 driver.findElement(By.xpath("//tbody/tr[4]/td[10]/button[1]")).click();

}

@Then("^User get to see in orders that order is cancelled$")
public void user_get_to_see_in_orders_that_order_is_cancelled() throws Throwable {
	System.out.println("OrderCancelled!!!");
}


}
