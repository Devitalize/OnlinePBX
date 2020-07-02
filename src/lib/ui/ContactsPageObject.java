package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.junit.Assert;

public class ContactsPageObject extends MainPageObject {
    protected static String
            SEARCH_CONTACT_INPUT,
            RESULTS_SEARCH_CONTACT_NAME,
            RESULTS_SEARCH_CONTACT_NUMBER,
            ALL_SEARCH_RESULTS,
            NO_RESULT_SEARCH_CONTACTS,
            DND_BUTTON,
            OPEN_CONTACT_NAME,
            OPEN_CONTACT_NUMBER,
            CALL_BUTTON_IN_OPEN_CONTACT,
            BACK_BUTTON;

    public ContactsPageObject(AppiumDriver driver) {
        super(driver);
    }

    //Клик в поле поиска контактов
    public void inputSearchContactsClick() {
        this.waitForElementPresent(
                SEARCH_CONTACT_INPUT,
                "Не найдено поле поиска контактов",
                10
        );
        this.waitForElementAndClick(
                SEARCH_CONTACT_INPUT,
                "Не удалось кликнуть в поле поиска контактов",
                10
        );
    }

    //Ввод текста в поле поиска
    public void inputSearchContactsSendKeys(String text) {
        this.waitForElementAndSendKeys(
                SEARCH_CONTACT_INPUT,
                text,
                "Не удалось ввести текст в поле поиска контактов",
                10
        );
    }


    public void jfhgh(){
        this.waitForElementPresent(
                ALL_SEARCH_RESULTS,
                "Не найдены результаты поиска",
                10);
    }
    //Возвращает кол-во контактов
    public int returnsAmountOfResults() {
        int amount = this.getAmountOfElements(ALL_SEARCH_RESULTS);
        return amount;
    }

    //Сравнивает кол-во полученных результатов с ожидаемым
    public void assertAmountResults(int amount) {
        int amount_results = returnsAmountOfResults();
        --amount_results;
        System.out.println(amount_results);
        Assert.assertEquals("Количество фактических результатов не соответствует ожидаемому", amount, amount_results);
    }
    //Свайпает вниз до нужного контакта
    //переход в контакт
    //Проверка имени контакта
    //Проверка номера контакта
    //
}
