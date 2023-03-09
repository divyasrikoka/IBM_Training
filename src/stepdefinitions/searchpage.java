package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class searchpage {
	@Given("user is in Search page")
	public void navigateSearchPage() {
		System.out.println("we are in given section");
 }
 
	@When("user enter a product")
	public void enterProduct() {
		System.out.println("we are in when section");
}

	@And("Click on Search button")	
	public void clickSearch() {
		System.out.println("we are in and section");
}


	@Then("Product should be displayed")
	public void verifyProduct() {
		System.out.println("we are in then section");
}
}
