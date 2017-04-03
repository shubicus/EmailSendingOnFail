package mail;

import java.io.IOException;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import mail.cases.*;
import org.testng.TestNG;

import javax.mail.MessagingException;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Main {

    static {
//        ChromeDriverManager.getInstance().setup();
        PhantomJsDriverManager.getInstance().setup();
        Configuration.browser = "phantomjs";
//        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
    }

    public static void main(String[] args) throws IOException, MessagingException {

        TestNG testng = new TestNG();
        testng.setTestClasses(new Class[]{Test1.class, Test2.class, Test3.class, Test4.class, Test5.class});
        testng.run();

        getWebDriver().quit();
    }


}
