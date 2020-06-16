package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.DialpadPageObject;

public class AndroidDialpadPageObject extends DialpadPageObject {
    static {
        GREEN_CALL_BUTTON = "xpath:/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[15]";
        BUTTON_DIALPAD_TPL = "xpath://android.widget.TextView[@text='{SUBSTRING}']";
    }

    public AndroidDialpadPageObject(AppiumDriver driver) {
        super(driver);
    }
}
