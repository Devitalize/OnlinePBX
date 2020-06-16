package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.DialpadPageObject;
import lib.ui.android.AndroidDialpadPageObject;
import lib.ui.ios.IOSDialpadPageObject;

public class DialpadPageObjectFactory {

    public static DialpadPageObject get(AppiumDriver driver){
        if (Platform.getInstance().isAndroid()){
            return new AndroidDialpadPageObject(driver);
        } else {
            return new IOSDialpadPageObject(driver);
        }
    }
}
