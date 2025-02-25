package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class ExpediaTests extends BaseTest {

    @Test
    void openExpediaHomePage() {
        HomePage homePage = new HomePage().openPage();
        assertTrue(homePage.isLoaded(), "Expedia homepage is not loaded");
    }
}
