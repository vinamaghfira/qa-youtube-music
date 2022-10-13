package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchYoutube {
    WebDriver driver;
    @Given("I Open browser")
    public void iOpenBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open website Youtube")
    public void openWebsiteYoutube() throws InterruptedException{
        driver.get("https://music.youtube.com/");
        Thread.sleep(1000);
    }

    @And("Located on youtube website")
    public void locatedOnYoutubeWebsite() {
//        driver.findElement(By.tagName("input[id='input']"));
//        driver.findElement(By.name("q")).isDisplayed();
        driver.findElement(By.tagName("ytmusic-search-box")).click();
    }

    @When("I search {string}")
    public void iSearch(String searchValue) {
//        driver.findElement(By.tagName("input[id='input']")).sendKeys(searchValue, Keys.ENTER);
        driver.findElement(By.tagName("ytmusic-search-box")).findElement(By.id("input")).sendKeys(searchValue, Keys.ENTER);
    }

    @Then("Showing result related with {string}")
    public void showingResultRelatedWith(String result) {
        driver.navigate().to(result);
    }
}
