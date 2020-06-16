package lib.ui;

import io.appium.java_client.AppiumDriver;

public class NavigationUI extends MainPageObject {
    protected static String
            PAGE_HISTORY_FROM_CONTACTS,
            PAGE_HISTORY_FROM_DIALPAD,
            PAGE_HISTORY_FROM_PROFILE,
            PAGE_DIALPAD_FROM_HISTORY,
            PAGE_DIALPAD_FROM_CONTACTS,
            PAGE_DIALPAD_FROM_PROFILE,
            PAGE_CONTACTS_FROM_HISTORY,
            PAGE_CONTACTS_FROM_DIALPAD,
            PAGE_CONTACTS_FROM_PROFILE,
            PAGE_PROFILE_FROM_CONTACTS,
            PAGE_PROFILE_FROM_DIALPAD,
            PAGE_PROFILE_FROM_HISTORY,
            BUTTON_DND;


    public NavigationUI(AppiumDriver driver) {
        super(driver);
    }

    //Переход на вкладку истории
    public void openPageHistory() {
        if (this.isElementPresent(PAGE_HISTORY_FROM_CONTACTS)) {
            this.waitForElementAndClick(
                    PAGE_HISTORY_FROM_CONTACTS,
                    "Не удалось кликнуть на кнопку перехода на страницу истории. ",
                    10
            );
        }
        if (this.isElementPresent(PAGE_HISTORY_FROM_DIALPAD)) {
            this.waitForElementAndClick(
                    PAGE_HISTORY_FROM_DIALPAD,
                    "Не удалось кликнуть на кнопку перехода на страницу истории. ",
                    10
            );
        }
        else {
            this.waitForElementAndClick(
                    PAGE_HISTORY_FROM_PROFILE,
                    "Не удалось кликнуть на кнопку перехода на страницу истории. ",
                    10
            );
        }
    }

    //Переход на вкладку нобора
    public void openPageDialpad() {
        if (this.isElementPresent(PAGE_DIALPAD_FROM_HISTORY)) {
            this.waitForElementAndClick(
                    PAGE_DIALPAD_FROM_HISTORY,
                    "Не удалось кликнуть на кнопку перехода на страницу набора. ",
                    10
            );
        }
        if (this.isElementPresent(PAGE_DIALPAD_FROM_CONTACTS)) {
            this.waitForElementAndClick(
                    PAGE_DIALPAD_FROM_CONTACTS,
                    "Не удалось кликнуть на кнопку перехода на страницу набора. ",
                    10
            );
        }
       else {
            this.waitForElementAndClick(
                    PAGE_DIALPAD_FROM_PROFILE,
                    "Не удалось кликнуть на кнопку перехода на страницу набора. ",
                    10
            );
        }
    }

    //Переход на вкладку контактов
    public void openPageContacts() {
        if (this.isElementPresent(PAGE_CONTACTS_FROM_HISTORY)) {
            this.waitForElementAndClick(
                    PAGE_CONTACTS_FROM_HISTORY,
                    "Не удалось кликнуть на кнопку перехода на страницу набора. ",
                    10
            );
        }
        if (this.isElementPresent(PAGE_CONTACTS_FROM_DIALPAD)) {
            this.waitForElementAndClick(
                    PAGE_CONTACTS_FROM_DIALPAD,
                    "Не удалось кликнуть на кнопку перехода на страницу набора. ",
                    10
            );
        }
        else {
            this.waitForElementAndClick(
                    PAGE_CONTACTS_FROM_PROFILE,
                    "Не удалось кликнуть на кнопку перехода на страницу набора. ",
                    10
            );
        }
    }

    //Переход на вкладку профиля
    public void openPageProfile() {
        if (this.isElementPresent(PAGE_PROFILE_FROM_CONTACTS)) {
            this.waitForElementAndClick(
                    PAGE_PROFILE_FROM_CONTACTS,
                    "Не удалось кликнуть на кнопку перехода на страницу профиля. ",
                    10
            );
        }
        if (this.isElementPresent(PAGE_PROFILE_FROM_DIALPAD)) {
            this.waitForElementAndClick(
                    PAGE_PROFILE_FROM_DIALPAD,
                    "Не удалось кликнуть на кнопку перехода на страницу профиля. ",
                    10
            );
        }
        else {
            this.waitForElementAndClick(
                    PAGE_PROFILE_FROM_HISTORY,
                    "Не удалось кликнуть на кнопку перехода на страницу профиля. ",
                    10
            );
        }
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


