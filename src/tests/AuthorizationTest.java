package tests;

import lib.CoreTestCase;
import lib.ui.AuthorizationPageObject;
import lib.ui.DialpadPageObject;
import lib.ui.factories.AuthorizationPageObjectFactory;
import lib.ui.factories.DialpadPageObjectFactory;
import org.junit.Test;


public class AuthorizationTest extends CoreTestCase {
    String login = "100@test8test.onpbx.ru";
    String password = "556898";


    @Test
    //Успешная авторизация
    public void testSuccessfulAuthorization()  {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);

        AuthorizationPageObject.loginSendKeys(login);
        AuthorizationPageObject.passwordSendKeys(password);
        AuthorizationPageObject.clickStartButton();
        AuthorizationPageObject.enablingPermissions();

        DialpadPageObject DialpadPageObject = DialpadPageObjectFactory.get(driver);
        DialpadPageObject.presenceGreenCallButton();
    }

    @Test
    //Ошибка при неверном пароле   !!!!!!!!!!!!!!!!!!!!Дописать, когда добавится ошибка или айдишник
    public void testIncorrectPassword(){
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.loginSendKeys(login);
        AuthorizationPageObject.passwordSendKeys("xfbxfb");
        AuthorizationPageObject.clickStartButton();
        System.out.println("Дописать, когда добавится ошибка" + "\n");
    }

    @Test
    //Ошибка при неверном логине   !!!!!!!!!!!!!!!!!!!!Дописать, когда добавится ошибка или айдишник
    public void testIncorrectLogin(){
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.loginSendKeys("grsrfgnpbx.ru");
        AuthorizationPageObject.passwordSendKeys(password);
        AuthorizationPageObject.clickStartButton();
        System.out.println("Дописать, когда добавится ошибка" + "\n");

    }

    @Test
    //Ошибка при пустом пароле   !!!!!!!!!!!!!!!!!!!!Дописать, когда добавится ошибка или айдишник
    public void testEmptyPassword(){
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.loginSendKeys(login);
        AuthorizationPageObject.clickStartButton();
        System.out.println("Дописать, когда добавится ошибка" + "\n");

    }

    @Test
    //Ошибка при пустом логине   !!!!!!!!!!!!!!!!!!!!Дописать, когда добавится ошибка или айдишник
    public void testEmptyLogin(){
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.passwordSendKeys(password);
        AuthorizationPageObject.clickStartButton();
        System.out.println("Дописать, когда добавится ошибка" + "\n");
    }

    @Test
    //Пользователя нет на домене   !!!!!!!!!!!!!!!!!!!!Дописать, когда добавится ошибка или айдишник
    public void testNonexistentLogin(){
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.loginSendKeys("398@test8test.onpbx.ru");
        AuthorizationPageObject.passwordSendKeys(password);
        AuthorizationPageObject.clickStartButton();
        System.out.println("Дописать, когда добавится ошибка" + "\n");
    }

}
