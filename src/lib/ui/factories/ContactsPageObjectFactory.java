package lib.ui.factories;

import io.appium.java_client.AppiumDriver;
import lib.Platform;
import lib.ui.ContactsPageObject;
import lib.ui.android.AndroidContactsPageObject;
import lib.ui.ios.IOSContactsPageObject;

public class ContactsPageObjectFactory {
    public static ContactsPageObject get(AppiumDriver driver){
        if (Platform.getInstance().isAndroid()){
            return new AndroidContactsPageObject(driver);
        } else {
            return new IOSContactsPageObject(driver);
        }
    }
}
