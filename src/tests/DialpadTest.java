package tests;

import lib.CoreTestCase;
import lib.ui.AuthorizationPageObject;
import lib.ui.DialpadPageObject;
import lib.ui.NavigationUI;
import lib.ui.factories.AuthorizationPageObjectFactory;
import lib.ui.factories.DialpadPageObjectFactory;
import lib.ui.factories.NavigationUIFactory;
import org.junit.Test;

public class DialpadTest extends CoreTestCase {
    String login = "100@test8test.onpbx.ru";
    String password = "556898";

    @Test
    //Нажатие всех кнопок диалпада
    public void testClickingAllButtonDialpad() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.SuccessfulAuthorization(login, password);
        AuthorizationPageObject.enablingPermissions();

        DialpadPageObject DialpadPageObject = DialpadPageObjectFactory.get(driver);

        DialpadPageObject.clickAndHoldButtonDialpad("0");
        DialpadPageObject.clickButtonDialpad("1");
        DialpadPageObject.clickButtonDialpad("2");
        DialpadPageObject.clickButtonDialpad("3");
        DialpadPageObject.clickButtonDialpad("4");
        DialpadPageObject.clickButtonDialpad("5");
        DialpadPageObject.clickButtonDialpad("6");
        DialpadPageObject.clickButtonDialpad("7");
        DialpadPageObject.clickButtonDialpad("8");
        DialpadPageObject.clickButtonDialpad("9");
        DialpadPageObject.clickButtonDialpad("0");
        DialpadPageObject.clickButtonDialpad("*");
        DialpadPageObject.clickButtonDialpad("#");
    }
}
