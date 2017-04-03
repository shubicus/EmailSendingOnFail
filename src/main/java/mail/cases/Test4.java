package mail.cases;

import com.codeborne.selenide.Condition;
import mail.page.Home;
import mail.utils.MyTestListener;
import mail.utils.Open;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Test
@Listeners({MyTestListener.class})
public class Test4 {

    Open open = new Open();
    Home home = new Home();

    public void test4() {
        System.out.println("Start>>>Test4<<<");
        open.open();
        home.getPrikol().click();
        getWebDriver().getCurrentUrl().contains("prikol");
        System.out.println("Finish>>>Test4<<<");
    }


}
