package Assignments.Assignment1.Task01.stepdefinitions;

import Assignments.Assignment1.Task01.page.NotesPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import utilities.Driver;
import java.util.List;
import java.util.Map;

public class NotesSteps {
    NotesPage page = new NotesPage();

    @Given("user goes to {string}")
    public void user_goes_to(String url) {
        Driver.getDriver().get(url);
    }

    @When("user adds 10 different notes:")
    public void user_adds_10_different_notes(DataTable dataTable) {
        List<Map<String, String>> notes = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> note : notes) {
            String title = note.get("title");
            String text = note.get("note");

            page.enterTitle(title);
            page.enterNoteText(text);
            page.clickAddButton();

            System.out.println("Added note: " + title);
        }
    }

    @Then("all notes should be visible in the list")
    public void all_notes_should_be_visible_in_the_list() {
        List<String> displayedTitles = page.getAllNoteTitles();
        Assert.assertTrue("Not all notes are displayed!", displayedTitles.size() >= 10);
        }

    @Then("user closes the browser")
    public void user_closes_the_browser() {
        Driver.quitDriver();
    }
}