package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

abstract public class AuthorizationPageObject extends MainPageObject {
    protected static String
            LOGIN,
            PASSWORD,
            START_BUTTON,
            EYE_BUTTON,
            TEXT_ERROR,
            PERMISSIONS,
            PERMISSIONS_ALLOW_FOREGROUND_ONLY,
            PERMISSIONS_ALLOW_CALL,
            BUTTON_APP_ONPBX,
            BUTTON_SWITCH_WIDGET,
            PERMISSIONS_BUTTON_BACK,
            BUTTON_DO_NOT_SHOW
    ;

    public AuthorizationPageObject(AppiumDriver driver) {
        super(driver);
    }


    //Проверка, что появилось поле логина
    public boolean loginElementPresent(){
      return this.isElementPresent(LOGIN);

    }
    //Клик в поле логина
    public void clickLoginInput() {
        this.waitForElementPresent(
                LOGIN,
                "Не найдено поле логина.",
                10
        );
        this.waitForElementAndClick(
                LOGIN,
                "Не удалось кликнуть в поле логина.",
                10
        );
    }

    //Клик в поле пароля
    public void clickPasswordInput() {
        this.waitForElementAndClick(
                PASSWORD,
                "Не удалось кликнуть в поле пароля.",
                10
        );
    }

    //Клик на кнопку входа
    public void clickStartButton() {
        this.waitForElementAndClick(
                START_BUTTON,
                "Не удалось кликнуть на кнопку Войти.",
                10
        );
    }

    //Ввод логина
    public void loginSendKeys(String login) {
        this.waitForElementAndSendKeys(
                LOGIN,
                login,
                "Не удалось ввести текст в поле логина",
                10
        );
    }

    //Ввод пароля
    public void passwordSendKeys(String password) {
        this.waitForElementAndSendKeys(
                PASSWORD,
                password,
                "Не удалось ввести текст в поле пароля.",
                10
        );
    }

    //Клик на кнопку отображения пароля(глаз)
    public void eyeButtonClick(){
        this.waitForElementAndClick(
                EYE_BUTTON,
                "Не удалось кликнуть на кнопку отображения пароля.",
                10
        );
    }

    //Проверка текста ошибки при неверном вводе логина/пароля
    public void assertAuthorizationsTextError(String text_error_message){
        WebElement text_error = this.waitForElementPresent(
                TEXT_ERROR,
                "Не найдено поле с ошибкой авторизации",
                10
        );
        String text_attribute_error_message = this.waitForElementAndGetAttribute(TEXT_ERROR,
                 "text",
                 "Не найден атрибут text у поля с ошибкой авторизации",
         10);
        assertEquals(text_error_message,
                text_attribute_error_message);
    }

    //Включение разрешений
    public void enablingPermissions(){
        this.waitForElementPresent(
                PERMISSIONS,
                "Не найдена кнопка подтверждения разрешений",
                15
        );
        this.waitForElementAndClick(
                PERMISSIONS,
                "Не удалось кликнуть на подтверждение разрешения. ",
                15
        );
        this.waitForElementPresent(
                PERMISSIONS_ALLOW_FOREGROUND_ONLY,
                "Не найдена кнопка подтверждения разрешения на запись аудио",
                15
        );
        this.waitForElementAndClick(
                PERMISSIONS_ALLOW_FOREGROUND_ONLY,
                "Не удалось кликнуть на подтверждение разрешения на запись аудио. ",
                10
        );
        this.waitForElementPresent(
                PERMISSIONS_ALLOW_CALL,
                "Не найдена кнопка подтверждения разрешения на совершение звонков",
                15
        );
        this.waitForElementAndClick(
                PERMISSIONS_ALLOW_CALL,
                "Не удалось кликнуть на подтверждение разрешения на совершение звонков. ",
                10
        );
        this.waitForElementPresent(
                BUTTON_APP_ONPBX,
                "Не найдено приложение OnlinePBX в списке приложений для предоставление доступа поверх других приложений",
                15
        );
        this.waitForElementAndClick(
                BUTTON_APP_ONPBX,
                "Не удалось кликнуть на приложение OnlinePBX в списке приложений для предоставление доступа поверх других приложений. ",
                10
        );
        this.waitForElementPresent(
                BUTTON_SWITCH_WIDGET,
                "Не найден чек-бокс для предоставления доступа поверх других приложений",
                15
        );
        this.waitForElementAndClick(
                BUTTON_SWITCH_WIDGET,
                "Не удалось кликнуть на чекбокс для предоставление доступа поверх других приложений. ",
                10
        );
        this.waitForElementPresent(
                PERMISSIONS_BUTTON_BACK,
                "Не найдена кнопка Назад",
                15
        );
        this.waitForElementAndClick(
                PERMISSIONS_BUTTON_BACK,
                "Не удалось кликнуть на кнопку Назад ",
                10
        );
        this.waitForElementPresent(
                PERMISSIONS_BUTTON_BACK,
                "Не найдена кнопка Назад",
                15
        );
        this.waitForElementAndClick(
                PERMISSIONS_BUTTON_BACK,
                "Не удалось кликнуть на кнопку Назад ",
                10
        );
        this.waitForElementPresent(
                BUTTON_DO_NOT_SHOW,
                "Не найдена кнопка Не показывать",
                15
        );
        this.waitForElementAndClick(
                BUTTON_DO_NOT_SHOW,
                "Не удалось кликнуть на кнопку Не показывать ",
                10
        );

    }

    //Успешная авторизация
    public void SuccessfulAuthorization(String login, String password){
        this.waitForElementPresent(
                LOGIN,
                "Не найдено поле логина.",
                20
        );
        this.loginSendKeys(login);
        this.passwordSendKeys(password);
        this.clickStartButton();
    }
}

