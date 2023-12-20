package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Desktops extends Utility {

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement positionZtoA;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement positionAtoZ;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[4]/div[3]/div/div[2]/div/h4/a")
    WebElement selectProductHPLP3065;


    public void sortByPositionZtoA() {
        selectByIndexFromDropDown(positionZtoA, 2);
    }

    public void sortByPositionAtoZ() {
        selectByIndexFromDropDown(positionAtoZ, 1);
    }

    public void setSelectProductHPLP3065(String productName) {
        clickOnElement(selectProductHPLP3065);
    }



}
