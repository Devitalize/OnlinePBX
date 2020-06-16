package lib.ui.ios;

import io.appium.java_client.AppiumDriver;
import lib.ui.AuthorizationPageObject;

public class IOSAuthorizationPageObject extends AuthorizationPageObject {
    static {
        LOGIN = "";
        PASSWORD = "";
        START_BUTTON = "";
    }
    public IOSAuthorizationPageObject (AppiumDriver driver){
        super(driver);
    }
}
