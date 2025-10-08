package Mentoring.Day03.task01.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public class CharacterValidationPage {

    public CharacterValidationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div/div[3]/form/p[1]/input[1]")
    public WebElement inputField;

    @FindBy(xpath = "/html/body/div/div[3]/form/p[2]/input")
    public WebElement validateButton;

    @FindBy(xpath = "/html/body/div/div[3]/form/p[1]/input[2]")
    public WebElement resultMessage;

    public void enterText(String text) {
        inputField.clear();
        inputField.sendKeys(text);
    }

    public void clickValidate() {
        validateButton.click();
    }

    public String getResultMessage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeToBeNotEmpty(resultMessage, "value"));

        String message = resultMessage.getAttribute("value").trim();
        System.out.println("Message detected: " + message);
        return message;
    }
    }
