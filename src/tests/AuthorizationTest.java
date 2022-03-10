package tests;

import lib.CoreTestCase;
import lib.ui.AuthorizationPageObject;
import lib.ui.factories.AuthorizationPageObjectFactory;
import org.junit.Test;


public class AuthorizationTest extends CoreTestCase {
    String login = "100@test8test8.test.onpbx.ru";
    String password = "556898";


    @Test
    //Успешная авторизация !!!!!!!ДОПИСАТЬ
    public void testSuccessfulAuthorization() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);

        AuthorizationPageObject.loginSendKeys(login);
        AuthorizationPageObject.passwordSendKeys(password);
        AuthorizationPageObject.clickStartButton();
        AuthorizationPageObject.enablingPermissions();
        System.out.println("ДОПИСАТЬ");

    }

    @Test
    //Ошибка при неверном пароле
    public void testIncorrectPassword() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.loginSendKeys(login);
        AuthorizationPageObject.passwordSendKeys("xfbxfb");
        AuthorizationPageObject.clickStartButton();

        AuthorizationPageObject.assertAuthorizationsTextError("Некорректный пароль");
    }

    @Test
    //Ошибка при неверном логине
    public void testIncorrectLogin() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.loginSendKeys("grsrfgnpbx.ru");
        AuthorizationPageObject.passwordSendKeys(password);
        AuthorizationPageObject.clickStartButton();
        AuthorizationPageObject.assertAuthorizationsTextError("Некорректный SIP-id");

    }

    @Test
    //Ошибка при пустом пароле
    public void testEmptyPassword() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.loginSendKeys(login);
        AuthorizationPageObject.clickStartButton();
        AuthorizationPageObject.assertAuthorizationsTextError("Поле не заполнено");

    }

    @Test
    //Ошибка при пустом логине
    public void testEmptyLogin() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.passwordSendKeys(password);
        AuthorizationPageObject.clickStartButton();
        AuthorizationPageObject.assertAuthorizationsTextError("Поле не заполнено");
    }

    @Test
    //Пользователя нет на домене
    public void testNonexistentLogin() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.loginSendKeys("398@test8test8.test.onpbx.ru");
        AuthorizationPageObject.passwordSendKeys(password);
        AuthorizationPageObject.clickStartButton();
        AuthorizationPageObject.assertAuthorizationsTextError("Некорректный логин пользователя");
    }

    @Test
    //Отсутствует интернет соединение
    public void testNoInternetConnection() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.loginSendKeys(login);
        AuthorizationPageObject.passwordSendKeys(password);
        AuthorizationPageObject.clickStartButton();
        AuthorizationPageObject.assertAuthorizationsTextError("Отсутствует подключение к интернету");

    }
}
