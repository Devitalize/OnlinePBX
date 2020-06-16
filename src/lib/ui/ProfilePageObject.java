package lib.ui;

import io.appium.java_client.AppiumDriver;
import lib.ui.factories.AuthorizationPageObjectFactory;
import lib.ui.factories.NavigationUIFactory;
import org.junit.Assert;

public class ProfilePageObject extends MainPageObject {
    protected static String
            EXIT,
            CONFIRM_EXIT,
            CANCEL_EXIT,
            DOMAIN,
            SIP_ID,
            DISPLAY_CONTACTS_ON,
            DISPLAY_CONTACTS_OF,
            ERROR_MESSAGE_BUTTON,
            ERROR_MESSAGE_INPUT,
            ERROR_MESSAGE_INPUT_TEXT,
            ERROR_MESSAGE_SUBMIT,
            BACK_BUTTON,
            REFRESH_CONNECTION,
            DND_BUTTON_PROFILE;

    public ProfilePageObject(AppiumDriver driver) {
        super(driver);
    }

    /* TEMPLATES METHODS */

    //Изменение подстроки для поиска домена
    private static String getTextDomain(String substring) {
        return DOMAIN.replace("{DOMAIN}", substring);
    }

    //Изменение подстроки для поиска текста в инпуте сообщения об ошибке
    private static String getTextErrorMessage(String substring) {
        return ERROR_MESSAGE_INPUT_TEXT.replace("{TEXT}", substring);
    }
    /* TEMPLATES METHODS */

    //Клик на кнопку выхода из аккаунта
    public void exitButtonClick() {
        this.waitForElementPresent(
                EXIT,
                "Не найдена кнопка выхода.",
                10
        );
        this.waitForElementAndClick(
                EXIT,
                "Не удалось нажать на кнопку выхода.",
                10
        );
    }

    //Подтверждение выхода из аккаунта
    public void clickConfirmExit() {
        this.waitForElementAndClick(
                CONFIRM_EXIT,
                "Не удалось кликнуть на подтверждение выхода",
                10
        );
    }

    //Отмена выхода из аккаунта
    public void clickCancelExit() {
        this.waitForElementAndClick(
                CANCEL_EXIT,
                "Не удалось кликнуть на отмену выхода",
                10
        );
    }

    //Выход из аккаунта успешный
    public void exitAccount() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        if(!AuthorizationPageObject.loginElementPresent()){
            NavigationUI NavigationUI = NavigationUIFactory.get(driver);
            NavigationUI.openPageProfile();
            this.exitButtonClick();
            this.clickConfirmExit();
            AuthorizationPageObject.loginElementPresent();
        }
    }

    //Получение текста из поля домена
    public void assertDomain(String domain) {
        String domain_xpath = this.getTextDomain(domain);
        this.waitForElementPresent(
                domain_xpath,
                "Не найден элемент с текстом домена при авторизации: " + domain,
                10
        );
    }

    //Получение текста из поля добавочного
    public void assertSipId(String sip_id) {
        String domain_xpath = this.getTextDomain(sip_id);
        this.waitForElementPresent(
                domain_xpath,
                "Не найден элемент с текстом SIP_ID при авторизации: " + sip_id,
                10
        );
    }

    //Переход в форму сообщения об ошибке
    public void openErrorMessage() {
        this.waitForElementAndClick(
                ERROR_MESSAGE_BUTTON,
                "Не найдена кнопка сообщения об ошибке",
                10
        );
    }

    //Клик на кнопку Назад
    public void clickButtonBack() {
        this.waitForElementPresent(
                BACK_BUTTON,
                "Не найдена кнопка Назад",
                10);
        this.waitForElementAndClick(
                BACK_BUTTON,
                "Не удалось кликнуть на кнопку Назад",
                10
        );
        if(this.isElementPresent(BACK_BUTTON)) {
            this.waitForElementAndClick(
                    BACK_BUTTON,
                    "Не удалось кликнуть на кнопку Назад",
                    10
            );
        }
    }

    //Ввод текста в поле сообщения об ошибке
    public void inputErrorMessageSendKeys(String text) {
        this.waitForElementAndSendKeys(
                ERROR_MESSAGE_INPUT,
                text,
                "Не удалось ввести текст в инпут сообщения об ошибке.",
                10
        );
    }

    //Получение текста из инпута сообщения об ошибке
    public void assertTextErrorMessage(String text) {
        String input_error_message_xpath = this.getTextErrorMessage(text);
        this.waitForElementPresent(
                input_error_message_xpath,
                "Не найден элемент с введённым в тесте текстом " + text,
                10
        );
    }
    //Клик на кнопку отправки сообщения об ошибке
    public void submitErrorMessage(){
        this.waitForElementAndClick(
                ERROR_MESSAGE_SUBMIT,
                "Не удалось кликнуть на отправку сообщения от ошибке",
                10
        );
    }
}
