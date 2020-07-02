package tests;

import lib.CoreTestCase;
import lib.ui.AuthorizationPageObject;
import lib.ui.MainPageObject;import lib.ui.NavigationUI;
import lib.ui.factories.AuthorizationPageObjectFactory;
import lib.ui.factories.NavigationUIFactory;
import org.junit.Test;

public class NavigationTest extends CoreTestCase {

    String login = "100@test8test.onpbx.ru";
    String password = "556898";

    @Test
    //Переход по главным страницам
    public void testOpenPage() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.SuccessfulAuthorization(login, password);
        AuthorizationPageObject.enablingPermissions();

        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.openPageHistory();
        NavigationUI.openPageContacts();
        NavigationUI.openPageDialpad();
        NavigationUI.openPageProfile();
    }
}
