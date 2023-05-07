package com.prestashop.pages;

import com.prestashop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productdetailpage extends Utility {



    private static final Logger log = LogManager.getLogger(Productdetailpage.class.getName());

    public Productdetailpage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@id='product_list']/li/div/div[1]/div/a[2]")
    WebElement detailedpage;
    ////ul[@id='homefeatured']/li[1]/div[1]/div/div/a[2]/span[contains(text(),'Quick view')]
    @CacheLookup
    @FindBy(xpath = "//p[@id='product_reference']/span[@class='editable']")
    WebElement descriptionofproduct;

    @CacheLookup
    @FindBy(xpath = "//p[@id='add_to_cart']")
    WebElement addingproducttocart;

    @CacheLookup
    @FindBy(xpath = "//span[@class='title']/span[2]")
    WebElement iteminthecart;





    public void clickOndetailedpage() {
        clickOnElement(detailedpage);
    }

    public String verifydescriptionofproductText() {
        String message = getTextFromElement(descriptionofproduct);
        log.info("Getting text from : " +  descriptionofproduct.toString());
        return message;
    }
    public void clickOnaddingproducttocart() {
        clickOnElement(addingproducttocart);
    }


    public String verifyTextinaddtocartpage() {
        String message = getTextFromElement(iteminthecart);
        log.info("Getting text from : " + iteminthecart.toString());
        return message;
    }
}

