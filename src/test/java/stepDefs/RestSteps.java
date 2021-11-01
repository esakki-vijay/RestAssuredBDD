package stepDefs;

import common.DataProvider;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RestSteps {

	@Given("Post request done with {int}")
	public void post_request_done_with(int rowNum)  {
		
		common.RestCalls.postMethod(DataProvider.setUpData(rowNum));

	}

	@When("Get request for created ID")
	public void get_request_for_created_id() {

		System.out.println("get request");

	}

	@Then("Name of {int} is displayed")
	public void name_of_is_displayed(int int1) {

		System.out.println("get request verified");

	}

	@When("Put request for created ID")
	public void put_request_for_created_id() {

		System.out.println("put request");

	}

}
