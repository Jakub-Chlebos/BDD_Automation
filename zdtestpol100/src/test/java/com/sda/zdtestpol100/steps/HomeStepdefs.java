package com.sda.zdtestpol100.steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepdefs {

    @And("I click on Dress page link")
    public void iClickOnDressPageLink() {

    }

    @When("I add to cart {string}")
    public void iAddToCart(String dressName) {

    }

    @Then("Shopping card is opened")
    public void shoppingCardIsOpened() {

    }

    @And("I see dress name and price")
    public void iSeeDressNameAndPrice(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> columns : rows) {
            System.out.println(" \nThis is name of dress: " + columns.get("name"));
            System.out.println("\nThis is price of dress: " + columns.get("price"));
        }

    }

    @And("I can see quantity of dresses equals {int}")
    public void iCanSeeQuantityOfDressesEquals(int number) {

    }

}
