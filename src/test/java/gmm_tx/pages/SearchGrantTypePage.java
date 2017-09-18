package gmm_tx.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// there's a better way to do this that leaves out http://ui-dev.ocp-apps.bahincubator.com

@DefaultUrl("http://ui-dev.ocp-apps.bahincubator.com/Application/applicationsLanding")
//@DefaultUrl("http://localhost:8080/Application/searchGrantTypes")

public class SearchGrantTypePage extends PageObject {
	
//	@FindBy(id="selectGrantType")
	@FindBy(xpath = "/html/body/div/div/app-root/app-application/search-grant-type/div/div[2]/div/div/ng-select")
	WebElementFacade searchGrantType_dropdown;
	
//	@FindBy(id="setGrantTypeSubmit")   
	@FindBy(xpath = "/html/body/div/div/app-root/app-application/search-grant-type/div/div[2]/div/div/div/button")
	WebElementFacade selectGrantType_bn_submit;

//	public void selectGrantType(String grantType) {
//        searchGrantType_dropdown.selectByVisibleText(grantType);
//	}	
	public void clickGrantTypeSubmitButton() {
        selectGrantType_bn_submit.click();
		    			    		}
	
//	@FindBy(xpath = "//ng-select[@id='selectGrantType']")
//    WebElementFacade searchGrantType_dropdown;

//public void selectGrantType(String grantType) {
//    searchGrantType_dropdown.click();
//    WebElementFacade grantTypeDropDown = find(By.xpath("/html/body/div/div/app-root/app-application/search-grant-type/div/div[2]/div/div/ng-select/select-dropdown"));
//    grantTypeDropDown.selectByVisibleText(grantType);
//}
	public void selectGrantType(String grantType) {
	    searchGrantType_dropdown.click();
	    WebElementFacade grantTypeDropDown = find(By.xpath("//ng-select[@placeholder='Select Grant Type']"));
	    grantTypeDropDown.find(By.xpath("//span[contains(text(), 'Flood Recovery Grant')]")).click();
	}

}