package pages;

import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    public void searchHotel(String destination) {
        $("#destination").setValue(destination);
        $("#search-button").click();
    }
}
