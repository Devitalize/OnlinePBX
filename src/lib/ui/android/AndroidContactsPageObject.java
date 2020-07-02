package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.ContactsPageObject;

public class AndroidContactsPageObject extends ContactsPageObject {
    static {
        SEARCH_CONTACT_INPUT = "xpath://android.widget.EditText[@text='Найти контакт...']";
        RESULTS_SEARCH_CONTACT_NAME = "xpath://android.widget.TextView[@text='{CONTACT_NAME}']";
        RESULTS_SEARCH_CONTACT_NUMBER = "xpath://android.widget.TextView[@text='{CONTACT_NUMBER}']";
        ALL_SEARCH_RESULTS = "xpath://android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup";
        NO_RESULT_SEARCH_CONTACTS = "xpath://android.widget.TextView[@text='Нет контактов с таким номером/именем']";
        DND_BUTTON = "";
        OPEN_CONTACT_NAME = "";
        OPEN_CONTACT_NUMBER = "";
        CALL_BUTTON_IN_OPEN_CONTACT = "";
        BACK_BUTTON = "";
    }

    public AndroidContactsPageObject(AppiumDriver driver) {
        super(driver);
    }
}
