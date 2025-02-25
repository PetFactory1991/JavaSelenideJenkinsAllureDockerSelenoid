package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    protected void setup() {
        Configuration.baseUrl = "https://www.expedia.com";
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
//        Configuration.browserCapabilities.setCapability("enableVNC", true);
//        Configuration.browserCapabilities.setCapability("enableVideo", true);

        // Логика для локального или удаленного запуска
        String remoteUrl = System.getProperty("remote");
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
        }
    }
}
