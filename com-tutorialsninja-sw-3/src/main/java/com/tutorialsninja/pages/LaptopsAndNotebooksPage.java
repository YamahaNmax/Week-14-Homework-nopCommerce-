package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopsAndNotebooksPage extends Utility {

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement highToLow;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[4]/div[4]/div[1]/div[2]/div[1]/h4/a")
    WebElement selectProductMacbook;

    public void setHighToLow() {
        selectByIndexFromDropDown(highToLow, 4);
    }

    public void setSelectProductMacbook() {
        clickOnElement(selectProductMacbook);
    }




}
