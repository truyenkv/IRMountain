package IRMountain;

import net.thucydides.core.annotations.Steps;

import org.openqa.selenium.Keys;

import IRMountain.steps.LoginSteps;
import IRMountain.steps.PortalServiceCatalogStep;
import cucumber.api.java.en.Given;

public class IronMain {
	
	@Steps
	LoginSteps loginSt;
	
	@Steps
	PortalServiceCatalogStep catalogSt;
	
	@Given("^Open \"([^\"]*)\"$")
	public void open(String url) {
		loginSt.accessUrl(url);
	}

	@Given("^Login site by \"([^\"]*)\" and \"([^\"]*)\" account\\.$")
	public void login_site_by_and_account(String username, String password) {
		 loginSt.input_username(username);
		 loginSt.input_password(password);
		 loginSt.click_On_Loginbtn();
	}
	
	@Given("^Go to Service Catalog screen\\.$")
	public void go_to_Service_Catalog_screen() {
	    loginSt.click_On_ServiceCatalog();
	}

	@Given("^Take searchs with keyword \"([^\"]*)\" and go to service detail$")
	public void take_searchs_with_keyword_and_go_to_service_detail(String keyword) {
	    catalogSt.enter_keyword(keyword);
	}


}
