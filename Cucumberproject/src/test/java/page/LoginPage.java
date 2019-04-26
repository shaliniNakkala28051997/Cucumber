package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how=How.ID,using="userName")
	public static WebElement username;
	@FindBy(how=How.ID,using="password")
	public static WebElement password;
	@FindBy(how=How.CSS,using="input[value='Login']")
	public static WebElement LoginButton;
	@FindBy(how=How.CSS,using="Div[class='btn-group']")
	public static WebElement addproduct;
	@FindBy(how=How.ID,using="categorydropid")
	public static WebElement categorydropid;
	@FindBy(how=How.CSS,using="option[value='11290']")
	public static WebElement elecronics;
	@FindBy(how=How.ID,using="subcategorydropid")
	public static WebElement subcategory;
	@FindBy(how=How.CSS,using="option[value='112101']")
	public static WebElement HeadPhone;
	@FindBy(how=How.ID,using="prodid")
	public static WebElement productname;
	@FindBy (how=How.ID,using="priceid")
	public static WebElement price;
	@FindBy (how=How.ID,using="quantityid")
	public static WebElement quantity;
	@FindBy (how=How.ID,using="brandid")
	public static WebElement Brand;
	@FindBy (how=How.ID,using="description")
	public static WebElement Description;
	@FindBy (how=How.CSS,using="input[value='Add Product']")
	public static WebElement AddProduct;
	
	
	
	
	

	
    
}
