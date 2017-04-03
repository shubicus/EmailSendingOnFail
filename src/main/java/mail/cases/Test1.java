package mail.cases;


import com.codeborne.selenide.testng.GlobalTextReport;
import com.codeborne.selenide.testng.TextReport;
import mail.page.Home;
import mail.utils.MyTestListener;
import mail.utils.Open;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.url;

@Test
@Listeners({MyTestListener.class, GlobalTextReport.class})
public class Test1 {

    Open open = new Open();
    Home home = new Home();


    public void test1() {
        System.out.println("Start>>>Test1<<<");
        open.open();
        home.getSport().click();
        url().contains("http://sport.bigmir.net/");
        System.out.println("Finish>>>Test1<<<");
    }


}
