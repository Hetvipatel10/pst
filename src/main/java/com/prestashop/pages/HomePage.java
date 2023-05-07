package com.prestashop.pages;

import com.prestashop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {



    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='columns']")
    WebElement sevenproducts;

    @CacheLookup
    @FindBy(xpath = "//input[@class='search_query form-control ac_input']")
    WebElement searchbox;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default button-search']")
    WebElement searchbutton;

    @CacheLookup
    @FindBy(xpath = "//ul[@id='product_list']/li/div/div[2]/h5/a")
    WebElement blousetext;
    @CacheLookup
    @FindBy(xpath = "//ul[@id='product_list']/li[1]/div/div/div/a[1]/img")
    WebElement clickblouseimg;

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




    public void clickonsesrchbox(String searchbox1) {
        sendTextToElement(searchbox,searchbox1 );
    }

    public void clickOnsearchnButton() {
        clickOnElement(searchbutton);
    }


    public String verifyblouseText(String message) {
        return getTextFromElement(blousetext);
    }

    public  void clickonblouseimg(){
        clickOnElement(clickblouseimg);
    }

    public String Verifysevenproducts(){
        return getTextFromElement(sevenproducts);
    }

    public void clickondetailpage() {
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

