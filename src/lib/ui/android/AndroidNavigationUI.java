package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.NavigationUI;

public class AndroidNavigationUI extends NavigationUI {
    static {
        PAGE_HISTORY_FROM_CONTACTS = "xpath://android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]";
        PAGE_HISTORY_FROM_DIALPAD = "xpath://android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]";
        PAGE_HISTORY_FROM_PROFILE = "xpath://android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]";
        PAGE_DIALPAD_FROM_HISTORY = "xpath://android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]";
        PAGE_DIALPAD_FROM_CONTACTS = "xpath://android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]";
        PAGE_DIALPAD_FROM_PROFILE = "xpath://android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]";
        PAGE_CONTACTS_FROM_HISTORY = "xpath://android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]";
        PAGE_CONTACTS_FROM_DIALPAD = "xpath://android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]";
        PAGE_CONTACTS_FROM_PROFILE = "xpath://android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]";
        PAGE_PROFILE_FROM_CONTACTS = "xpath://android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]";
        PAGE_PROFILE_FROM_DIALPAD = "xpath://android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]";
        PAGE_PROFILE_FROM_HISTORY = "xpath://android.view.ViewGroup[4]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]";
        BUTTON_DND = "xpath://hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";
    }

    public AndroidNavigationUI(AppiumDriver driver) {
        super(driver);
    }
}


