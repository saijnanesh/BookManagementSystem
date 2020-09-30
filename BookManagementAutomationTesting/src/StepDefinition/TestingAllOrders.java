package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingAllOrders {
	
WebDriver driver;	

@Given("^User is in the home page$")
public void user_is_in_the_home_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\selenium software\\chromedriver\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("http://localhost:4200");
    driver.manage().window().maximize();
}

@When("^User clicks on order$")
public void user_clicks_on_order() throws Throwable {
	driver.findElement(By.xpath("//button[contains(text(),'Orders')]")).click();
}

@When("^User clicks on getlist$")
public void user_clicks_on_getlist() throws Throwable {
driver.findElement(By.xpath("//button[@class='btn-primary']")).click();
}

@Then("^User should be able to see all the orders$")
public void user_should_be_able_to_see_all_the_orders() throws Throwable {
	System.out.println("Yes Orders!!!! ");
}


}
