package com_professional.sample_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageObjects {
	
	
	 WebDriver driver;

	public HomePageObjects (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(css="[title='Faded Short Sleeve T-shirts']")
	WebElement sleeveTshirt;
	
	@FindBy(css="[title='Blouse']")
	WebElement blouse;
	
	
	@FindBy(css="[title='Printed Dress']")
	WebElement dress;
	
	@FindBy(css="[title='//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[1]']")
	WebElement dress1;
	
	@FindBy(css="[title='Printed Chiffon Dress']")
	WebElement chiffondress;
	
	@FindBy(css="[title='My Store']")
	WebElement MyStore;
	
	
	@FindBy(id="add_to_cart")
	WebElement AddToCart ;
	
	@FindBy(css="[title='Continue shopping']")
	WebElement ContinueShopping;
	
	@FindBy(css="[title='Proceed to checkout']")
	WebElement ProceedCheckOut;
	
	@FindBy(xpath="//*[@id=\'center_column\']/p[2]/a[1]/span")
	WebElement ProceedCheckOut1;
	
	@FindBy(xpath="//*[@id=\'center_column\']/form/p/button/span")
	WebElement Proceed;
	
	@FindBy(xpath="//*[@id=\'form\']/p/button/span")
	WebElement Continue;
	
	@FindBy(id="cgv")
	WebElement Agree;
	
	@FindBy(css="[title='Log me out']")
	WebElement LogOut;
	
	@FindBy(xpath="//a[contains(text(),'Blouses')]")
	WebElement Blouse;
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	WebElement AddCart;
	
	@FindBy(xpath="//a[contains(text(),'Women')]")
	WebElement WomenTab;
	
	public WebElement MyStores() {
		return MyStore;
	}
	
	public WebElement ProccedToCheckOut1() {
		return ProceedCheckOut1;
	}
	
	public WebElement Procced() {
		return Proceed;
	}
		
	public WebElement Continue() {
			return Continue;
	}
	
	public WebElement Agree() {
		return Agree;
 }
	
	public WebElement LogOut() {
		return LogOut;
 }
	
	
	
	public WebElement AddToCart() {
		return AddToCart;
	}
	
	public WebElement ContinueShopping() {
		return ContinueShopping;
	}
	
	public WebElement ProccedCheckOut() {
		return ProceedCheckOut;
	}
	
	public WebElement Dress() {
		return dress;
	}
	
	public WebElement Dress1() {
		return dress1;
	}
	
	public WebElement Chifondress() {
		return chiffondress;
	}
	
	public WebElement Blouse() {
		return Blouse;
	}
	
	public WebElement AddCart() {
		return AddCart;
	}
	
	public WebElement WomenTab() {
		return WomenTab;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
