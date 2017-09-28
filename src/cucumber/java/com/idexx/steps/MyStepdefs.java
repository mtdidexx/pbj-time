package com.idexx.steps;

import com.idexx.cuke.AdderUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {
    private int sum;
    private AdderUp svc = new AdderUp();

    @Given("^A working build$")
    public void aWorkingBuild() throws Throwable {
        // No-op
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void iAddAnd(int arg0, int arg1) throws Throwable {
        sum = svc.addUp(arg0, arg1);
    }

    @Then("^The result should be (\\d+)$")
    public void theResultShouldBe(int arg0) throws Throwable {
        assertEquals(arg0, sum);
    }
}
