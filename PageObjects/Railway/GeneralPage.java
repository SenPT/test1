package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralPage {
    private final By tabLogin = By.xpath("//div[@id='menu']//a[@href='/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("");
    private final By _lblWelcome = By.xpath("");
    private final By tabRegister = By.xpath("//div[@id='menu']//a[@href='/Account/Register.cshtml']");
    private final By _lblMesFormResgiter = By.xpath("//p[@class='message error']");
    private final By _lblMesFormPassword = By.xpath("//li[@class= 'password']//label[@class='validation-error']");
    private final By _lbMesPID = By.xpath("//li[@class= 'pid-number']//label[@class='validation-error']");

    //Elements
    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }
    protected WebElement getTabRegister()
    {
        return Constant.WEBDRIVER.findElement(tabRegister);
    }

    protected WebElement getlblMesFormRegister()
    {
        return Constant.WEBDRIVER.findElement(_lblMesFormResgiter);
    }

    protected WebElement getlblMesFormPassword(){
        return Constant.WEBDRIVER.findElement(_lblMesFormPassword);
    }

    protected WebElement getlblMesPid(){
        return Constant.WEBDRIVER.findElement(_lbMesPID);
    }

    //methods
    public String getMesFormRegister(){
        return this.getlblMesFormRegister().getText();
    }

    public String getMesFormPass(){
        return this.getlblMesFormPassword().getText();
    }

    public String getMesPid(){
        return this.getlblMesPid().getText();
    }

    public LoginPage gotoLogin(){
        this.getTabLogin().click();
        return new LoginPage();
    }
    public RegisterPage gotoRegister(){
        this.getTabRegister().click();
        return  new RegisterPage();
    }

}
