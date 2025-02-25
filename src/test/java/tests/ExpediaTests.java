package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

import static org.testng.Assert.assertTrue;

public class ExpediaTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    SearchPage searchPage = new SearchPage();


    @Test
    void openExpediaHomePage() {
        HomePage homePage = new HomePage().openPage();
        assertTrue(homePage.isLoaded(), "Expedia homepage is not loaded");
    }


    @Test
    public void testSearchHotel() {
        loginPage.openLoginPage();
//        loginPage.login("testuser@example.com");
//        searchPage.searchHotel("New York");
    }
}
