package lib.ui;

import io.appium.java_client.AppiumDriver;
import lib.ui.factories.DialpadPageObjectFactory;

abstract public class AuthorizationPageObject extends MainPageObject {
    protected static String
            LOGIN,
            PASSWORD,
            START_BUTTON,
            EYE_BUTTON,
            PERMISSIONS
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
                PERMISSIONS,
                "Не найдена кнопка подтверждения разрешений",
                15
        );
        this.waitForElementAndClick(
                PERMISSIONS,
                "Не удалось кликнуть на подтверждение разрешения. ",
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
