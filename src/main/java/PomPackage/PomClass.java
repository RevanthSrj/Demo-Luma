package PomPackage;

import org.openqa.selenium.By;

public class PomClass {

	public By clickSignIn = By.xpath("//li[@class=\"authorization-link\"]");
	
	public By enterEmail = By.id("email");
	
	public By enterPAssword = By.id("pass");
	
	public By clickSigInBtn = By.id("send2");
	
	public By searchBar = By.xpath("//input[@placeholder=\"Search entire store here...\"]");
	
	public By scrlDown = By.xpath("//dt[text()=\"Related search terms\"]");
	
	public By clickBag = By.xpath("//img[@alt=\"Push It Messenger Bag\"]");
	
	public By AddToComp = By.xpath("(//a[@title=\"Add to Compare\"])[6]");
	
	public By clickList = By.linkText("comparison list");
	
	public By clickPrintbtn = By.xpath("//span[text()=\"Print This Page\"]");
	
//	public By clickCancel =By.xpath("") 
	
	public By AddToCart = By.xpath("//span[text()=\"Add to Cart\"]");
	
	public By AddToWish = By.xpath("//a[@data-action=\"add-to-wishlist\"]");
	
	public By remove = By.xpath("//a[@title=\"Remove Product\"]");
	
	public By removeOK = By.xpath("//span[text()=\"OK\"]");
	
	public By cart = By.xpath("//a[@data-bind=\"scope: 'minicart_content'\"]");
	
	public By edit = By.xpath("//a[@title=\"Edit item\"]");
	
	public By update = By.xpath("//span[text()=\"Update Cart\"]");
	
	public By cartAmt = By.xpath("//td[@class=\"col price\"]");
	
	public By subtotal =By.xpath("//td[@class=\"col subtotal\"]");
	
	public By checkout = By.xpath("//span[text()=\"Proceed to Checkout\"]");
	
	public By finalPage = By.xpath("//div[text()=\"Shipping Address\"]");
	
	public By deleteItem = By.xpath("//a[@class=\"action delete\"]");
	
	public By clickOK = By.xpath("//span[text()=\"OK\"]");
	
	public By clickProfile = By.xpath("//button[@class=\"action switch\"]");
		
	public By clickSignOut = By.linkText("Sign Out");
	
}
