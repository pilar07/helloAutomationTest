package web.wiki.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

/**
 * Created by pilar07 on 2020-03-20.
 */
@DefaultUrl("page:home.page")
public class HomePage extends PageObject {

    @FindBy(id = "pt-login")
    private WebElementFacade linkAccess;

    public void request_access() {
        linkAccess.click();
    }



}
