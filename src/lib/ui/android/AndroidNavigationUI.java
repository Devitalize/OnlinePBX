package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.NavigationUI;

public class AndroidNavigationUI extends NavigationUI {
    static {
        PAGE_HISTORY = "xpath://android.widget.TextView[@text='История']";
        PAGE_DIALPAD = "xpath://android.widget.TextView[@text='Набор']";
        PAGE_CONTACTS = "xpath://android.widget.TextView[@text='Контакты']";
        PAGE_PROFILE = "xpath://android.widget.TextView[@text='Профиль']";
        BUTTON_DND = "xpath://hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";
    }

    public AndroidNavigationUI(AppiumDriver driver) {
        super(driver);
    }
}



