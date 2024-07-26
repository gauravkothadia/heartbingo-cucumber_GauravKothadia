package uk.co.heartbingo.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import uk.co.heartbingo.propertyreader.PropertyReader;
import uk.co.heartbingo.utility.Utility;

public class Hooks extends Utility { //----Hooks is the BaseTest.java file
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario){ //---the method always runs, hence it is good place to catch the screenshot of failed tests
        if(scenario.isFailed()){
            final byte[] screenshot = getScreenShot();
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        closeBrowser();
    }
}
