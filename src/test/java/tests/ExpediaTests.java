package tests;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

public class ExpediaTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();

    @Test
    void openExpediaHomePageTest() {
        HomePage homePage = new HomePage().openPage();
        assertTrue(homePage.isLoaded(), "Expedia homepage is not loaded");
    }

    @Test
    public void testSearchHotelTest() {
        loginPage.openLoginPage();
        // loginPage.login("testuser@example.com");
        // searchPage.searchHotel("New York");
    }
}
