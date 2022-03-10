package lib.ui.android;

import io.appium.java_client.AppiumDriver;
import lib.ui.AuthorizationPageObject;

public class AndroidAuthorizationPageObject extends AuthorizationPageObject {
    static {
        LOGIN = "id:com.onlinepbx:id/inputtext_sip";
        PASSWORD = "id:com.onlinepbx:id/inputtext_password";
        START_BUTTON = "id:com.onlinepbx:id/button_login";
        EYE_BUTTON = "id:com.onlinepbx:id/text_input_end_icon";
        TEXT_ERROR = "id:com.onlinepbx:id/textinput_error";
        PERMISSIONS = "id:com.onlinepbx:id/button_action";
        PERMISSIONS_ALLOW_FOREGROUND_ONLY = "id:com.android.permissioncontroller:id/permission_allow_foreground_only_button";
        PERMISSIONS_ALLOW_CALL = "id:com.android.permissioncontroller:id/permission_allow_button";
        BUTTON_APP_ONPBX = "xpath://android.widget.LinearLayout[@content-desc=\"OnlinePBX\"]/android.widget.LinearLayout[2]";
        BUTTON_SWITCH_WIDGET = "id:android:id/switch_widget";
        PERMISSIONS_BUTTON_BACK = "xpath://android.widget.ImageButton[@content-desc=\"Back\"]";
        BUTTON_DO_NOT_SHOW = "id:android:id/button2";

    }

    public AndroidAuthorizationPageObject(AppiumDriver driver) {
        super(driver);
    }
}
