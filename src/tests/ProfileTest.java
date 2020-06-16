package tests;

import lib.CoreTestCase;
import lib.ui.AuthorizationPageObject;
import lib.ui.NavigationUI;
import lib.ui.ProfilePageObject;
import lib.ui.factories.AuthorizationPageObjectFactory;
import lib.ui.factories.NavigationUIFactory;
import lib.ui.factories.ProfilePageObjectFactory;
import org.junit.Test;


public class ProfileTest extends CoreTestCase {

    String sip_id = "100";
    String domain = "test8test.onpbx.ru";
    String login = sip_id + "@" + domain;
    String password = "556898";

    //Выход из аккаунта
    @Test
    public void testLogout() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.SuccessfulAuthorization(login, password);
        AuthorizationPageObject.enablingPermissions();

        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.openPageProfile();

        ProfilePageObject ProfilePageObject = ProfilePageObjectFactory.get(driver);
        ProfilePageObject.exitButtonClick();
        ProfilePageObject.clickConfirmExit();

        AuthorizationPageObject.loginElementPresent();
    }

    //Отмена выхода из аккаунта
    @Test
    public void testCancelLogout() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.SuccessfulAuthorization(login, password);
        AuthorizationPageObject.enablingPermissions();

        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.openPageProfile();

        ProfilePageObject ProfilePageObject = ProfilePageObjectFactory.get(driver);
        ProfilePageObject.exitButtonClick();
        ProfilePageObject.clickCancelExit();
    }


    //проверка текста в поле домена
    @Test
    public void testAssertDomain() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.SuccessfulAuthorization(login, password);
        AuthorizationPageObject.enablingPermissions();

        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.openPageProfile();

        ProfilePageObject ProfilePageObject = ProfilePageObjectFactory.get(driver);

        ProfilePageObject.assertDomain(domain);
    }

    //Проверка текста в поле добавочного
    @Test
    public void testAssertSipId() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.SuccessfulAuthorization(login, password);
        AuthorizationPageObject.enablingPermissions();

        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.openPageProfile();

        ProfilePageObject ProfilePageObject = ProfilePageObjectFactory.get(driver);

        ProfilePageObject.assertDomain("tfuyf");
    }


    //Включение отображения контактов
    //Отключение отображения контактов


    //Переход в форму сообщения об ошибке
    @Test
    public void testOpenErrorMessage() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.SuccessfulAuthorization(login, password);
        AuthorizationPageObject.enablingPermissions();

        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.openPageProfile();

        ProfilePageObject ProfilePageObject = ProfilePageObjectFactory.get(driver);
        ProfilePageObject.openErrorMessage();
        ProfilePageObject.clickButtonBack();
    }

    //Ввод различных символов, букв и цифр в поле сообщения об ошибке
    @Test
    public void testInputErrorMessage() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.SuccessfulAuthorization(login, password);
        AuthorizationPageObject.enablingPermissions();

        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.openPageProfile();

        ProfilePageObject ProfilePageObject = ProfilePageObjectFactory.get(driver);
        ProfilePageObject.openErrorMessage();
        String text = "qwerty uiop asdf ghjk lzxc vbnm йцуке нгшщзх ъфыва прол джэяч смитьбюё !№;%:?)(ЪХЭЖБЮ)";
        ProfilePageObject.inputErrorMessageSendKeys(text);
        ProfilePageObject.assertTextErrorMessage(text);
        ProfilePageObject.clickButtonBack();
    }

    //Отправка сообщения об ошибке
    @Test
    public void testSendingErrorMessage() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.SuccessfulAuthorization(login, password);
        AuthorizationPageObject.enablingPermissions();

        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.openPageProfile();

        ProfilePageObject ProfilePageObject = ProfilePageObjectFactory.get(driver);
        ProfilePageObject.openErrorMessage();
        String text = "Тестовое сообщение об ошибке.";
        ProfilePageObject.inputErrorMessageSendKeys(text);
        ProfilePageObject.submitErrorMessage();
        ProfilePageObject.clickButtonBack();
    }
    //Отправка сообщения при отсутствии интернета
    //Обновление подключения
    //Включение и отключение ДНД в профиле
}

