package mail.cases;


import mail.page.Home;
import mail.utils.MyTestListener;
import mail.utils.Open;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Test
@Listeners({MyTestListener.class})
public class Test3 {

    Open open = new Open();
    Home home = new Home();

    public void test3() {
        System.out.println("Start>>>Test3<<<");
        open.open();
        home.getFinance().click();
        getWebDriver().getCurrentUrl().contains("finance");
        System.out.println("Finish>>>Test3<<<");
    }


}
