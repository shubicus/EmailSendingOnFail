package mail.cases;


import mail.page.Home;
import mail.utils.MyTestListener;
import mail.utils.Open;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Test
@Listeners({MyTestListener.class})
public class Test5 {

    Open open = new Open();
    Home home = new Home();

    public void test5() {
        System.out.println("Start>>>Test5<<<");
        open.open();
        home.getVideo().click();
        getWebDriver().getCurrentUrl().contains("video");
        System.out.println("Finish>>>Test5<<<");
    }


}
