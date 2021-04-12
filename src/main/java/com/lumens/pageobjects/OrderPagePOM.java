package com.lumens.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import HCL.Hackaton_Demo2.BaseClass;

public class OrderPagePOM extends BaseClass {

	public OrderPagePOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='btn-group dropdown-group']")
	private WebElement accDrpDwn;

	@FindBy(xpath = "(//*[@class='userlogin'])[1]")
	private WebElement signinBtn;

	@FindBy(xpath = "//*[@id='dwfrm_login_username']")
	private WebElement emailTxtbox;

	@FindBy(xpath = "//*[@id='dwfrm_login_password']")
	private WebElement passTxtbox;

	@FindBy(xpath = "//*[@id='dwfrm_login_rememberme']")
	private WebElement remembermeCheckbox;

	@FindBy(xpath = "//*[@name='dwfrm_login_login']")
	private WebElement loginBtn;

	@FindBy(xpath = "//*[@class='LPMlabel']")
	private WebElement livechatBtn;

	@FindBy(xpath = "//*[@id='txt_4616424']")
	private WebElement livechatName;

	@FindBy(xpath = "//*[@id='txt_4616425']")
	private WebElement livechatEmail;

	@FindBy(xpath = "//*[@class='lp_submit_button lpc_survey-area__submit-button lpc_desktop']")
	private WebElement livechatSubmit;

	@FindBy(xpath = "//*[contains(text(),'Enter a valid email address')]")
	private WebElement errorMessage;

	@FindBy(id = "ltkpopup-close-button")
	private WebElement closePopup;

	@FindBy(xpath = "//*[text()='Cart']")
	private WebElement cartBtn;

	@FindBy(xpath = "//*[@class='qty-increment-decrement qty-decrement']")
	private WebElement removeProduct;

	@FindBy(xpath = "//*[@class='couponinput']")
	private WebElement enterPromocode;

	@FindBy(xpath = "//*[@name='dwfrm_cart_addCoupon']")
	private WebElement applyPromocode;

	@FindBy(xpath = "(//*[@class='taxCalc'])[1]")
	private WebElement enterZipcode;

	@FindBy(xpath = "(//*[@value='Go'])[1]")
	private WebElement applyZipcode;

	@FindBy(xpath = "(//*[contains(text(),'valid US ZIP Code or Canadian Postal Code')])[1]")
	private WebElement zipcodeMesage;

	@FindBy(xpath = "//*[@class='logout']")
	private WebElement signout;

	@FindBy(xpath = "//*[@id='nav-tab-01']")
	private WebElement lightingMover;

	@FindBy(xpath = "//*[text()='Ceiling Lights']")
	private WebElement cLights;

	public WebElement getClosePopup() {
		return closePopup;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public WebElement getAccDrpDwn() {
		return accDrpDwn;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}

	public WebElement getEmailTxtbox() {
		return emailTxtbox;
	}

	public WebElement getPassTxtbox() {
		return passTxtbox;
	}

	public WebElement getRemembermeCheckbox() {
		return remembermeCheckbox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getLivechatBtn() {
		return livechatBtn;
	}

	public WebElement getLivechatName() {
		return livechatName;
	}

	public WebElement getLivechatEmail() {
		return livechatEmail;
	}

	public WebElement getLivechatSubmit() {
		return livechatSubmit;
	}

	public WebElement getCartBtn() {
		return cartBtn;
	}

	public WebElement getRemoveProduct() {
		return removeProduct;
	}

	public WebElement getEnterPromocode() {
		return enterPromocode;
	}

	public WebElement getApplyPromocode() {
		return applyPromocode;
	}

	public WebElement getEnterZipcode() {
		return enterZipcode;
	}

	public WebElement getApplyZipcode() {
		return applyZipcode;
	}

	public WebElement getZipcodeMesage() {
		return zipcodeMesage;
	}

	public WebElement getSignout() {
		return signout;
	}

	public WebElement getLightingMover() {
		return lightingMover;
	}

	public WebElement getcLights() {
		return cLights;
	}
}
