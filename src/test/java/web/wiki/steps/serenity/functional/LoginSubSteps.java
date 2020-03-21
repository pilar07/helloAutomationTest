package web.wiki.steps.serenity.functional;

import net.thucydides.core.annotations.Step;
import web.wiki.pages.LoginAccessPage;

/**
 * Created by pilar07 on 2020-03-20.
 */
public class LoginSubSteps {
    LoginAccessPage loginAccessPage;

    @Step
    public void enter_user(String user) {
        loginAccessPage.putUser(user);
    }

    @Step
    public void enter_password(String password) {
        loginAccessPage.putPassword(password);
    }

    @Step
    public void request_to_access() {
        loginAccessPage.requestLogin();
    }
}
