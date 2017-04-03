package mail.cases;


import mail.page.Home;
import mail.utils.MyTestListener;
import mail.utils.Open;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Test
@Listeners({MyTestListener.class})
public class Test2 {

    Open open = new Open();
    Home home = new Home();

    public void test2() {
        System.out.println("Start>>>Test2<<<");
        open.open();
        home.getAuto().click();
        getWebDriver().getCurrentUrl().contains("auto");
        System.out.println("Finish>>>Test2<<<");
    }


}
