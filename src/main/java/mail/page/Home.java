package mail.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Home {

    private SelenideElement sport = $(byXpath(".//li[@data-bmm='sport']"));
    private SelenideElement finance = $(byXpath(".//li[@data-bmm='finance']"));
    private SelenideElement video = $(byXpath(".//li[@data-bmm='video']"));
    private SelenideElement prikol = $(byXpath(".//li[@data-bmm='prikol']"));
    private SelenideElement auto = $(byXpath(".//li[@data-bmm='auto']"));


    //getters
    public SelenideElement getSport() {
        return sport;
    }

    public SelenideElement getFinance() {
        return finance;
    }

    public SelenideElement getVideo() {
        return video;
    }

    public SelenideElement getPrikol() {
        return prikol;
    }

    public SelenideElement getAuto() {
        return auto;
    }
}
