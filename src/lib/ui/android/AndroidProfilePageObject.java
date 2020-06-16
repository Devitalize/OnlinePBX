package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.ProfilePageObject;

public class AndroidProfilePageObject extends ProfilePageObject {
    static {
        EXIT = "xpath://android.widget.TextView[@text='Выход']"; //"xpath://android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[7]";
        CONFIRM_EXIT = "xpath://android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
        CANCEL_EXIT = "xpath://android.widget.TextView[@text='Отмена']";
        DOMAIN = "xpath://android.widget.TextView[@text='{DOMAIN}']";
        SIP_ID = "xpath://android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]";
        DISPLAY_CONTACTS_ON = "xpath://android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView";
        DISPLAY_CONTACTS_OF = "";//Пока одинаковый со включением
        ERROR_MESSAGE_BUTTON = "xpath://android.widget.TextView[@text='Сообщить об ошибке']";
        ERROR_MESSAGE_INPUT = "xpath://android.widget.EditText[@text='Текст ошибки...']";
        ERROR_MESSAGE_INPUT_TEXT = "xpath://android.widget.EditText[@text='{TEXT}']";
        ERROR_MESSAGE_SUBMIT = "xpath://android.widget.TextView[@text='Отправить']";
        BACK_BUTTON = "xpath://android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup";
        REFRESH_CONNECTION = "xpath://android.widget.TextView[@text='Обновить подключение']";
        DND_BUTTON_PROFILE = "xpath://hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";
    }

    public AndroidProfilePageObject(AppiumDriver driver) {
        super(driver);
    }
}


