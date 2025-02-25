package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    @Step("Open login page")
    public void openLoginPage() {
        open("/login");
    }

    @Step("Login with email {email}")
    public void login(String email) {
        $("#loginFormEmailInput").shouldBe(visible).setValue(email);
        $("#loginFormSubmitButton").shouldBe(visible).click();
    }
}
