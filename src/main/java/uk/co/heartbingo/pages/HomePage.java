package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.heartbingo.utility.Utility;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement cookiesAcceptAllButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Categories']")
    WebElement categotiesButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='casino-filter__tag']/span")
    List<WebElement> casinoFilterTagName;

    @CacheLookup
    @FindBy(tagName = "button")
    List<WebElement> buttonsOnPage;

    @CacheLookup
    @FindBy(tagName = "a")
    List<WebElement> link;

    @CacheLookup
    @FindBy(className = "oneauth-iframe")
    WebElement loginFrame;

    @CacheLookup
    @FindBy(xpath = "//p[contains(@class,'login_formDescription')]")
    WebElement loginFrameText;

    public void clickOnAcceptAllButton(){
        clickOnElement(cookiesAcceptAllButton);
        log.info("Clicking on cookies consent Accept All button.");
    }

    public void clickOnCategoriesLink(){
        clickOnElement(categotiesButton);
        log.info("Clicking on Categories link.");
    }

    public void clickOnCasinoFilterTagNamed(String tagName){
        for(WebElement ele : casinoFilterTagName){
            if(getTextFromElement(ele).equalsIgnoreCase(tagName)){
                clickOnElement(ele);
                log.info("Clicked on the feature tage "+tagName);
                break;
            }
        }
    }

    public void clickOnButtonNamed(String containingText){
        for(WebElement ele : buttonsOnPage){
            if(getTextFromElement(ele).contains(containingText)){
                clickOnElement(ele);
                log.info("Clicked on the button displaying "+containingText);
                break;
            }
        }
    }

    public void clickingOnLoginLink(String linkContainingText){
        for(WebElement ele : link){
            if(getTextFromElement(ele).contains(linkContainingText)){
                clickOnElement(ele);
                log.info("Clicked on the button displaying "+linkContainingText);
                break;
            }
        }
    }

    public void switchingToLoginFrame(){
        switchingToFrame(loginFrame);
        log.info("Switching to Login Frame.");
    }

    public String getLoginFrameText(){
        String frameText = getTextFromElement(loginFrameText);
        log.info("Getting login frame text \""+frameText+"\" for verification.");
        return frameText;
    }

}
