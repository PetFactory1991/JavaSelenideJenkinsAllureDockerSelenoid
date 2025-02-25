package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import io.qameta.allure.testng.AllureTestNg;
import listeners.RetryListener;
import listeners.TestListener;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;


@Listeners({AllureTestNg.class, TestListener.class, RetryListener.class})
public class BaseTest {

    @BeforeSuite
    protected void setup() {
        System.setProperty("allure.results.directory", "target/allure-results");
        String browser = System.getProperty("browser", "chrome");
        Configuration.baseUrl = "https://www.expedia.com";
        Configuration.browser = browser;
        Configuration.timeout = 10000;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true));

        // Логика для локального или удаленного запуска
        String remoteUrl = System.getProperty("remote");
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
        }
    }
}
