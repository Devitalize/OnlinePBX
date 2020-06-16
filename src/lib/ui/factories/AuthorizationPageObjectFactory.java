package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.AuthorizationPageObject;
import lib.ui.android.AndroidAuthorizationPageObject;
import lib.ui.ios.IOSAuthorizationPageObject;

public class AuthorizationPageObjectFactory {

    public static AuthorizationPageObject get(AppiumDriver driver){
        if (Platform.getInstance().isAndroid()){
            return new AndroidAuthorizationPageObject(driver);
        } else {
            return new IOSAuthorizationPageObject(driver);
        }
    }
}
