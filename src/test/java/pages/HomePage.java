package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    @Step("Open Expedia homepage")
    public HomePage openPage() {
        open("/");
        return this;
    }

    @Step("Check if Expedia homepage is loaded")
    public boolean isLoaded() {
        return $("body").exists();
    }
}
