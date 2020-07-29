package Railway;

import Constant.Constant;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends GeneralPage {
    private final By _txtEmail = By.xpath("//input[@id='email']");
    private final By _txtPassword = By.xpath("//input[@id='password']");
    private final By _txtConfirmPass = By.xpath("//input[@id='confirmPassword']");
    private final By _txtPid = By.xpath("//input[@id='pid']");
    private final By _btnRegister = By.xpath("//input[@value='Register']");

    //Elements
    public WebElement gettxtEmail(){
        return Constant.WEBDRIVER.findElement(_txtEmail);
    }

    public WebElement gettxtPassword(){
        return Constant.WEBDRIVER.findElement(_txtPassword);
    }

    public WebElement gettxtConFirmPass(){
        return Constant.WEBDRIVER.findElement(_txtConfirmPass);
    }
    public WebElement gettxtPid(){
        return Constant.WEBDRIVER.findElement(_txtPid);
    }
    public WebElement getbtnRegister(){
        return  Constant.WEBDRIVER.findElement(_btnRegister);
    }

    public HomePage register(String email, String password, String confirmPass, String pId)
    {
     this.gettxtEmail().sendKeys(email);
     this.gettxtPassword().sendKeys(password);
     this.gettxtConFirmPass().sendKeys(confirmPass);
     this.gettxtPid().sendKeys(pId);

     return new HomePage();
    }
}
