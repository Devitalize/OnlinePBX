package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.AuthorizationPageObject;

public class AndroidAuthorizationPageObject extends AuthorizationPageObject {
    static {
        LOGIN = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[1]";
        PASSWORD = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.EditText[2]";
        START_BUTTON = "xpath://android.widget.TextView[@text='ВОЙТИ']";
        EYE_BUTTON = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";
        PERMISSIONS = "id:com.android.packageinstaller:id/permission_allow_button";

    }

    public AndroidAuthorizationPageObject(AppiumDriver driver) {
        super(driver);
    }
}
