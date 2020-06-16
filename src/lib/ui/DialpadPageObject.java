package lib.ui;

import io.appium.java_client.AppiumDriver;

public class DialpadPageObject extends MainPageObject {
    protected static String
            GREEN_CALL_BUTTON,
            BUTTON_DIALPAD_TPL;

    public DialpadPageObject(AppiumDriver driver) {
        super(driver);
    }

    /* TEMPLATES METHODS */

    //Изменение подстроки для поиска нужного заголовка
    private static String getButtonDialpad(String substring) {
        return BUTTON_DIALPAD_TPL.replace("{SUBSTRING}", substring);
    }

    public void presenceGreenCallButton() {
        this.waitForElementPresent(GREEN_CALL_BUTTON,
                "Не найдена зелёная кнопка вызова.",
                10);
    }

    public void clickButtonDialpad(String substring) {

        String button_result_xpath = getButtonDialpad(substring);
        this.waitForElementAndClick(
                button_result_xpath,
                "Не удалось нажать на кнопку " + substring,
                10
        );
    }

    public void clickAndHoldButtonDialpad(String substring) {

        String button_result_xpath = getButtonDialpad(substring);
        this.waitForElementAndClickAndHold(
                button_result_xpath,
                "Не удалось нажать на кнопку " + substring,
                10
        );
    }
}
