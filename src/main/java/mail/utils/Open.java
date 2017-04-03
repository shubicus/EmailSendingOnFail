package mail.utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.*;

public class Open {

    public void open() {
        Selenide.open("http://www.bigmir.net/");
        $(byXpath(".//*[@class='b-header__logo']")).waitUntil(Condition.visible, 30000);
    }
}
