package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    public void openLoginPage() {
        open("/login");
    }

    public void login(String email) {
        $("#loginFormEmailInput").shouldBe(visible).setValue(email);
        $("#loginFormSubmitButton").shouldBe(visible).click();
    }
}
