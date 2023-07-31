package Way2Steps;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Way2Baseclass.BaseClass.driver;

public class RegistartionPage {
    int cell;


    @When("table and details show")
    public void table_and_details_show() {
        String innerContent = driver.findElement(By.xpath("//table[@table-title='Smart Table example']")).getText();
        System.out.println(innerContent + "This is home the content of home page's table printed");
    }


    @Then("user click add user ")
    public void user_click_add_user() {
        WebElement addUser = driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", addUser);


    }


    @Then("user click add user button")
    public void user_click_add_user_button() {
        WebElement addUser = driver.findElement(By.xpath("//button[@class='btn btn-link pull-right']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", addUser);


    }

    @Then("user enters {string} and {string} and {string} and {string}")
    public void userEntersAndAndAnd(String firstname, String lastname, String username, String password) {
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(firstname);
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lastname);
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);


    }

    @Then("user select companyAAA")
    public void userSelectCompanyAAA() {
        WebElement CompanyAAA = driver.findElement(By.xpath("//input[@value='15']"));
        CompanyAAA.click();
    }


    @Then("user select role")
    public void userSelectRole() {

        WebElement Admin = driver.findElement(By.name("RoleId"));
        Select select = new Select(Admin);
        select.selectByVisibleText("Admin");


    }


    @Then("user enters {string}")
    public void userEnters(String email) {
        //driver.findElement((By.name("Email"))).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
    }


    @Then("user enter <cell>")
    public void user_enter_cell() {
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("082555");
    }


    @Then("user select companyBBB")
    public void userSelectCompanyBBB() {
        WebElement CompanyBBB = driver.findElement(By.xpath("//input[@value='15']"));
        CompanyBBB.click();


    }

    @Then("user select role as customer")
    public void userSelectRoleAsCustomer() {

        WebElement Customer = driver.findElement(By.name("RoleId"));
        Select select = new Select(Customer);
        select.selectByVisibleText("Customer");

    }


    @Then("user click savebtn")
    public void user_click_savebtn() {
        WebElement saveBtn = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", saveBtn);

    }

    @Then("user is on home page")
    public void user_is_on_home_page() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.way2automation.com/angularjs-protractor/webtables/");

    }

    @Then("click searchone")
    public void click_searchone() {
        WebElement clickSearch = driver.findElement(By.xpath("/html/body/table/thead/tr[1]/td/input"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", clickSearch);

    }

    @Then("getusername")
    public void getusername() {
        WebElement showUserNameTwo = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[3]"));
        System.out.println("This is username found" + showUserNameTwo.getText());
    }



    @Then("get username")
    public void get_username() {
        WebElement showUserNameTwo = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[3]"));
        System.out.println("This is username found" + showUserNameTwo.getText());
    }





    @Then("input search one")
    public void inputSearchOne() {
        driver.findElement(By.xpath("/html/body/table/thead/tr[1]/td/input")).sendKeys("MissGee");


    }


    @Then("click searchtwo")
    public void click_searchtwo() {
        WebElement clickSearch = driver.findElement(By.xpath("/html/body/table/thead/tr[1]/td/input"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", clickSearch);

    }


    @Then("input search two")
    public void inputSearchTwo() {
        driver.findElement(By.xpath("/html/body/table/thead/tr[1]/td/input")).sendKeys("MrTumiso");

}

    @Then("getusernametwo")
    public void getusernametwo() {
        WebElement showUserNameTwo = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[3]"));
        System.out.println("This is username found" + showUserNameTwo.getText());
    }



    @Then("user enter <cell2>")
    public void user_enter_cell2() {
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("082444");
        }

    @Then("user enters {string} and {string} and {string}> and {string}")
    public void user_enters_and_and_and(String firstname2, String lastname2, String nickname, String password2) {
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(firstname2);
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(lastname2);
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys(nickname);
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password2);
    }


}















