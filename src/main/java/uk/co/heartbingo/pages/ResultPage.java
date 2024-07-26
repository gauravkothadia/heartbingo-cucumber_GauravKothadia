package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.heartbingo.utility.Utility;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class);

    @CacheLookup
    @FindBy(xpath = "//div[@class='casino-categories-result__header']//h2")
    WebElement resultHeader;

    @CacheLookup
    @FindBy(className = "bvs-applied-filter-tags")
    WebElement featureTag;

    public String getHeaderText(){
        String headerText = getTextFromElement(resultHeader);
        log.info("Getting the Result header text containing \""+headerText.split(" ")[0]+"\" for verification.");
        return headerText;
    }

    public String getFeatureText(){
        String featureText = getTextFromElement(featureTag);
        log.info("Getting the applied feature text displayed as \""+featureText+"\" for verification.");
        return featureText;
    }

}
