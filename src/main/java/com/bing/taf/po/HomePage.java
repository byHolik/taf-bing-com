package com.bing.taf.po;

import com.bing.taf.utils.Driver;
import com.bing.taf.utils.Resources;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
    private String acceptCookiesButtonId = "bnp_btn_accept";
    private String searchInputId = "sb_form_q";
    private String searchButtontId = "search_icon";
    private String resultListXPath = "//*[@id='b_results']//h2/a";

    public HomePage clickAcceptCookiesButton() {
        new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(Resources.SEC))
                .until(ExpectedConditions.presenceOfElementLocated(By.id(acceptCookiesButtonId)))
                .click();
        return this;
    }
    public HomePage clickSearchButton() {
        new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(Resources.SEC))
                .until(ExpectedConditions.presenceOfElementLocated(By.id(searchButtontId)))
                .click();
        return this;
    }

    public HomePage typeTextSearchInput() {
        new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(Resources.SEC))
                .until(ExpectedConditions.presenceOfElementLocated(By.id(searchInputId)))
                .sendKeys(Resources.SEARCH_TEXT);
        return this;
    }

    public List<WebElement> getResultHeaderList() {
         return new WebDriverWait(Driver.getWebDriver(), Duration.ofSeconds(Resources.SEC))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(resultListXPath)));
    }
}
