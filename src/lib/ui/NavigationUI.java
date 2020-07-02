package lib.ui;

import io.appium.java_client.AppiumDriver;

public class NavigationUI extends MainPageObject {
    protected static String
            PAGE_HISTORY,
            PAGE_DIALPAD,
            PAGE_CONTACTS,
            PAGE_PROFILE,
            BUTTON_DND;


    public NavigationUI(AppiumDriver driver) {
        super(driver);
    }

    //Переход на вкладку истории
    public void openPageHistory() {
            this.waitForElementAndClick(
                    PAGE_HISTORY,
                    "Не удалось кликнуть на кнопку перехода на страницу истории. ",
                    10
            );
    }

    //Переход на вкладку нобора
    public void openPageDialpad() {
            this.waitForElementAndClick(
                    PAGE_DIALPAD,
                    "Не удалось кликнуть на кнопку перехода на страницу набора. ",
                    10
            );
    }

    //Переход на вкладку контактов
    public void openPageContacts() {
            this.waitForElementAndClick(
                    PAGE_CONTACTS,
                    "Не удалось кликнуть на кнопку перехода на страницу контактов. ",
                    10
            );
    }

    //Переход на вкладку профиля
    public void openPageProfile() {
            this.waitForElementAndClick(
                    PAGE_PROFILE,
                    "Не удалось кликнуть на кнопку перехода на страницу профиля. ",
                    10
            );
    }

    //Клик на ДНД
    public void clickButtonDND() {
        this.waitForElementAndClick(
                BUTTON_DND,
                "Не удалось кликнуть на кнопку DND ",
                10
        );
    }
}


