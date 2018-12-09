package com.es.automation.testing.web.pages;

import com.es.automation.testing.web.pages.section.NavigationItem;
import com.es.automation.testing.web.pages.section.RoadCyclingNavItems;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.seleniumpom.annotations.Section;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ravivarmans on 4/3/2018.
 */
public class HomePage extends BasePage {

    @Section
    @FindBy(className = "top-categories-menu")
    public NavigationItem navigationItems;

    @Section
    @FindBy(css = ".top-category-menu.road-cycling")
    public RoadCyclingNavItems roadCyclingNavItems;

    public List<String> getNavigationDetails() {

        navigationItems.titleList.get(0).click();

        waitTillContentVisible();

        return roadCyclingNavItems.roadCyclingItems.get(0).title.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

}
