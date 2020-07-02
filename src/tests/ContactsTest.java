package tests;

import lib.CoreTestCase;
import lib.ui.AuthorizationPageObject;
import lib.ui.ContactsPageObject;
import lib.ui.NavigationUI;
import lib.ui.factories.AuthorizationPageObjectFactory;
import lib.ui.factories.ContactsPageObjectFactory;
import lib.ui.factories.NavigationUIFactory;
import org.junit.Test;

public class ContactsTest extends CoreTestCase {
    String login = "100@test8test.onpbx.ru";
    String password = "556898";

    @Test
    //Отсутствие результатов поиска
    public void test123() {
        AuthorizationPageObject AuthorizationPageObject = AuthorizationPageObjectFactory.get(driver);
        AuthorizationPageObject.SuccessfulAuthorization(login, password);
        AuthorizationPageObject.enablingPermissions();
        NavigationUI NavigationUI = NavigationUIFactory.get(driver);
        NavigationUI.openPageContacts();

        ContactsPageObject ContactsPageObject = ContactsPageObjectFactory.get(driver);
        ContactsPageObject.inputSearchContactsClick();
        ContactsPageObject.inputSearchContactsSendKeys("1");
        ContactsPageObject.jfhgh();
        ContactsPageObject.assertAmountResults(4);
    }
}
