package com.es.automation.testing.web.pages.section;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageElement;

import java.util.List;

/**
 * Created by RAVIVARMANS on 08/12/2018.
 */
public class NavTitle {

    @FindBy (css = "a")
    public List<PageElement> title;

}
