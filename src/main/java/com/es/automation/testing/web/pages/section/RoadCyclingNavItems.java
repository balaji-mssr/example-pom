package com.es.automation.testing.web.pages.section;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.PageSection;
import uk.sponte.automation.seleniumpom.annotations.Section;

import java.util.List;

/**
 * Created by RAVIVARMANS on 08/12/2018.
 */
public class RoadCyclingNavItems extends PageSection {

    @Section
    @FindBy (css = ".category-menu_block")
    public List<NavTitle> roadCyclingItems;



}
