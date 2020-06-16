package lib;

import io.appium.java_client.AppiumDriver;
import junit.framework.TestCase;
import lib.ui.ProfilePageObject;
import lib.ui.factories.ProfilePageObjectFactory;


public class CoreTestCase extends TestCase {
    protected AppiumDriver driver;

    @Override
    protected void setUp() throws Exception {
     super.setUp();
     driver = Platform.getInstance().getDriver();

    }

    @Override
    protected void tearDown() throws Exception {
        ProfilePageObject ProfilePageObject = ProfilePageObjectFactory.get(driver);
        ProfilePageObject.exitAccount();
        driver.quit();
        super.tearDown();
    }

}

