package Assignments.Assignment1.Task01.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class NotesPage {
    public NotesPage() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "note-title-input")
    public WebElement titleInput;

    @FindBy(id = "note-details-input")
    public WebElement noteInput;

    @FindBy(id = "add-note")
    public WebElement addButton;

    @FindBy(xpath = "//*[@id=\"list-of-notes\"]/div/p")
    public List<WebElement> noteList;

    public void enterTitle(String title) {
        titleInput.clear();
        titleInput.sendKeys(title);
    }

    public void enterNoteText(String note) {
        noteInput.clear();
        noteInput.sendKeys(note);
    }

    public void clickAddButton() {
        addButton.click();
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElements(noteList));
    }

    public List<String> getAllNoteTitles() {
        return noteList.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}