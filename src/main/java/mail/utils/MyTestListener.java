package mail.utils;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import javax.mail.MessagingException;


public class MyTestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult var1) {
        try {
            Email.email();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
